package Assignment1.Assignment;

public class Student {
	//(Name, Age, DOB, ID, username, courses and modules registered
	    
	    String name;
	    int age;
	    String dob;
	    int id;
	    String username;
	    String[] courses;
	    
	    public Student(String name, int age, String dob, int id, String[] courses){
	        
	        this.name = name;
	        this.age = age;
	        this.dob = dob;
	        this.id = id;
	        this.courses = courses; 
	    }
	    
	    public String getUsername(){
	        username = name + String.valueOf(id);
	        
	        return username; 
	    }
	    /**
	     * @param args the command line arguments
	     */
	    public static void main(String[] args) {
	        // TODO code application logic here
	        String[] courses = new String[] {"a", "bv"};
	        Student me = new Student("Sheril", 20, "24/04/2000", 17507269, courses);
	        
	        System.out.println(me.getUsername());
	    }
	    
	}
