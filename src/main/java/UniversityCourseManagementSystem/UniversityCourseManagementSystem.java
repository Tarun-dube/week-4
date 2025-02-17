package UniversityCourseManagementSystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static UniversityCourseManagementSystem.CourseList.displayAllCourses;

public class UniversityCourseManagementSystem {
        public static  void main(String[] args) {
            AssignmentCourse a1=new AssignmentCourse("c",20);
            AssignmentCourse a2=new  AssignmentCourse("Java",30);

            Course<AssignmentCourse> c1=new Course<AssignmentCourse>(a1);
            Course<AssignmentCourse> c2=new  Course<AssignmentCourse>(a2);

            Course<ExamCourse> e1=new  Course<ExamCourse>(new ExamCourse("Python",25));
            Course<ResearchCourse>r1=new  Course<ResearchCourse>(new ResearchCourse("Java",30));

            c1.displayDetails();
            c2.displayDetails();
            e1.displayDetails();
            r1.displayDetails();




        }
    }



