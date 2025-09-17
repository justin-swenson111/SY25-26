

public class FoodItem
{
    //measured in grams
    int fat;
    int protein;
    int carb;
    
    double cal;
    
    public FoodItem(int f, int p, int c){
        fat = f;
        protein = p;
        carb = c;
    }
    
    public double totalCalories(){
        cal = fat*9 + protein*4 + carb*4;
        return cal;
    }
    public double percentFromFat(){
        return (fat*9)/cal*100;
    }
    public String okMeat(){
        double per = percentFromFat();
        if (per>30) return "fatty";
        else if (per<=30 && per>=20) return "acceptable";
        else return "lean";
    }
    public double trimMeat(){
        return fat/2;
    }
    public String toString(){
        String retval = String.format("Grams of fat: %d \nGrams of protein: %d \nGrams of carbs: %d \nTotal Calories: %f \nPercent of calories from fat: %f \nmeat grade: %s \nTrimmed fat: %f", fat,protein,carb,totalCalories(), percentFromFat(), okMeat(),trimMeat());
        return retval;
    }
    
}
