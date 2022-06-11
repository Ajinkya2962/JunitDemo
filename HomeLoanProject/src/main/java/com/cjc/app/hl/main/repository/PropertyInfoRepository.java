package com.cjc.app.hl.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cjc.app.hl.main.model.PropertyInfo;

@Repository
public interface PropertyInfoRepository extends JpaRepository<PropertyInfo, Integer>{

}
