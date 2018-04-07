package com.ekart.core.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;

import com.ekart.core.common.BaseEntity;

/**
 * 
 * @author rajesh
 *
 */
@Entity
public class SellerProduct extends BaseEntity{
	
	private Product product;
	
	private Seller seller;
	
	private long quantity;
	
	private BigDecimal price;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
}
