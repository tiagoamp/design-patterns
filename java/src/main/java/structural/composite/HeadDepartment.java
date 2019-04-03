package structural.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HeadDepartment implements Department {

	private List<Department> departments = new ArrayList<>();;
	
	@Override
	public String getName() {
		Optional<String> names = departments.stream()
			.map(dep -> dep.getName())
			.reduce((x,y) -> x + " - " + y);
		return names.get();
	}
	
	
	public void addDepartment(Department dep) {
		departments.add(dep);
	}

}
