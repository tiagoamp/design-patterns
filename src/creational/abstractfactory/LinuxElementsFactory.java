package creational.abstractfactory;

import creational.abstractfactory.uielements.*;

public class LinuxElementsFactory implements UIElementAbstractFactory {

    @Override
    public <T extends UIElement> T create(final String elementName) {
        T element;

        switch (elementName) {
            case "Button":
                element = (T) new LinuxButton();
                break;
            case "AlertBox":
                element = (T) new LinuxAlertBox();
                break;
            default:
                throw new IllegalArgumentException();
        }

        return element;
    }

}
