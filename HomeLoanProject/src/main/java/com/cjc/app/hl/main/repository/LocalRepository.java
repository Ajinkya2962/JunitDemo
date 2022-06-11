package com.cjc.app.hl.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.hl.main.model.Address;
import com.cjc.app.hl.main.model.Local;
import com.cjc.app.hl.main.model.Permanent;
import com.cjc.app.hl.main.model.PropertyInfo;

@Repository
public interface LocalRepository extends JpaRepository<Local, Integer>
{

}
