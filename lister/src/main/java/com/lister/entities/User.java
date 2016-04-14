package com.lister.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="users")
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Column(name = "u_id")
	private long id;
	@Column(name = "u_name")
	private String username;
	@Column(name = "u_password")
	private String password;
	@Column(name = "u_ennabled")
	private String enabled;
	@ManyToMany(fetch = FetchType.LAZY, 
				cascade = CascadeType.ALL)
	@JoinTable(name="roles_users",
				joinColumns = @JoinColumn(name="fk_user"),
				inverseJoinColumns = @JoinColumn(name="fk_rol"))
	private List<Rol> roles;
	
	
	public User() {
		super();
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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


	public String getEnabled() {
		return enabled;
	}


	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}


	public List<Rol> getRoles() {
		return roles;
	}


	public void setRoles(List<Rol> roles) {
		this.roles = roles;
	}

}
