package com.ronaldy.userdept.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity   //notation JPA
@Table(name = "tb_user") //notation JPA

public class User {
	
	@Id //auto increments
	@GeneratedValue(strategy = GenerationType.IDENTITY) //auto increments
	
	
	private Long id;
	private String name;
	private String email;
	
	@ManyToOne //relação chave estrangeira e primara
	@JoinColumn(name = "department_id") //relação chave estrangeira e primara
	
	private Departament department;  // relação entre user e o apartment. foi atribuido um atributo do tipo da classe cliada anterioment.
	
	public User() {
	}
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Departament getDepartment() {
		return department;
	}

	public void setDepartment(Departament department) {
		this.department = department;
	}
	
	

}
