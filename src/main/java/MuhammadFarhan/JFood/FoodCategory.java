package MuhammadFarhan.JFood;
public enum FoodCategory
{
    Beverages("Beverages"),
    Coffee("Coffee"),
    Western("Western"),
    Snacks("Snacks"),
    Rice("Rice"),
    Noodles("Noodles"),
    Bakery("Bakery"),
    Japanese("Japanese");


private String categoryFood;

private FoodCategory (String categoryFood)
{
    this.categoryFood = categoryFood;
}

public String toString(){
    return categoryFood;
}
    
}

