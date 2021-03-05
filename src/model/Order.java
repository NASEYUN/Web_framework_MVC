package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Order {
	private String itemNumber;
	private String description;
	private String price;
	private String firstName;
	private String lastName;
	private String initial;
	private String address;
	private String creditcardType;
	private String creditcard;
	private String Recreditcard;

}
