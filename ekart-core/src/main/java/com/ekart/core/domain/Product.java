/**
 * 
 */
package com.ekart.core.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.ekart.core.common.BaseEntity;

/**
 * @author rajesh
 *
 */
@Entity
public class Product extends BaseEntity{
	
	private String name;
	
	private Manufacturer manufacturer;
	
	@ManyToMany(cascade = { CascadeType.ALL }, fetch=FetchType.LAZY)
    @JoinTable(
        name = "product_category", 
        joinColumns = { @JoinColumn(name = "product_id") }, 
        inverseJoinColumns = { @JoinColumn(name = "category_id") }
    )
	private Set<Category> categories;
	
	private String description;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Set<Category> getCategories() {
		return categories;
	}

	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
