package structural.proxy;

public class RemoteImportantResource implements IImportantResource {

	@Override
	public String doWork() {
		return "Remote";
	}

}
