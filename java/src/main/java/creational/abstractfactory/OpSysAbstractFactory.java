package creational.abstractfactory;

import creational.abstractfactory.elems.UIElement;

public interface OpSysAbstractFactory {

	public <T extends UIElement> T create(String element);
	
}
