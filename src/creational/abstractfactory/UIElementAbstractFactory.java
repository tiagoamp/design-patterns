package creational.abstractfactory;

import creational.abstractfactory.uielements.UIElement;

public interface UIElementAbstractFactory {

    public <T extends UIElement> T create(String elementName);

}
