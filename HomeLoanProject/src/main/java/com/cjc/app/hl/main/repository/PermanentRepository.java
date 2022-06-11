package com.cjc.app.hl.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.hl.main.model.Address;
import com.cjc.app.hl.main.model.Permanent;
import com.cjc.app.hl.main.model.PropertyInfo;

@Repository
public interface PermanentRepository extends JpaRepository<Permanent, Integer>
{

}
