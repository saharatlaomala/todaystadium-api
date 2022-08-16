package com.it.dto;

import java.io.Serializable;


import lombok.Data;

@Data

public class SubdistrictDto implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = -1177930361221657934L;
	private Integer sdtId;
	private String sdtNameth;
	private String sdtNameeng;
	private String zipCode;
	private Integer disId;

}
