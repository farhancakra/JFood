public class JFood
{
      
      public static void main(String[] args) {
      Location location1 = new Location("Bekasi", "Jawa Barat", "Banjir");
      
      Seller seller1 = new Seller(1, "Farhan", "farhan.cakra@gmail.com",
      "082245440870", location1);
      
      
      Food food1 = new Food(1, "Cakwe", seller1, 17000, FoodCategory.Noodles);
      
      
      Customer customer1 = new Customer(2, "Jordan", "Farhan_kerenz@gmail.com",
      "jordan", "27 Februari");
      
      
      
      
      
      
      food1.printData();
      
      
  }
}

