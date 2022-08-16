package com.it.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table (name="tb_sub_district")
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class SubdistrictEntity implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 8775438775549935689L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name = "sdt_id")
	private Integer sdtId;
	
	 @Column(name = "sdt_name_th")
	private String sdtNameth;
	 
	 @Column(name = "sdt_name_eng")
	private String sdtNameeng;
	 
	 @Column(name = "zip_code")
	private String zipCode;
	 
	 @Column(name = "dis_id")
		private Integer disId;

}
