package com.example;

/**
 * Product entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Product implements java.io.Serializable {

	// Fields

	private Long id;
	private Supplier supplier;
	private String name;
	private String description;
	private Double price;

	// Constructors

	/** default constructor */
	public Product() {
	}

	/** minimal constructor */
	public Product(Long id) {
		this.id = id;
	}

	/** full constructor */
	public Product(Long id, Supplier supplier, String name, String description,
			Double price) {
		this.id = id;
		this.supplier = supplier;
		this.name = name;
		this.description = description;
		this.price = price;
	}
	public Product(  String name, String description,
			Double price) {
		
		
		this.name = name;
		this.description = description;
		this.price = price;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Supplier getSupplier() {
		return this.supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}