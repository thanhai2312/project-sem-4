package model;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "Products")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String ProductName;
	private String Description;
	private double Price;
	private double SalePrice;
	private int TotalAmount;
	private int AvaiableAmount;
	private float Size;
	private boolean Gender;
	private String Color;
	private String Avatar;
	private boolean isActive;

	@ManyToOne
	@JoinColumn(name = "CategoryId")
	private Category category;

	@ManyToOne
	@JoinColumn(name = "OwnerId")
	private Customer customer;

	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
	private Set<Product_Image> images;

	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
	private Set<Comment> comments;

	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
	private Set<OrderDetail> orderDetails;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public double getSalePrice() {
		return SalePrice;
	}

	public void setSalePrice(double salePrice) {
		SalePrice = salePrice;
	}

	public int getTotalAmount() {
		return TotalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		TotalAmount = totalAmount;
	}

	public int getAvaiableAmount() {
		return AvaiableAmount;
	}

	public void setAvaiableAmount(int avaiableAmount) {
		AvaiableAmount = avaiableAmount;
	}

	public float getSize() {
		return Size;
	}

	public void setSize(float size) {
		Size = size;
	}

	public boolean isGender() {
		return Gender;
	}

	public void setGender(boolean gender) {
		Gender = gender;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getAvatar() {
		return Avatar;
	}

	public void setAvatar(String avatar) {
		Avatar = avatar;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Set<Product_Image> getImages() {
		return images;
	}

	public void setImages(Set<Product_Image> images) {
		this.images = images;
	}

	public Set<Comment> getComments() {
		return comments;
	}

	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}

	public Set<OrderDetail> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(Set<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

}
