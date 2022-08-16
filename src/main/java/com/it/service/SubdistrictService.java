package com.it.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.dto.SubdistrictDto;
import com.it.entity.SubdistrictEntity;
import com.it.repository.SubdistrictRepository;

@Service

public class SubdistrictService {
	
	@Autowired
	private ModelMapper modelMapper ;
	
	@Autowired
	private SubdistrictRepository subdistrictRepository ;
	
	public List<SubdistrictDto> findSubdistrictAll() {
		List<SubdistrictEntity>subdistrictEntities = subdistrictRepository.findAll() ;
	   return modelMapper.map(subdistrictEntities, new TypeToken<List<SubdistrictDto>>() {}.getType());
	    
		
	}
	
	public SubdistrictDto findSubdistrictBySdtId(Integer sdtId) {
		Optional<SubdistrictEntity> sdtOtn = subdistrictRepository.findById(sdtId);
		if (sdtOtn.isPresent()) {
			return modelMapper.map(sdtOtn.get(), new TypeToken<SubdistrictDto>() {}.getType());
		}
		
		return null;
	 }
	
	public boolean saveSubdistrict(SubdistrictDto subdistrictDto) {
		boolean saveFig = false;
		try {
			SubdistrictEntity entity = modelMapper.map(subdistrictDto,SubdistrictEntity.class);	
			subdistrictRepository.save(entity);
			saveFig = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return saveFig;
	}
	
	public boolean updateSubdistrictBySdtId(Integer sdtId,SubdistrictDto subdistrictDto) {
		boolean updateFig = false;
		try {
			//
			Optional<SubdistrictEntity> sdtOtn = subdistrictRepository.findById(sdtId);
			if(sdtOtn.isPresent()) {
				SubdistrictEntity entity = modelMapper.map(subdistrictDto,SubdistrictEntity.class);	
				subdistrictRepository.save(entity);
				updateFig = true;
			}						
		} catch (Exception e) {
			e.printStackTrace();
		}
		return updateFig;
	}
	
	public boolean deleteSubdistrictBySdtId(Integer sdtId) {
		boolean deleteFig = false;
		try {
				subdistrictRepository.deleteById(sdtId);
				deleteFig = true;								
		} catch (Exception e) {
			e.printStackTrace();
		}
		return deleteFig;
	}


}
