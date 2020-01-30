package com.infyniteloop.book4me.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.infyniteloop.book4me.dao.LobbyDAO;
import com.infyniteloop.book4me.model.Lobby;


@Service
public class LobbyServiceImpl implements LobbyService{
	
	
	@Autowired
	private LobbyDAO lobbyDao;

	
	/*
	 * Returns all lobby
	 * eg URL : http://localhost:8090/lobby/listPageable?page=0&size=2&sort=firstName
	 * */
	
	
	@Override
	public List<Lobby> listAll() {
		return lobbyDao.findAll();
	}

	@Override
	public Lobby save(Lobby lobby) {
		return lobbyDao.save(lobby);
	}

	@Override
	public Lobby get(int id) {
		return lobbyDao.findById(id).get();
	}

	@Override
	public void delete(int id) {
		lobbyDao.deleteById(Integer.valueOf(id));
	}

		
	@Override
	public Page<Lobby> listPageable(Pageable pageable) {
		return lobbyDao.findAll(pageable);
	}

}
