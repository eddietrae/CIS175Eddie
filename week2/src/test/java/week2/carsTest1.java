package week2;

import static org.junit.Assert.*;

import org.junit.Test;

public class carsTest1 {

	@Test
	public void test() {
		Cars car = new Cars("Ford", "Focus");
		assertEquals("Honk", car.honk());
	}

}
