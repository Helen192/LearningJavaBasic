package helen.javacourse.lesson2;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
public class beginnTest {
	@Test
	public void shouldReturnHelloWorld() {
		beginn helen = new beginn();
		assertEquals("Hello World", helen.helloWorld());
	}
	
	@Test
	public void shouldReturnHelloName() {
		beginn person = new beginn();
		assertEquals("Hello Helen", person.hello("Helen"));
	}
	
	@Test
	public void shoudlReturnNumberOfPersons() {
		beginn person1 = new beginn();
		beginn person2 = new beginn();
		assertEquals(2,person1.numberOfPersons());
	}
	

}
