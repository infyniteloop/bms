package com.infyniteloop.book4me.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.infyniteloop.book4me.model.Lobby;

public interface LobbyService {
	
	// CRUD operations
	public List<Lobby> listAll();
	public Page<Lobby> listPageable(Pageable pageable);
	public Lobby save(Lobby lobby);
	public Lobby get(int id);
	public void delete(int id);
	

}
