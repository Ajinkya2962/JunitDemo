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
public class DependentInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int depId;
	private String fatherName;
	private String motherName;
	private int noOfFamilyMember;
	private int noOfChild;
	private String maritalStatus;
	private int dependantMember;
	private double familyIncome;
	private String spouseName;

}
