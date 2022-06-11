package com.cjc.app.hl.main.model;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cusId;
	private int cusdocId;
	private String cusName;
	private String cusDOB;
	private  int cusAge;
	private String cusGender;
	private String cusEmail;
	private double cusMobileNo;
	private double cusAltMobileNo;
	private double cusTotalLoanRequired;
	private String cusEducationalInfo;
	private double cusDownPayment;
	private double cusActualLoanAmt;
	private int cuslLoanTenure;
	
	@OneToOne(cascade=CascadeType.ALL)
	private PropertyInfo cusPropertyInfo;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Address cusAddress;
	
	@OneToOne(cascade=CascadeType.ALL)
	private AccountDetails cusAccountDetails;
	
	@OneToOne(cascade=CascadeType.ALL)
	private  DependentInfo cusDependentInfo;
	
	@OneToMany(cascade=CascadeType.ALL)
	private Set<GuarantorDetails>  cusGuarantorDetails =new HashSet<>();
	
	@OneToMany(cascade=CascadeType.ALL)
	private Set<PreviousLoan>  cusPreviousLoan=new HashSet<>();











}
