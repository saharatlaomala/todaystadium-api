package com.it.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.it.dto.ProvinceDto;
import com.it.service.ProvinceService;


@RestController
@RequestMapping("/v1/Province")

public class ProvinceController {
	@Autowired
	private ProvinceService provinceService; 
	
	@Autowired
	
	@GetMapping
	public ResponseEntity<Object> getProvinceAll() {
		return ResponseEntity.ok(provinceService.findProvinceAll());

}
	
	@GetMapping("/{pvnId}")
	public ResponseEntity<Object> getProvinceByPvnId(@PathVariable(name = "pvnId")Integer pvnId) {
		return ResponseEntity.ok(provinceService.findProvinceByPvnId(pvnId));
	}
	
	@PostMapping
	public ResponseEntity<Object> saveProvince(@RequestBody ProvinceDto provinceDto) {
		return ResponseEntity.ok(provinceService.saveProvince(provinceDto));
	}
	@PutMapping("/{pvnId}")
	public ResponseEntity<Object> updateProvince(
			@PathVariable(name = "pvnId") Integer pvnId,
			@RequestBody ProvinceDto provinceDto) {
		return ResponseEntity.ok(provinceService.updateProvinceByPvnId(pvnId, provinceDto));
	}
	
	@DeleteMapping("/{pvnId}") //
	public ResponseEntity<Object> deleteProvinceByPvnId(@PathVariable(name = "pvnId") Integer pvnId){
	return ResponseEntity.ok(provinceService.deleteProvinceByPvnId(pvnId));
}
	
}



