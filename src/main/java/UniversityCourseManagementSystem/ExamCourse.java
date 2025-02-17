package UniversityCourseManagementSystem;

public class ExamCourse extends CourseType {

     public ExamCourse(String courseName, int duration) {
         super(courseName, duration);


     }

     public void evaluate() {
         System.out.println(getCourseName() + "is evaluated by written exam");
     }

     public String toString() {
         return getCourseName() + " is evaluated by written exam";
     }
 }
