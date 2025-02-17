package MealPlanGenerator;

public class VeganMeal implements MealPlan {
    @Override
    public String getMealDetails() {
        return "Vegan Meal: Includes plant-based foods only.";
    }
}
