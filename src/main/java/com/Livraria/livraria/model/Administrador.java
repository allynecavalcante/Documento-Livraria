package com.Livraria.livraria.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Administrador {
	
	@Id
	@GeneratedValue
	private long id;
	

}
