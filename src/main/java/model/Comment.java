package model;

import java.util.Date;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "Comments")
public class Comment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;

	@ManyToOne
	@JoinColumn(name = "ProductId")
	private Product product;

	@ManyToOne
	@JoinColumn(name = "CustomerId")
	private Customer customer;

	private int Rating;
	private String Content;
	private Date CreateDate;

	@OneToMany(mappedBy = "comment", cascade = CascadeType.ALL)
	private Set<ReplyComment> replyComments;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public int getRating() {
		return Rating;
	}

	public void setRating(int rating) {
		Rating = rating;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	public Date getCreateDate() {
		return CreateDate;
	}

	public void setCreateDate(Date createDate) {
		CreateDate = createDate;
	}

	public Set<ReplyComment> getReplyComments() {
		return replyComments;
	}

	public void setReplyComments(Set<ReplyComment> replyComments) {
		this.replyComments = replyComments;
	}

}
