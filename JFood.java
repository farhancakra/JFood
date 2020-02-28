public class JFood
{
      
      public void main(String[] args) {
      Location location1 = new Location("Bekasi", "Jawa Barat", "Banjir");
      System.out.println(location1.getCity());
      
      Seller seller1 = new Seller(1, "Farhan", "farhan@gmail.com",
      "0888888888888", location1);
      System.out.println(seller1.getName());
      
      Food food1 = new Food(1, "Cakwe", seller1, 17000, "gorengan");
      System.out.println(food1.getId());
      
      Customer customer1 = new Customer(10, "Farhan", "Farhan_kerenz@gmail.com",
      "farhan", "27 Februari");
      System.out.println(customer1.getId());
      
      Invoice invoice1 = new Invoice(1, 2, "27 Feb", customer1, 70000);
      System.out.println(invoice1.getId());
  }
}

