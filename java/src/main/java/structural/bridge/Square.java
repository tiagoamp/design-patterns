package structural.bridge;

public class Square extends IShape {

	public Square(IColor color) {
		super.color = color;
    }
 
    @Override
    public String draw() {
        return "Square. " + color.fill();
    }

}
