package model;

import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "Product_Image")
public class Product_Image {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	@ManyToOne
	@JoinColumn(name = "ProductId")
	private Product product;

	private String Alt;
	private String Url;

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

	public String getAlt() {
		return Alt;
	}

	public void setAlt(String alt) {
		Alt = alt;
	}

	public String getUrl() {
		return Url;
	}

	public void setUrl(String url) {
		Url = url;
	}

}
