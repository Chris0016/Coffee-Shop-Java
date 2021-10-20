import java.util.*;

//Treemap: pairs and orders by keys. (Smallest key to largest).
public class MyProgram
{
    public static void main(String[] args)
    {
       LinkedHashMap<Integer, Drink> allDrinks = new LinkedHashMap<>();
       
      // Apple spice
    Nutrition_Info  appleSpice_N = new Nutrition_Info( (short)7, (short)2, (short)3, (short)4, (short)5, (short)6, (short)7 );
    
    //Testing Nutrition_Info methods
        // System.out.println("Sodium: "+appleSpice_N.getItem("Sodium"));
        //appleSpice_N.setItem("Total Fat", (short)5);
        //System.out.println(appleSpice_N.toString());
        //appleSpice_N.removeData("Caffeine");
    
    Ingredients_Allergens appleSpice_I = new Ingredients_Allergens("Glisten", "Juice", "Timberland", "a");
        //System.out.print(appleSpice_I.getIngredients());
       // System.out.println(appleSpice_I.getIngredient((short)1));
        //System.out.println(appleSpice_I.getTotalIngredients());
      //appleSpice_I.addIngredient("Eggs");
        //System.out.println(appleSpice_I.getTotalIngredients());
       //appleSpice_I.removeIngredient("Eggs");
        
    Drink appleSpice = new Drink("Apple Spice","Nice and Sweet", appleSpice_N , appleSpice_I);
       // System.out.print(appleSpice.toString());
       
       
    Nutrition_Info  strawberryFrap_N = new Nutrition_Info( (short)3, (short)99, (short)18, (short)44, (short)56, (short)46, (short)57 );
    Ingredients_Allergens strawberryFrap_I = new Ingredients_Allergens("Strawberry", "Frappuchino Syrup", "Ice", "none");
    Drink strawberryFrap = new Drink(" Strawberry Frappuchino","Contains Summer's favorite berry", strawberryFrap_N , strawberryFrap_I);

       TreeMap<Integer, Drink> popularDrinks = new TreeMap<>();
       popularDrinks.put(1, appleSpice);
       popularDrinks.put(2, strawberryFrap);
       
       System.out.print(popularDrinks);
    }
}