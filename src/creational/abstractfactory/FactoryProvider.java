package creational.abstractfactory;

public class FactoryProvider {

    public static UIElementAbstractFactory getFactory(String osFamily) {
        UIElementAbstractFactory factory;

        switch (osFamily) {
            case "Linux":
                factory = new LinuxElementsFactory();
                break;
            case "Windows":
                factory = new WindowsElementsFactory();
                break;
            default:
                throw new IllegalArgumentException("Unrecognized Operation System...");
        }

        return factory;
    }

}
