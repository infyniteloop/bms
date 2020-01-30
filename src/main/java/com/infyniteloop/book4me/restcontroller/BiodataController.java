package com.infyniteloop.book4me.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infyniteloop.book4me.model.Biodata;
import com.infyniteloop.book4me.service.BiodataService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/biodata")
public class BiodataController {
	
	@Autowired
	private BiodataService biodataService;
	
	
	// CREATES A BIODATA
	@PostMapping("/create")
	@PreAuthorize("hasRole('PM') or hasRole('ADMIN')")
	public Biodata create(@RequestBody Biodata biodata) {
		
		System.out.println("Calling List All" + biodata.getFirstName());
		return biodataService.save(biodata);
	}
	
	// DELETE BIODATA FOR THE GIVEN ID
	@DeleteMapping(value = "/delete/{id}",  produces = "application/json")
	public void delete(@PathVariable("id") Long id) {
		System.out.println("Calling Delete on ID " + id);
		biodataService.delete(id);
		
	}
	
	// UPDATE THE BIODATA FOR THE GIVEN ID
	@PutMapping("/update/{id}")
	public Biodata saveChanges(@RequestBody Biodata biodata) {
		
		System.out.println("Calling List All" + biodata.getFirstName());
		return biodataService.save(biodata);
	}
	
	
	@GetMapping(value = "/edit/{id}",  produces = "application/json")
	public Biodata getBiodata(@PathVariable("id") Long id) {
		System.out.println("Calling List All");
		return biodataService.get(id);
	}
	
	
	// RETYRNS ALL THE BIODATA
	// eg URL : http://localhost:8090/biodata/list/all
	
	@GetMapping(value = "/list/all",  produces = "application/json")
	public List<Biodata> firstPage() {
		System.out.println("Calling List All");
		return biodataService.listAll();
	}
	
	/*
	 * Returns pageable results
	 * eg URL : http://localhost:8090/biodata/listPageable?page=0&size=2&sort=firstName
	 * 
	 */
	
	@GetMapping(value = "/listPageable",  produces = "application/json")
	Page<Biodata> biodataPageable(Pageable pageable) {
		return biodataService.listPageable(pageable);

	}
	
	
	
	

}
