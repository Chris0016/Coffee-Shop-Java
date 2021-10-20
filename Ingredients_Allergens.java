import java.util.*;

public class Ingredients_Allergens{
    ArrayList<String> Ingredients;
    ArrayList<String> Allergens;
    public Ingredients_Allergens(String ing1, String ing2, String ing3, String allergens){
        Ingredients = new ArrayList<>();
        Allergens = new ArrayList<>();
        Ingredients.add(ing1);
        Ingredients.add(ing2);
        Ingredients.add(ing3);
        
        Allergens.add(allergens);
    }
    //Getters
    public String getIngredients(){
        return Ingredients.toString();
    }
    public String getIngredient(short num){
        try{
            return Ingredients.get(num);
         }
        catch(Exception e){
            System.out.println("There are only "+ Ingredients.size() + " ingredients.");
            return "";
         }
    }
    public String getAllergens(){
        return Allergens.toString();
    }
    public String getAllergen(short num){
        return Allergens.get(num);
    }
 
    public short getTotalIngredients(){
        return (short)Ingredients.size();
    }
    //Setters
    public void addIngredients(String ing, String ing2){
        Ingredients.add(ing);
        Ingredients.add(ing2);
        System.out.println("Added "+ ing + " and " + ing2 +" to ingredients."); 
    }
    public void addIngredient(String ing){
        Ingredients.add(ing);
        System.out.println("Added "+ ing +" to ingredients."); 
    }
    //remove ingredient. One with a String parameter and another with integer parameter
    public void removeIngredient(String ing){
        if (Ingredients.contains(ing)) {
        Ingredients.remove(ing);
        System.out.println("Removed " + ing + " from ingredients.");
        }
        else
            System.out.println( "\" " + ing + " \"" + " is not in the ingredients list");
    }
    public void removeIngredient(int num){
        Ingredients.remove(num);
        System.out.print("Removed " + Ingredients.get(num)+ " from ingredients.");
    }
    private String list(ArrayList<String> input){
        String rep = "";
        if (input.size() == 0) return "None\n";
        else{
            for(short i = 0; i < input.size(); i++){
                rep += (i+1) +". "+ input.get(i) + "\n";
            }
            return rep;
        }
    }

    public String toString(){
       
        return "Ingredients: \n"
        + list(Ingredients)
        +"Allergens: \n"
        + list(Allergens);
    }
}