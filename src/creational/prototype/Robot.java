package creational.prototype;

public class Robot extends AbstractRobot {

    @Override
    protected Robot clone() throws CloneNotSupportedException {
        return (Robot) super.clone();
    }

}
