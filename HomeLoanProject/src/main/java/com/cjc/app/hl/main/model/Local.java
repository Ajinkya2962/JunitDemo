package com.cjc.app.hl.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Local {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int locId;
	private String areaname;
	private String cityname;
	private String district;
	private String state;
	private double pincode;
	private int houseNo;
	private String streetName;


}
