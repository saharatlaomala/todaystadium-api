package com.it.dto;

import java.io.Serializable;


import lombok.Data;

@Data

public class ProvinceDto implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 6267529581778056129L;
	private Integer pvnId;
	private String pvnCode;
	private String pvnNameth;
	private String pvnNameeng;
	private String area;

}
