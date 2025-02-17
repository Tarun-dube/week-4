package UniversityCourseManagementSystem;

public class AssignmentCourse extends CourseType{

        public AssignmentCourse( String courseName, int duration) {
            super(courseName, duration);
        }
        public void evaluate() {
            System.out.println(getCourseName()+"is evaluated through assignments");
        }
        public String toString() {
            return getCourseName()+" is evaluated through assignments";
        }
    }
