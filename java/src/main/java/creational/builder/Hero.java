package creational.builder;

public class Hero {

	// required fields
	private String name;        
	private String maskColor;
	
	// optional fields
	private Integer age;
	private String capeColor;
	private String weapon;
	
	
	// getter's and setter's
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMaskColor() {
		return maskColor;
	}
	public void setMaskColor(String maskColor) {
		this.maskColor = maskColor;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getCapeColor() {
		return capeColor;
	}
	public void setCapeColor(String capeColor) {
		this.capeColor = capeColor;
	}
	public String getWeapon() {
		return weapon;
	}
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
		
}
