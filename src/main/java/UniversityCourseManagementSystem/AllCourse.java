package UniversityCourseManagementSystem;

import java.util.List;

public class AllCourse {
    public static void displayAllCourse(List<? extends CourseType> list ) {
        for(CourseType c : list) {
            System.out.println(c);
        }

    }
}
