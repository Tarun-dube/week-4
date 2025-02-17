package UniversityCourseManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Course<T extends CourseType>{


    public List<T> getList() {
        return list;
    }

    List<T>list=new ArrayList<>();


        public void addCourse(T course) {
            list.add(course);
        }




        }


