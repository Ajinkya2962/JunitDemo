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

public class PropertyAddress 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int proId;
	private String proAreaname;
	private String proCityname;
	private String proDistrict;
	private String proState;
	private double proPincode;
	private String proStreetName;







}
