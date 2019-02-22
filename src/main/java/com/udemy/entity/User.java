package com.udemy.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="users")
public class User {

	@Id
	@Column(name = "username", unique = true, nullable = false, length = 45)
	private String username;
	
	@Column(name = "password" , nullable= false, length = 60)
	private String password;
	
	@Column(name = "enabled", nullable= false)
	private boolean enabled;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "user")
	private Set<UserRole> uSerRoles = new HashSet<UserRole>();
	
	public User() {}
	
	public User(String username, String password, boolean enabled, Set<UserRole> uSerRoles) {
		super();
		this.username = username;
		this.password = password;
		this.enabled = enabled;
		this.uSerRoles = uSerRoles;
	}

	public User(String username, String password, boolean enabled) {
		super();
		this.username = username;
		this.password = password;
		this.enabled = enabled;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Set<UserRole> getuSerRoles() {
		return uSerRoles;
	}

	public void setuSerRoles(Set<UserRole> uSerRoles) {
		this.uSerRoles = uSerRoles;
	}
	
	

	
	
}
