package behavioral.state;

public class Package {

	private PackageState state = new OrderedState();
	 
    public void previousState() {
        state.previous(this);
    }
 
    public void nextState() {
        state.next(this);
    }
 
    public void printStatus() {
        state.status();
    }
    
    
    public PackageState getState() {
		return state;
	}
    public void setState(PackageState state) {
		this.state = state;
	}
    
}
