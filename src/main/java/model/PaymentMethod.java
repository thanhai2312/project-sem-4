package model;

import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "PaymentMethods")
public class PaymentMethod {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;

	private String Name;

	@OneToMany(mappedBy = "paymentMethod", cascade = CascadeType.ALL)
	private Set<Order> orders;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Set<Order> getOrders() {
		return orders;
	}

	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}

}
