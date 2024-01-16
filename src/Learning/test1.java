package Learning;

import java.io.IOException;

import org.testng.annotations.Test;

public class test1 {
	@Test
	public void test01()throws InterruptedException, IOException {
		Login lo = new Login();
		lo.main(null);
		System.out.println("hello");
		
	}
	
	
	
	@Test
	public void test02()throws InterruptedException, IOException {
		Demo d= new Demo();
		d.print();
		System.out.println("welcome");
	}
		
	@Test
	public void test03()throws InterruptedException, IOException {
	TestDemo td= new TestDemo();
	System.out.println("Home");
	
		
	}
		
	}


