// Test NutritionFacts

public class TestNutritionFacts
{
    public static void main(String[] args)
    {
        // Check the constructors for Food.
        Food milk = new Food("Milk", 122, 4.6, 12, 8.2);
        Food oatmeal = new Food("Oatmeal", 101, 1.9, 19.5, 3.3);
        Food spinach = new Food("Spinach", 0.2, 0, 0, 0);
        Food cucumber = new Food("Cucumber", 0.1, 0, 0, 0);

        // Check the constructors for Recipe.
        Recipe mess = new Recipe("Mess", new Food[] {milk, oatmeal, cucumber, spinach});

        // Check the toString() methods.
        System.out.println("toString() for Food:");
        System.out.println(milk);
        System.out.println(oatmeal);
        System.out.println(spinach);
        System.out.println(cucumber);

        System.out.println();

        System.out.println("toString() for Recipe:");
        System.out.println(mess);

        System.out.println();

        // Check the NutritionFacts methods for Food.
        System.out.println("Nutrition Facts for Milk");
        System.out.println("Calories: " + milk.getCalories());
        System.out.println("Fat: " + milk.getFat());
        System.out.println("Carbs: " + milk.getCarbs());
        System.out.println("Fat: " + milk.getProtein());

        System.out.println();

        // Check the NutritionFacts methods for Recipe.
        System.out.println("Nutrition Facts for Recipe");
        System.out.println("Calories: " + mess.getCalories());
        System.out.println("Fat: " + mess.getFat());
        System.out.println("Carbs: " + mess.getCarbs());
        System.out.println("Protein: " + mess.getProtein());

        System.out.println();

        // Make an array of NutritionFacts.
        System.out.println("Array of NutritionFacts:");
        NutritionFacts[] breakfast = new NutritionFacts[] {milk, mess};
        for (int i = 0; i < breakfast.length; i++)
        {
            System.out.println(breakfast[i].getCalories() + " calories");
        }
    }
}