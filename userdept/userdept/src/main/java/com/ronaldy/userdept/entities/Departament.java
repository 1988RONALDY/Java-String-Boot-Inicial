package com.ronaldy.userdept.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity   //notation JPA. Com isso estou dizendo que esta classe será mapeada por uma tabela do banco de dados
@Table(name = "tb_department") //notation JPA. 	Qual será no nome dela no banco.

public class Departament {
	
	private Long id;
	private String name;
	
	public Departament() {  //construtor,  pode ser intanciada sem passar nenhum argumento
	}
	
	@Id //auto increments
	@GeneratedValue(strategy = GenerationType.IDENTITY) //auto increments

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

	
}
