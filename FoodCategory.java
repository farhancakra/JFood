
public enum FoodCategory
{
    Beverages("Beverages"),
    Coffeee("Coffee"),
    Western("Western"),
    Snacks("Snacks"),
    Rice("Rice"),
    Noodles("Noodles"),
    Bakery("Bakery"),
    Japanese("Japanese");


private String categoryFood;

FoodCategory (String categoryFood)
{
    this.categoryFood = categoryFood;
}

public String toString(){
    return categoryFood;
}
    
}

