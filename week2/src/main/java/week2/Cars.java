/**
 * @author Trae Eddie - tmeddie
 * CIS175 - Spring 2021
 * 2/4/2021
 */
package week2;

public class Cars {
	private String make;
	private String model;
	
	public Cars() {
		
	}
	public Cars(String make, String model) {
		super();
		this.make = make;
		this.model = model;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public String honk() {
		return "Honk";
	}
	
	public String vroom() {
		return make + " goes vroom.";
	}
}
