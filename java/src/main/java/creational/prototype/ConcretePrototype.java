package creational.prototype;

public class ConcretePrototype extends Prototype {
	
    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return (ConcretePrototype)super.clone();
    }
    
}
