package Assignment1.Assignment;

import static org.junit.Assert.*;

import org.junit.Test;

public class junitTest {

	@Test
	public void test() {
		fail("Not yet implemented");
		String[] courses = new String[] {"a", "bv"};
        Student me = new Student("Sheril", 20, "24/04/2000", 17507269, courses);
        
        System.out.println(me.getUsername());
	}

}
