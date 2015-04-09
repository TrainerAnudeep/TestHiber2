package com.example;

import java.util.HashSet;
import java.util.Set;

/**
 * Supplier entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Supplier implements java.io.Serializable {

	// Fields

	private Long id;
	private String name;
	private Set products = new HashSet(0);

	// Constructors

	/** default constructor */
	public Supplier() {
	}

	/** minimal constructor */
	public Supplier(Long id) {
		this.id = id;
	}

	/** full constructor */
	public Supplier(Long id, String name, Set products) {
		this.id = id;
		this.name = name;
		this.products = products;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getProducts() {
		return this.products;
	}

	public void setProducts(Set products) {
		this.products = products;
	}

}