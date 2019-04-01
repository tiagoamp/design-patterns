package structural.bridge;

public class Triangle extends IShape {

	public Triangle(IColor color) {
		super.color = color;
    }
 
    @Override
    public String draw() {
        return "Triangle. " + color.fill();
    }

}
