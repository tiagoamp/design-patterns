package creational.prototype;

public abstract class AbstractRobot implements Cloneable {

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
