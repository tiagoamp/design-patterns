package behavioral.state;

public interface PackageState {
	
	void next(Package pkg);
	
    void previous(Package pkg);
    
    String status();
    
}
