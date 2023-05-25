package creational.abstractfactory;

import creational.abstractfactory.uielements.UIElement;
import creational.abstractfactory.uielements.WindowsAlertBox;
import creational.abstractfactory.uielements.WindowsButton;

public class WindowsElementsFactory implements UIElementAbstractFactory {

    @Override
    public <T extends UIElement> T create(final String elementName) {
        T element;

        switch (elementName) {
            case "Button":
                element = (T) new WindowsButton();
                break;
            case "AlertBox":
                element = (T) new WindowsAlertBox();
                break;
            default:
                throw new IllegalArgumentException();
        }

        return element;
    }

}
