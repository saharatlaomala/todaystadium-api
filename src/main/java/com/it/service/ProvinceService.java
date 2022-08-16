package com.it.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.dto.ProvinceDto;

import com.it.entity.ProvinceEntity;
import com.it.repository.ProvinceRepository;

@Service
public class ProvinceService {
	
	@Autowired
	private ModelMapper modelMapper ;
	
	@Autowired
	private ProvinceRepository provinceRepository ;
	
	public List<ProvinceDto> findProvinceAll() {
		List<ProvinceEntity>provinceEntities = provinceRepository.findAll() ;
	   return modelMapper.map(provinceEntities, new TypeToken<List<ProvinceDto>>() {}.getType());
	    
		
	}
	
	public ProvinceDto findProvinceByPvnId(Integer pvnId) {
		Optional<ProvinceEntity> pvnOtn = provinceRepository.findById(pvnId);
		if (pvnOtn.isPresent()) {
			return modelMapper.map(pvnOtn.get(), new TypeToken<ProvinceDto>() {}.getType());
		}
		
		return null;
	 }
	
	public boolean saveProvince(ProvinceDto provinceDto) {
		boolean saveFig = false;
		try {
			ProvinceEntity entity = modelMapper.map(provinceDto,ProvinceEntity.class);	
			provinceRepository.save(entity);
			saveFig = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return saveFig;
	}
	
	public boolean updateProvinceByPvnId(Integer pvnId,ProvinceDto provinceDto) {
		boolean updateFig = false;
		try {
			//
			Optional<ProvinceEntity> pvnOtn = provinceRepository.findById(pvnId);
			if(pvnOtn.isPresent()) {
				ProvinceEntity entity = modelMapper.map(provinceDto,ProvinceEntity.class);	
				provinceRepository.save(entity);
				updateFig = true;
			}						
		} catch (Exception e) {
			e.printStackTrace();
		}
		return updateFig;
	}
	
	public boolean deleteProvinceByPvnId(Integer pvnId) {
		boolean deleteFig = false;
		try {
				provinceRepository.deleteById(pvnId);
				deleteFig = true;								
		} catch (Exception e) {
			e.printStackTrace();
		}
		return deleteFig;
	}


}
