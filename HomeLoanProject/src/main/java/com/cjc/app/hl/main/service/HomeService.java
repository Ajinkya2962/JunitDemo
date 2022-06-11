package com.cjc.app.hl.main.service;

import java.util.List;

import com.cjc.app.hl.main.model.Address;
import com.cjc.app.hl.main.model.CustomerDetails;
import com.cjc.app.hl.main.model.Local;
import com.cjc.app.hl.main.model.Permanent;
import com.cjc.app.hl.main.model.PropertyAddress;
import com.cjc.app.hl.main.model.PropertyInfo;

public interface HomeService {

//	void insertData(Local cd);

//	List<Local> getData();

//	void insertData(Permanent cd);

//	List<Permanent> getData();

//	void insertData(Address cd);
//	List<Address> getData();

//	void insertData(PropertyAddress cd);
//	List<PropertyAddress> getData();

//	void insertData(PropertyInfo cd);
//	List<PropertyInfo> getData();

//	void insert(List<CustomerDetails> cd);
	void insertData(CustomerDetails cd);
	List<CustomerDetails> getData();
	void deleteData(int id);
	CustomerDetails getSingleData(int id);
	CustomerDetails insert(CustomerDetails cd);
	

}
