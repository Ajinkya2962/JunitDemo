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
public class GuarantorDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int guaId;
	private String guaName;
	private String guaDateofBirth;
	private String guaRelationWithCustomer;
	private Double guaMobileNo;
	private Double guaAdharCardNo;
	private String guaJobDetails;
	private String guaAddress;
	private String guaNearPoliceStation;

}
