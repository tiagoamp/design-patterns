package structural.proxy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ImportantResourceProxyTest {

	@Test
	public void testDoWork() {
		IImportantResource resource = new ImportantResourceProxy();
		String result = resource.doWork();
		assertEquals("Remote", result);
	}

}
