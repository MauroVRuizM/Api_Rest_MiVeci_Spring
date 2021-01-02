package com.miVeci.backend.models.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Table(name="People")
@Entity
public class Person implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id_person")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic(optional=false)
	private Long idPerson;
	
	@Column(name="names")
	private String names;
	
	@Column(name="lastNames")
	private String lastNames;
	
	@Column(name="CI")
	private String CI;
	
	@Column(name="cell")
	private String cell;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="rol")
	private String rol;
	
	
	/*FK*/
	
	@OneToMany(mappedBy = "person", fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Address> address;


	public Person() {
		super();
	}


	public Person(Long idPerson) {
		super();
		this.idPerson = idPerson;
	}


	public Long getIdPerson() {
		return idPerson;
	}


	public void setIdPerson(Long idPerson) {
		this.idPerson = idPerson;
	}


	public String getNames() {
		return names;
	}


	public void setNames(String names) {
		this.names = names;
	}


	public String getLastNames() {
		return lastNames;
	}


	public void setLastNames(String lastNames) {
		this.lastNames = lastNames;
	}


	public String getCI() {
		return CI;
	}


	public void setCI(String cI) {
		CI = cI;
	}


	public String getCell() {
		return cell;
	}


	public void setCell(String cell) {
		this.cell = cell;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getRol() {
		return rol;
	}


	public void setRol(String rol) {
		this.rol = rol;
	}


	public List<Address> getAddress() {
		return address;
	}


	public void setAddress(List<Address> address) {
		this.address = address;
	}
	

}
