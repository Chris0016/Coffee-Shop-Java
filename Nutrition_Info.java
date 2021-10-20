import java.util.*;
//LInked HashMap: Used for Pairs and ordered by insertion.
public class Nutrition_Info{
    LinkedHashMap<String , Short> nutrition_Info;
    
    public Nutrition_Info(Short  servings, Short caffeine, Short carbohydrates, Short calories, Short fat, Short sodium, Short cholesterol){
        nutrition_Info = new LinkedHashMap<>();
        nutrition_Info.put("Serving Size", servings);
        nutrition_Info.put("Caffeine", caffeine);
        nutrition_Info.put("Total Carbohydrates", carbohydrates);
        nutrition_Info.put("Total Calories", calories);
        nutrition_Info.put("Total Fat", fat);
        nutrition_Info.put("Sodium", sodium);
        nutrition_Info.put("Cholesterol" , cholesterol );
       
        
    }
    //Getters 
    public Short getItem(String category){
        if ( nutrition_Info.containsKey(category) ) return nutrition_Info.get(category);
        else { 
            System.out.println(category+ " is not a Category");
              return -1; 
            }
    }
    
    //Setters
    public void setItem(String category, Short amount){
       
        if (nutrition_Info.containsKey(category) ){
                nutrition_Info.put(category, amount);
                System.out.println( category +" updated.");
            }
        else 
            System.out.println(category + " is not a Category");
       
    }
    public void removeData(String dataToRemove){
       setItem(dataToRemove, (short)-1) ;
       System.out.println("Removed "+ dataToRemove);
   }
    
    
    //Printers
    public void printItem(String category){
        if(getItem(category) != -1)
        System.out.println( category + ": "+ getItem(category) ) ;
    }
    

    public String toString(){
       return "Serving Size: "
       +nutrition_Info.get("Serving Size")
       +"\nCaffeine: "
       +nutrition_Info.get("Caffeine")
       +"\nTotal Carbohydrates: "
       +nutrition_Info.get("Total Carbohydrates")
       +"\nTotal Calories: "
       +nutrition_Info.get("Total Calories")
       +"\nTotal Fat: "
       
       +nutrition_Info.get("Total Fat")
       +"\nSodium: "
       +nutrition_Info.get("Sodium")
       
       +"\nCholesterol: "
       + nutrition_Info.get("Cholesterol");
      
   }
 
}