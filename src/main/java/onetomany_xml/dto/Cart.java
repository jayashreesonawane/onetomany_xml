package onetomany_xml.dto;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "cart_id") // Add a join column to store the relationship
	private List<Items> items;
}
