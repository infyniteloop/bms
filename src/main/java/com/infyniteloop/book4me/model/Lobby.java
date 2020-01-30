package com.infyniteloop.book4me.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "lobby_mst")
public class Lobby {

	
	// Private Fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;	
	private String lobbyName;
	private String lobbyCode;
	
	
	// GETTERS & SETTERS
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLobbyName() {
		return lobbyName;
	}
	public void setLobbyName(String lobbyName) {
		this.lobbyName = lobbyName;
	}
	public String getLobbyCode() {
		return lobbyCode;
	}
	public void setLobbyCode(String lobbyCode) {
		this.lobbyCode = lobbyCode;
	}
	
	
	
	// TO STRING 
	@Override
	public String toString() {
		return "Lobby [id=" + id + ", lobbyName=" + lobbyName + ", lobbyCode=" + lobbyCode + "]";
	}
	
	
}
