/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
class Minimum extends Laptop {
  private int ram;
  private int ssd;
  private String cpu;
  
  public Minimum(int ram, int ssd, String cpu) {
    this.ram = ram;
    this.ssd = ssd;
    this.cpu = cpu;
  }
  public int getRAM() {
    return this.ram;
  }
  public int getSSD() {
    return this.ssd;
  }
  public String getCPU() {
    return this.cpu;
  }
}
