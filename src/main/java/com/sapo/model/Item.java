package com.sapo.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Item {
	@Id
	private Long itemid;
	@JsonIgnore
	@Transient
	@Column(nullable = true)
	private Long item_id;
	@Column(nullable = true)
	private String[] images;
	@Column(nullable = true)
	private String name;
	@Column(nullable = true)
	private Long shopid;
	@Column(nullable = true)
	private String brand;
	@Column(nullable = true)
	private double price;
	@Column(nullable = true)
	private float rating_star;
	@Column(nullable = true)
	private int[] rating_count;
	@JsonIgnore
	@Transient
	@Column(nullable = true)
	private Rating item_rating;
	@Column(nullable = true)
	private int historical_sold;
	@Column(nullable = true)
	private int sold;
	@Column(nullable = true)
	private double price_max;
	@Column(nullable = true)
	private double price_min;
	@Column(nullable = true)
	private String discount;
	@Column(nullable = true)
	private int stock;
	@Column(nullable = true)
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "item")
	private Set<Category> categories = new HashSet<Category>();
	@Column(nullable = true)
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "item")
	private Set<PriceItem> priceItems = new HashSet<PriceItem>();

	public Set<PriceItem> getPriceItems() {
		return priceItems;
	}

	public void setPriceItems(Set<PriceItem> priceItems) {
		this.priceItems = priceItems;
	}

	public Long getItem_id() {
		return item_id;
	}

	public void setItem_id(Long item_id) {
		this.item_id = item_id;
	}

	public Long getItemid() {
		return itemid;
	}

	public void setItemid(Long itemid) {
		this.itemid = itemid;
	}

	public String[] getImages() {
		return images;
	}

	public void setImages(String[] images) {
		this.images = images;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getShopid() {
		return shopid;
	}

	public void setShopid(Long shopid) {
		this.shopid = shopid;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public float getRating_star() {
		return rating_star;
	}

	public void setRating_star(float rating_star) {
		this.rating_star = rating_star;
	}

	public int[] getRating_count() {
		return rating_count;
	}

	public void setRating_count(int[] rating_count) {
		this.rating_count = rating_count;
	}

	public Rating getItem_rating() {
		return item_rating;
	}

	public void setItem_rating(Rating item_rating) {
		this.item_rating = item_rating;
	}

	public int getHistorical_sold() {
		return historical_sold;
	}

	public void setHistorical_sold(int historical_sold) {
		this.historical_sold = historical_sold;
	}

	public int getSold() {
		return sold;
	}

	public void setSold(int sold) {
		this.sold = sold;
	}

	public double getPrice_max() {
		return price_max;
	}

	public void setPrice_max(double price_max) {
		this.price_max = price_max;
	}

	public double getPrice_min() {
		return price_min;
	}

	public void setPrice_min(double price_min) {
		this.price_min = price_min;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Set<Category> getCategories() {
		return categories;
	}

	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

}
