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
@Table (name="tb_dmphur")
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class DmphurEntity implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 5615099517335773578L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "dis_id")
	private Integer disId;
	
	 @Column(name = "dis_code")
	private String disCode;
	 
	 @Column(name = "dis_name_th")
	private String disNameth;
	 
	 @Column(name = "dis_name_eng")
		private String disNameeng;
	 
	 @Column(name = "pvn_id")
		private String pvnId;
	

}
