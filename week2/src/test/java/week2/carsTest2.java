package week2;

import static org.junit.Assert.*;

import org.junit.Test;

public class carsTest2 {

	@Test
	public void test() {
		Cars car = new Cars("Ford", "Focus");
		assertEquals("Ford goes vroom.", car.vroom());
	}
	@Test
	public void test1() {
		Cars car = new Cars();
		assertNull(car.getMake());
	}
	@Test
	public void test2() {
		Cars car = new Cars("Ford", "Focus");
		assertTrue(car.getModel() == "Focus");
	}

}
