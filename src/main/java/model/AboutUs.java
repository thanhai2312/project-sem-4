package model;

import javax.persistence.*;

@Entity
@Table(name = "AboutUs")
public class AboutUs {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	private String Content;

}
