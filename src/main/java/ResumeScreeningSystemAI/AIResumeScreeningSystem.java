package ResumeScreeningSystemAI;

import java.util.*;


public class AIResumeScreeningSystem {
    // Generic method to screen resumes
    public static <T extends JobRole> void screenResume(Resume<T> resume) {
        System.out.println("Screening resume...");
        resume.processResume();
    }

    // Wildcard method to process multiple resumes
    public static void processMultipleResumes(List<? extends JobRole> jobRoles) {
        System.out.println("\nProcessing multiple resumes...");
        for (JobRole jobRole : jobRoles) {
            jobRole.evaluateResume();
        }
    }

    public static void main(String[] args) {

        SoftwareEngineer se = new SoftwareEngineer("Alice", 5);
        DataScientist ds = new DataScientist("Bob", 3);
        ProductManager pm = new ProductManager("Charlie", 7);


        Resume<SoftwareEngineer> resume1 = new Resume<>(se);
        Resume<DataScientist> resume2 = new Resume<>(ds);
        Resume<ProductManager> resume3 = new Resume<>(pm);


        screenResume(resume1);
        screenResume(resume2);
        screenResume(resume3);


        List<JobRole> allResumes = Arrays.asList(se, ds, pm);
        processMultipleResumes(allResumes);
    }
}
