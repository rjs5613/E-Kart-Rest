/**
 * 
 */
package com.ekart.core.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;

import com.ekart.core.common.BaseEntity;

/**
 * @author rajesh
 *
 */
@Entity
public class Category extends BaseEntity{
	
	private String name;
	
	private String description;
	
	@ManyToMany(mappedBy = "categories", fetch=FetchType.LAZY)
	private Set<Product> products;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
