package creational.prototype;

public abstract class Prototype implements Cloneable {
	
	private String name;
	
    public Prototype clone() throws CloneNotSupportedException{
        return (Prototype) super.clone();
    }
    
    
    public String getName() {
		return name;
	}
    public void setName(String name) {
		this.name = name;
	}
    
}
