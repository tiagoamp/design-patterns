package creational.abstractfactory;

import creational.abstractfactory.uielements.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Tests {

    @DisplayName("When request button for Linux OS, should return linux UI element")
    @Test
    public void test_linuxButton() {
        final String os = "Linux";
        UIElementAbstractFactory linuxFactory = FactoryProvider.getFactory(os);
        String element = "Button";
        UIElement button = linuxFactory.create(element);
        assertTrue(button instanceof LinuxButton);
    }

    @DisplayName("When request alert box for Linux OS, should return linux UI element")
    @Test
    public void test_linuxAlertBox() {
        final String os = "Linux";
        UIElementAbstractFactory linuxFactory = FactoryProvider.getFactory(os);
        String element = "AlertBox";
        UIElement alert = linuxFactory.create(element);
        assertTrue(alert instanceof LinuxAlertBox);
    }

    @DisplayName("When request button for Windows OS, should return windows UI element")
    @Test
    public void test_windowsButton() {
        final String os = "Windows";
        UIElementAbstractFactory windowsFactory = FactoryProvider.getFactory(os);
        String element = "Button";
        UIElement button = windowsFactory.create(element);
        assertTrue(button instanceof WindowsButton);
    }

    @DisplayName("When request alert box for Windows OS, should return windows UI element")
    @Test
    public void test_windowsAlertBox() {
        final String os = "Windows";
        UIElementAbstractFactory windowsFactory = FactoryProvider.getFactory(os);
        String element = "AlertBox";
        UIElement alert = windowsFactory.create(element);
        assertTrue(alert instanceof WindowsAlertBox);
    }

}
