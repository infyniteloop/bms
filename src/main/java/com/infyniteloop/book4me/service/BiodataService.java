package com.infyniteloop.book4me.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.infyniteloop.book4me.model.Biodata;

public interface BiodataService {
	
	// CRUD operations
	public List<Biodata> listAll();
	public Page<Biodata> listPageable(Pageable pageable);
	public Biodata save(Biodata biodata);
	public Biodata get(Long id);
	public void delete(Long id);
	

}
