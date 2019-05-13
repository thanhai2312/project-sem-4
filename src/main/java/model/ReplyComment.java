package model;

import java.util.Date;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "ReplyComments")
public class ReplyComment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	@ManyToOne
	@JoinColumn(name = "CommentId")
	private Comment comment;

	@ManyToOne
	@JoinColumn(name = "CustomerId")
	private Customer customer;

	private String Content;
	private Date CreateDate;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
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

}
