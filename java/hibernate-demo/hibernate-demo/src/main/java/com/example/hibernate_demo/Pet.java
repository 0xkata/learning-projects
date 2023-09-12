package com.example.hibernate_demo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Pets")
public class Pet {
	
	@Id
	private int pid;
	
	@Column(name="kind")
	private String kind;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="cid", referencedColumnName="id")
	private Crewmate crewmate;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public Crewmate getCrewmate() {
		return crewmate;
	}

	public void setCrewmate(Crewmate crewmate) {
		this.crewmate = crewmate;
	}

	@Override
	public String toString() {
		return "Pet [pid=" + pid + ", kind=" + kind + "]";
	}
	
}
