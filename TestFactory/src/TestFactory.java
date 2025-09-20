/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class TestFactory {
    public static void main(String[] args) {
        
    Laptop min = LaptopFactory.getSpecs("min", 8, 256, "i5-12450Hz");
    Laptop reco = LaptopFactory.getSpecs("reco", 16, 512, "i7-12700Hz");
    
    System.out.println("Minimum Specs:");
    System.out.println(min.toString());
    System.out.println("Recommended Specs:");
    System.out.println(reco.toString());
  }
}
