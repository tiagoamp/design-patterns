package creational.abstractfactory;

import creational.abstractfactory.elems.LinuxAlertBox;
import creational.abstractfactory.elems.LinuxButton;
import creational.abstractfactory.elems.UIElement;

public class LinuxElemsFactory implements OpSysAbstractFactory {

	@SuppressWarnings("unchecked")
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
