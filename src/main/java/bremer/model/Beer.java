package bremer.model;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

// @Entity
public class Beer {

	//@Id
	//@GeneratedValue
	private Long id;
	
	@NotBlank(message = "SKU may not be blank") // Hibernate.Validator (Bean Validation)
	private String sku;
	
	@NotEmpty(message = "Name may not be empty")
	private String name;

	
	public Beer() {}

	public Beer(Long id, String sku) {
		super();
		this.id = id;
		this.sku = sku;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getSku() {
		return sku;
	}


	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
