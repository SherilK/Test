package Assignment1.Assignment;

import static org.junit.Assert.*;  
//import com.javatpoint.logic.*;  
import org.junit.Test;  
/**
 *
 * @author Sheril
 */
public class MyTest {
    
    @Test
    public static void main(String[] args) {
        // TODO code application logic here
        String[] courses = new String[] {"a", "bv"};
        Student me = new Student("Sheril", 20, "24/04/2000", 17507269, courses);
        
        System.out.println(me.getUsername());
    }
    
}
