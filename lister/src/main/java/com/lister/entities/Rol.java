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
@Table(name="roles")
public class Rol implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1710230973907223377L;
	
	@Id
	@GeneratedValue
	@Column(name="r_id")
	private long id;
	@Column(name="r_desc")
	private String desc;
	@ManyToMany(fetch = FetchType.LAZY, 
				cascade = CascadeType.ALL)
	@JoinTable(name="roles_users",
			joinColumns = @JoinColumn(name="fk_rol"),
			inverseJoinColumns = @JoinColumn(name="fk_user"))
	private List<User> users;
	
	public Rol(){	
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	

}
