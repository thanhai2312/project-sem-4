package model;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "OrderDetails")
public class OrderDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;

	@ManyToOne
	@JoinColumn(name = "OrderId")
	private Order order;

	@ManyToOne
	@JoinColumn(name = "ProductId")
	private Product product;

	private int Quanlity;
	private double UnitPrice;
	private String DiscountCode;
	private double Total;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuanlity() {
		return Quanlity;
	}

	public void setQuanlity(int quanlity) {
		Quanlity = quanlity;
	}

	public double getUnitPrice() {
		return UnitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		UnitPrice = unitPrice;
	}

	public String getDiscountCode() {
		return DiscountCode;
	}

	public void setDiscountCode(String discountCode) {
		DiscountCode = discountCode;
	}

	public double getTotal() {
		return Total;
	}

	public void setTotal(double total) {
		Total = total;
	}

}
