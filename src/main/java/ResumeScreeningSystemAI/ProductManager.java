package ResumeScreeningSystemAI;

public class ProductManager extends JobRole {
    public ProductManager(String candidateName, int experienceYears) {
        super(candidateName, experienceYears);
    }

    @Override
    public void evaluateResume() {
        System.out.println(getCandidateName() + " is applying for Product Manager with " + getExperienceYears() + " years of experience.");
    }
}
