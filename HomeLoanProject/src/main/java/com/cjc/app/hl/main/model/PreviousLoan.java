package com.cjc.app.hl.main.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class PreviousLoan {
	@Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 private int preloanid;
	 private double preloanAmount;
	 private int preloanTenure;
	 private double preloanPaidAmount;
	 private double preloanRemainingAmount;
	 private String preloanBankName;
	 private String preloanMICRcode;
	 private String preloanStatus;
	 private String preloanRemark;

}
