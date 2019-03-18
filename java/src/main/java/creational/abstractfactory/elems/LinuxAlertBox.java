package creational.abstractfactory.elems;

public class LinuxAlertBox  implements LinuxUIelement {

	@Override
	public String getType() {
		return "I am an Alert Box for Linux";
	}

}
