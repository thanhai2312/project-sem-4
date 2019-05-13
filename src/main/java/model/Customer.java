package model;

import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "Customers")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;

	private String Username;
	private String Password;
	private String Fullname;
	private String Email;
	private String Phone;
	private String Address;
	private boolean Gender;
	private String Shopname;
	private String Avatar;
	private boolean isActive;

	@ManyToOne
	@JoinColumn(name = "CustomerRoleId")
	private CustomerRole customerRole;

	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	private Set<Product> products;

	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	private Set<Comment> comments;

	@OneToMany(mappedBy = "buyer", cascade = CascadeType.ALL)
	private Set<Order> orders;

	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	private Set<ReplyComment> replyComments;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getFullname() {
		return Fullname;
	}

	public void setFullname(String fullname) {
		Fullname = fullname;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public boolean isGender() {
		return Gender;
	}

	public void setGender(boolean gender) {
		Gender = gender;
	}

	public String getShopname() {
		return Shopname;
	}

	public void setShopname(String shopname) {
		Shopname = shopname;
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

	public CustomerRole getCustomerRole() {
		return customerRole;
	}

	public void setCustomerRole(CustomerRole customerRole) {
		this.customerRole = customerRole;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	public Set<Comment> getComments() {
		return comments;
	}

	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}

	public Set<Order> getOrders() {
		return orders;
	}

	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}

	public Set<ReplyComment> getReplyComments() {
		return replyComments;
	}

	public void setReplyComments(Set<ReplyComment> replyComments) {
		this.replyComments = replyComments;
	}
}
