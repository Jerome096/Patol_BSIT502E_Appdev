/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
abstract class Laptop {
    
    public abstract int getRAM();
  public abstract int getSSD();
  public abstract String getCPU();
  
  public String toString() {
    return "RAM=" + this.getRAM() + "GB, SSD=" + this.getSSD() + ", CPU=" + this.getCPU();
  }
}
