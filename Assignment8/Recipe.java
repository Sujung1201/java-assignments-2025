public class Recipe implements NutritionFacts {
    private String name;
    private Food[] ingredients;

    public Recipe(String name, Food[] ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    @Override
    public double getCalories() {
        double total = 0.0;
        for (Food f : ingredients) {
            total += f.getCalories();
        }
        return total;
    }

    @Override
    public double getFat() {
        double total = 0.0;
        for (Food f : ingredients) {
            total += f.getFat();
        }
        return total;
    }

    @Override
    public double getCarbs() {
        double total = 0.0;
        for (Food f : ingredients) {
            total += f.getCarbs();
        }
        return total;
    }

    @Override
    public double getProtein() {
        double total = 0.0;
        for (Food f : ingredients) {
            total += f.getProtein();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Recipe{ingredients=[");
        for (int i = 0; i < ingredients.length; i++) {
            sb.append(ingredients[i].toString());
            if (i != ingredients.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]}");
        return sb.toString();
    }
}
