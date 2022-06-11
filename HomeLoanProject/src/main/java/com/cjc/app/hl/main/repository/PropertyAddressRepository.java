package com.cjc.app.hl.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.cjc.app.hl.main.model.PropertyAddress;


@Repository
public interface PropertyAddressRepository extends JpaRepository<PropertyAddress, Integer>{

}
