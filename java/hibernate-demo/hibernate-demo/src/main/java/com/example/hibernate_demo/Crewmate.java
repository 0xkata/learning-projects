package com.example.hibernate_demo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import jakarta.persistence.Cacheable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="Crewmates")
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Crewmate {
	
	@Id
	@Column(name="id")
	private int id;
	
//	@Column(name="name")
//	private CrewmateName name;
	
	@Column(name="name")
	private String name;
	
	@Column(name="colour")
	private String colour;
	
	@OneToMany(mappedBy="crewmate", fetch=FetchType.EAGER)
	private List<Pet> pets = new ArrayList<Pet>();
	
//	@Transient
//	private int x;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

//	public CrewmateName getName() {
//		return name;
//	}
//
//	public void setName(CrewmateName name) {
//		this.name = name;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	

	public List<Pet> getPets() {
		return pets;
	}

	public void setPets(List<Pet> pets) {
		this.pets = pets;
	}

	@Override
	public String toString() {
		return "Crewmate [id=" + id + ", name=" + name + ", colour=" + colour + ", pets=" + pets + "]";
	}


}
