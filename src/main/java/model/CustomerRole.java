package model;

import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "CustomerRoles")
public class CustomerRole {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;

	private String CustomerRoleName;

	@OneToMany(mappedBy = "customerRole", cascade = CascadeType.ALL)
	private Set<Customer> customers;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getCustomerRoleName() {
		return CustomerRoleName;
	}

	public void setCustomerRoleName(String customerRoleName) {
		CustomerRoleName = customerRoleName;
	}

	public Set<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(Set<Customer> customers) {
		this.customers = customers;
	}

}
