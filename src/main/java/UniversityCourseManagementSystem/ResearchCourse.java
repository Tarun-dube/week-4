package UniversityCourseManagementSystem;

import java.util.List;

public class ResearchCourse extends CourseType{
        ResearchCourse( String courseName, int duration) {
            super(courseName, duration);
        }
        public void evaluate() {
            System.out.println(getCourseName()+"is evaluated through research papers");
        }
        public String toString() {
            return getCourseName()+"is evaluated through research papers";
        }
    }
