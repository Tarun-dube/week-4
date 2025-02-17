package UniversityCourseManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Course<T extends CourseType>{
        T courseType;




        public Course(T courseType) {
            this.courseType = courseType;

        }

        public void displayDetails() {
            System.out.println("Course: " + courseType.getCourseName() + " | Duration: " + courseType.getDuration());
            courseType.evaluate();
            }
        }


