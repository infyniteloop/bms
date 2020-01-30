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

import com.infyniteloop.book4me.model.Lobby;
import com.infyniteloop.book4me.service.LobbyService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/lobby")
public class LobbyController {
	
	@Autowired
	private LobbyService lobbyService;
	
	
	@GetMapping(value = "/get/{id}",  produces = "application/json")
	public Lobby getLobbyById(@PathVariable("id") int id) {
		System.out.println("Calling List All");
		return lobbyService.get(id);
	}
	
	// CREATES A lLOBBY
	@PostMapping("/create")
	@PreAuthorize("hasRole('PM') or hasRole('ADMIN')")
	public Lobby create(@RequestBody Lobby lobby) {
		
		System.out.println("Calling List All" + lobby.getLobbyName());
		return lobbyService.save(lobby);
	}
	
	// DELETE BIODATA FOR THE GIVEN ID
	@DeleteMapping(value = "/delete/{id}",  produces = "application/json")
	public void delete(@PathVariable("id") int id) {
		System.out.println("Calling Delete on ID " + id);
		lobbyService.delete(id);
		
	}
	
	// UPDATE THE BIODATA FOR THE GIVEN ID
	@PutMapping("/update/{id}")
	public Lobby saveChanges(@RequestBody Lobby lobby) {
		
		System.out.println("Calling List All" + lobby.getLobbyName());
		return lobbyService.save(lobby);
	}
	
	
	
	
	// RETYRNS ALL THE BIODATA
	// eg URL : http://localhost:8090/lobby/list/all
	
	@GetMapping(value = "/list/all",  produces = "application/json")
	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
	public List<Lobby> firstPage() {
		System.out.println("Calling List All");
		
		return lobbyService.listAll();
	}
	
	/*
	 * Returns pageable results
	 * eg URL : http://localhost:8090/lobby/listPageable?page=0&size=2&sort=firstName
	 * 
	 */
	
	@GetMapping(value = "/listPageable",  produces = "application/json")
	Page<Lobby> lobbyPageable(Pageable pageable) {
		return lobbyService.listPageable(pageable);

	}
	
	
	
	

}
