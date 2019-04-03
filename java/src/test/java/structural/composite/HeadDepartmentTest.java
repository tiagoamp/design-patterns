package structural.composite;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class HeadDepartmentTest {

	@Test
	public void testGetName() {
		// given
		HeadDepartment headDep = new HeadDepartment();
		Department salesDep =  new SalesDepartment();
		Department hrDep = new HRDepartment();
		headDep.addDepartment(salesDep);
		headDep.addDepartment(hrDep);
		// when 
		String result = headDep.getName();
		// then
		assertTrue(result.contains(salesDep.getName()));
		assertTrue(result.contains(hrDep.getName()));
	}

}
