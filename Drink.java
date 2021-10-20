public class Drink{
    String name;
    String description;
    Nutrition_Info nutritionFacts;
    Ingredients_Allergens ingredients_Allergens;
    public Drink(String name , String description, Nutrition_Info details1 , Ingredients_Allergens details2){
        this.name= name;
        this.description = description;
        nutritionFacts = details1;
        ingredients_Allergens = details2;
        
    }
    
    //Getters
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
   
    public void printNutritionFacts(){System.out.println("Nutrition Facts: \n"+nutritionFacts.toString());}
    public void printIngredients(){System.out.println("Ingredients: \n"+getIngredients()); }
    public void printAllergens(){System.out.println("Allergens: \n"+ getAllergens());}
    
    //In  case the user wants to retrive these.
     public Nutrition_Info getNutritionFacts(){
        return nutritionFacts;
    }
    public Ingredients_Allergens getIngredients_Allergens(){
        return ingredients_Allergens;
    }
    public String getIngredients(){
        return ingredients_Allergens.getIngredients();
    }
    public String getAllergens(){
        return ingredients_Allergens.getAllergens();
            }
  
    
    public String toString2(){
        return "Drink Name: "+ name
        + "\nNutrition Info:\n"
        + nutritionFacts
        +"\n\nIngredients:\n"
        + getIngredients()
        +"\n\nAllergens: \n"
        + getAllergens()
        +"\n\n";
    }
    public String toString(){
        return name + 
        "\n"+description
        +".\n";
    }
  
}