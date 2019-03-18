package creational.abstractfactory;

import creational.abstractfactory.elems.UIElement;
import creational.abstractfactory.elems.WindowsAlertBox;
import creational.abstractfactory.elems.WindowsButton;

public class WindowsElemsFactory implements OpSysAbstractFactory {

	@SuppressWarnings("unchecked")
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
