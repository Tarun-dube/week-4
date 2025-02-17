package UniversityCourseManagementSystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static UniversityCourseManagementSystem.AllCourse.displayAllCourse;


public class UniversityCourseManagementSystem {
        public static  void main(String[] args) {
            AssignmentCourse a1=new AssignmentCourse("c",20);
            AssignmentCourse a2=new  AssignmentCourse("Java",30);
            // assignment courses list
            System.out.println("AssignmentCourse list:");
            Course<AssignmentCourse> c1=new Course<AssignmentCourse>();
            c1.addCourse(a1);
            c1.addCourse(a2);

            displayAllCourse(c1.getList());

            System.out.println("ResearchCourse list:");

            Course<ResearchCourse> c2=new Course<ResearchCourse>();
            c2.addCourse(new ResearchCourse("python",25));
            c2.addCourse(new ResearchCourse("DSA",30));


            displayAllCourse(c2.getList());

            System.out.println("ExerciseCourse list:");
            Course<ExamCourse> c3=new Course<ExamCourse>();
            c3.addCourse(new ExamCourse("HTML",30));
            c3.addCourse(new ExamCourse("CSS",25));
            displayAllCourse(c3.getList());








        }
    }



