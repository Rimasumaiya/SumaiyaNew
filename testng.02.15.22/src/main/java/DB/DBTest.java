package DB;

import org.testng.annotations.DataProvider;
import org.testng.asserts.SoftAssert;

public class DBTest {
	
	SoftAssert s=new SoftAssert();
	public void test() {
		s.assertTrue(3>8);
		System.out.println("hi");
		s.assertAll();
	}
	
	
	@DataProvider(name="login")
	
	public Object[][]getData(){
Object[][] o=new Object[2][2];
o[0][0]="user1";
o[0][1]="P23";
o[1][0]="user1";
o[1][1]="P23";
return o;
	}
	

	
	

}
