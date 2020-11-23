package Assignment1.Assignment;

import org.joda.time.DateTime;

public class CourseProgramme {
    
    String courseName;
    Module modules[];
    Student students[];
    DateTime startDate;
    DateTime endDate;
    
    public CourseProgramme(String courseName, DateTime startDate, DateTime endDate){
        this.courseName = courseName;
        this.startDate = startDate;
        this.endDate = endDate; 
    }
    
}