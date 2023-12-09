package Testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import calci.Calculator;

class CalculatorTest {
	static Calculator cal;
	@BeforeAll
	public static void beforeAll()
	{
		System.out.println("beforeall");
		cal= new Calculator();
		
	}
	

	@Test
	@DisplayName("add")
	void testAdd() {
		
		Calculator cal = new Calculator();
		
			int actual = cal.add(5,5);	
			
			assertEquals(10, actual);
			System.out.println("add");
	
	}
	@AfterAll
	public static void afterAll()
	{
		System.out.println("afetrall");
		
	}
	@BeforeEach
	public void before()
	{
		System.out.println("beforeeach");
	}
    @AfterEach
    public void after()
	{
		System.out.println("aftereach");
	}
    
	@Test
	@DisplayName("sub")
	@Disabled
	void testSub() {
		
		
		Calculator cal = new Calculator();
		
		int actual = cal.sub(5,5);	
		
		assertEquals(0, actual);
		
		assertNotEquals(1, actual);
		System.out.println("sub");
		
		
	}

}
