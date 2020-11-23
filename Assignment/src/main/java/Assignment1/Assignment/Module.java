package Assignment1.Assignment;

public class Module {
    
    // module name, id (e.g.CT417), list of students, courses it is associated with)
    String module_name;
    String id;
    Student[] students;
    String courses; 
    
    public Module(String module_name, String id, String courses){
        this.module_name = module_name;
        this.id = id;
        this.courses = courses;
    
    }
    
}
