package creational.abstractfactory;

public class FactoryProvider {
	
	public static OpSysAbstractFactory getFactory(final String osFamily) {
		OpSysAbstractFactory factory;
		
		switch (osFamily) {
			case "Linux":
				factory = new LinuxElemsFactory(); 
				break;
			case "Windows":
				factory = new WindowsElemsFactory(); 
				break;
	
			default:
				throw new IllegalArgumentException("Unrecognized Operation System from param...");
			}
		
		return factory;
				
	}

}
