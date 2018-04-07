/**
 * 
 */
package com.ekart.core.domain;

import java.util.Set;

import javax.persistence.Entity;

import com.ekart.core.common.BaseEntity;

/**
 * @author rajesh
 *
 */
@Entity
public class Seller extends BaseEntity{
	
	private String name;
	
	private Set<Product> products;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	
}
