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
@Table(name="tb_province")
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class ProvinceEntity implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = -2173619212316862548L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "pvn_id")
	private Integer pvnId;
	
	 @Column(name = "pvn_code")
	private String pvnCode;
	 
	 @Column(name = "pvn_name_th")
	private String pvnNameth;
	 
	 @Column(name = "pvn_name_eng")
	private String pvnNameeng;
	 
	 @Column(name = "area")
		private String area;

}
