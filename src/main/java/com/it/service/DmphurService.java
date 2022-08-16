package com.it.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.dto.DmphurDto;
import com.it.entity.DmphurEntity;
import com.it.repository.DmphurRepository;


@Service

public class DmphurService {
	@Autowired
	private ModelMapper modelMapper ;
	
	@Autowired
	private DmphurRepository dmphurRepository ;
	
	public List<DmphurDto> findDmphurAll() {
		List<DmphurEntity>dmphurEntities = dmphurRepository.findAll() ;
	   return modelMapper.map(dmphurEntities, new TypeToken<List<DmphurDto>>() {}.getType());
	    
		
	}
	
	public DmphurDto findDmphurByDisId(Integer disId) {
		Optional<DmphurEntity> dmphurOtn = dmphurRepository.findById(disId);
		if (dmphurOtn.isPresent()) {
			return modelMapper.map(dmphurOtn.get(), new TypeToken<DmphurDto>() {}.getType());
		}
		
		return null;
	 }
	
	public boolean saveDmphur(DmphurDto dmphurDto) {
		boolean saveFig = false;
		try {
			DmphurEntity entity = modelMapper.map(dmphurDto,DmphurEntity.class);	
			dmphurRepository.save(entity);
			saveFig = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return saveFig;
	}
	
	public boolean updateDmphurByDisId(Integer disId,DmphurDto dmphurDto) {
		boolean updateFig = false;
		try {
			//
			Optional<DmphurEntity> dmphurOtn = dmphurRepository.findById(disId);
			if(dmphurOtn.isPresent()) {
				DmphurEntity entity = modelMapper.map(dmphurDto,DmphurEntity.class);	
				dmphurRepository.save(entity);
				updateFig = true;
			}						
		} catch (Exception e) {
			e.printStackTrace();
		}
		return updateFig;
	}
	
	public boolean deleteDmphurByDisId(Integer disId) {
		boolean deleteFig = false;
		try {
				dmphurRepository.deleteById(disId);
				deleteFig = true;								
		} catch (Exception e) {
			e.printStackTrace();
		}
		return deleteFig;
	}

	}



