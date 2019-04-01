package structural.proxy;

public class ImportantResourceProxy implements IImportantResource {

	private RemoteImportantResource resource;
	
	@Override
	public String doWork() {
		if (resource == null) {
			// just once and on demand
			System.out.println("Loading initial configuration...");		
			System.out.println("Do complex and expensive loading...");		
			System.out.println("Get resource from remote location...");
			this.resource = new RemoteImportantResource();  // pretend to get remote resource from network
		}
		
		return this.resource.doWork();				
	}

}
