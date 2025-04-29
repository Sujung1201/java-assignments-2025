public class Recipe implements NutritionFacts {
    private String name;
    private Food[] ingredients;

    public Recipe(String name, Food[] ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Recipe{name='" + name + "', ingredients=[");
        for (int i = 0; i < 4; i++) {
            sb.append(ingredients[i]);
            if (i != 3) {
                sb.append(", ");
            }
        }
        sb.append("]}");
        return sb.toString();
    }

    public double getCalories() {
        double total = 0;
        for (int i = 0; i < 4; i++) {
            total += ingredients[i].getCalories();
        }
        return total;
    }

    public double getFat() {
        double total = 0;
        for (int i = 0; i < 4; i++) {
            total += ingredients[i].getFat();
        }
        return total;
    }

    public double getCarbs() {
        double total = 0;
        for (int i = 0; i < 4; i++) {
            total += ingredients[i].getCarbs();
        }
        return total;
    }

    public double getProtein() {
        double total = 0;
        for (int i = 0; i < 4; i++) {
            total += ingredients[i].getProtein();
        }
        return total;
    }
}

