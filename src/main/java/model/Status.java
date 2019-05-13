package model;

import java.sql.Date;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "Statuses")
public class Status {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;

	private String StatusName;

	@OneToMany(mappedBy = "status", cascade = CascadeType.ALL)
	private Set<Order> orders;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getStatusName() {
		return StatusName;
	}

	public void setStatusName(String statusName) {
		StatusName = statusName;
	}

	public Set<Order> getOrders() {
		return orders;
	}

	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}

}
