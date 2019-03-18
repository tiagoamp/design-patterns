package creational.abstractfactory;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import creational.abstractfactory.elems.LinuxAlertBox;
import creational.abstractfactory.elems.LinuxButton;
import creational.abstractfactory.elems.UIElement;
import creational.abstractfactory.elems.WindowsAlertBox;
import creational.abstractfactory.elems.WindowsButton;

public class FactoryProviderTest {

	@Test
	public void testGetFactory_forLinuxButton() {
		final String os = "Linux";
		OpSysAbstractFactory linuxFactory = FactoryProvider.getFactory(os);
		final String element = "Button";
		UIElement button = linuxFactory.create(element);
		assertEquals(button.getClass(), LinuxButton.class);
	}
	
	@Test
	public void testGetFactory_forLinuxAlertBox() {
		final String os = "Linux";
		OpSysAbstractFactory linuxFactory = FactoryProvider.getFactory(os);
		final String element = "AlertBox";
		UIElement button = linuxFactory.create(element);
		assertEquals(button.getClass(), LinuxAlertBox.class);
	}
	
	@Test
	public void testGetFactory_forWindowsButton() {
		final String os = "Windows";
		OpSysAbstractFactory linuxFactory = FactoryProvider.getFactory(os);
		final String element = "Button";
		UIElement button = linuxFactory.create(element);
		assertEquals(button.getClass(), WindowsButton.class);
	}
	
	@Test
	public void testGetFactory_forWindowsAlertBox() {
		final String os = "Windows";
		OpSysAbstractFactory linuxFactory = FactoryProvider.getFactory(os);
		final String element = "AlertBox";
		UIElement button = linuxFactory.create(element);
		assertEquals(button.getClass(), WindowsAlertBox.class);
	}

}
