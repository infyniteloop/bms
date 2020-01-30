package com.infyniteloop.book4me.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infyniteloop.book4me.model.Biodata;
@Repository
public interface BiodataDao extends JpaRepository<Biodata, Long>{
//JPA REPO
	

}
