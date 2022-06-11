package com.cjc.app.hl.main.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.app.hl.main.model.Address;
import com.cjc.app.hl.main.model.CustomerDetails;
import com.cjc.app.hl.main.model.Local;
import com.cjc.app.hl.main.model.Permanent;
import com.cjc.app.hl.main.model.PropertyAddress;
import com.cjc.app.hl.main.model.PropertyInfo;
import com.cjc.app.hl.main.repository.AddressRepository;
import com.cjc.app.hl.main.repository.CustomerDetailsRepository;
import com.cjc.app.hl.main.repository.LocalRepository;
import com.cjc.app.hl.main.repository.PermanentRepository;
import com.cjc.app.hl.main.repository.PropertyAddressRepository;
import com.cjc.app.hl.main.repository.PropertyInfoRepository;
import com.cjc.app.hl.main.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService 
{
	@Autowired
	CustomerDetailsRepository cr;
//	@Autowired
//	PropertyInfoRepository pr;
//	@Autowired
//	PropertyAddressRepository par;
//	@Autowired
//	AddressRepository ar;
//	@Autowired
//	PermanentRepository per;
//	@Autowired
//	LocalRepository lr;
//	@Override
//	public void insertData(Address cd) {
//		ar.save(cd);
//		
//	}
//	@Override
//	public List<Address> getData() {
//		
//		return ar.findAll();
//	}
//	@Override
//	public void insertData(Permanent cd) {
//		per.save(cd);
//		
//	}
//	@Override
//	public List<Permanent> getData() {
//		
//		return per.findAll();
//	}
//	@Override
//	public void insertData(Local cd) {
//		
//		lr.save(cd);
//		
//	}
//	@Override
//	public List<Local> getData() {
//		
//		return lr.findAll();
//	}
	
	
//	@Override
//	public void insertData(PropertyAddress cd) {
//				par.save(cd);
//	}
//	@Override
//	public List<PropertyAddress> getData() {
//		
//		return par.findAll();
//	}

//	@Override
//	public void insert(List<CustomerDetails> cd) 
//	{
//		cr.saveAll(cd);
//		
//	}

	@Override
	public void insertData(CustomerDetails cd)
	{
		cr.save(cd);
		
	}

	@Override
	public List<CustomerDetails> getData() 
	{
		return cr.findAll();
	}

	@Override
	public void deleteData(int id) 
	{
		cr.deleteById(id);
		
	}

	@Override
	public CustomerDetails getSingleData(int id) {
		
		return cr.findById(id).get();
	}

	@Override
	public CustomerDetails insert(CustomerDetails cd) {
	
		return cr.save(cd);
	}

	
//	@Override
//	public void insertData(PropertyInfo cd) {
//		pr.save(cd);
//	}
//
//	@Override
//	public List<PropertyInfo> getData() {
//	
//	return pr.findAll();
//	}

	
		
}
