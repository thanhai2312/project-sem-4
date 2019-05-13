package model;

import java.sql.Date;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "Discounts")
public class Discount {
	private String Name;
	private String Code;
	private Date StartDate;
	private Date EndDate;
	private double Price;

	public Discount(String name, String code, Date startDate, Date endDate, double price) {
		super();
		Name = name;
		Code = code;
		StartDate = startDate;
		EndDate = endDate;
		Price = price;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCode() {
		return Code;
	}

	public void setCode(String code) {
		Code = code;
	}

	public Date getStartDate() {
		return StartDate;
	}

	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}

	public Date getEndDate() {
		return EndDate;
	}

	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

}
