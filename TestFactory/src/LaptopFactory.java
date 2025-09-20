/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
class LaptopFactory {
  public static Laptop getSpecs(String type, int ram, int ssd, String cpu) {
      
    if ("min".equalsIgnoreCase(type))
      return new Minimum(ram, ssd, cpu);
    
    else if ("reco".equalsIgnoreCase(type))
      return new Recommended(ram, ssd, cpu);
    return null;
  }
}

