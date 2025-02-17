package UniversityCourseManagementSystem;

import java.util.List;

public class CourseList{
    public static void displayAllCourses(List<?> courses){
        for(Object course : courses){
            System.out.println(course.toString());
        }
        
    }
}
