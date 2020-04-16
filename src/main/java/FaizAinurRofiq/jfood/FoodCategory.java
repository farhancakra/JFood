package FaizAinurRofiq.jfood;

public enum FoodCategory
{
    Beverages("Beverages"),
    Coffe("Coffe"),
    Western ("Western"),
    Snacks("Scacks"),
    Rice("Rice"),
    Noodles("Noodles"),
    Bakery("Bakery"),
    Japanese("Japanese");
    
    private String category;
    
    FoodCategory(String category){
        this.category = category;
    }
    
    public String toString() {
        return category;
    }
}
