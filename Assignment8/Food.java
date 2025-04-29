public class Food implements NutritionFacts {
    private String name;
    private double calories;
    private double fat;
    private double carbs;
    private double protein;

    public Food(String name, double calories, double fat, double carbs, double protein) {
        this.name = name;
        this. calories = calories;
        this.fat = fat;
        this.carbs = carbs;
        this.protein = protein;
    }

    @Override
    public String toString() {
        return "Food{name='" + name + "', calories=" + calories + ", fat=" + fat +
                ", carbs=" + carbs + ", protein=" + protein + "}";
    }

    public double getCalories() {
        return calories;
    }

    public double getFat() {
        return fat;
    }

    public double getCarbs() {
        return carbs;
    }

    public double getProtein() {
        return protein;
    }
}

