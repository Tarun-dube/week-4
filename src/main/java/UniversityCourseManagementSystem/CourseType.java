package UniversityCourseManagementSystem;

public abstract class CourseType {

    private String courseName;
    private int duration;
    public String getCourseName() {
        return courseName;
    }

    public int getDuration() {
        return duration;
    }


    public CourseType(String name, int duration) {
        this.courseName = name;
        this.duration = duration;
    }
    public abstract void evaluate();




    @Override
    public String toString() {
        return courseName;
    }
}
