package creational.builder;

public class Hero2 {
	
	// required fields
	private String name;        
	private String maskColor;	
	// optional fields
	private Integer age;
	private String capeColor;
	private String weapon;
	
	
	public static class Builder {
		
		private Hero2 hero;
								
		public Builder(String name, String maskColor) {
			hero = new Hero2();
			hero.name = name;
			hero.maskColor = maskColor;
		}
		
		public Builder withAge(Integer age) {
			hero.age = age;
			return this;
		}
		
		public Builder withCapeColor(String color) {
			hero.capeColor = color;
			return this;
		}
		
		public Builder withWeapon(String weapon) {
			hero.weapon = weapon;
			return this;
		}
		
		public Hero2 build() {
			return hero;
		}
	}
	
	
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
