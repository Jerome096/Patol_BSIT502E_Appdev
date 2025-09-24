/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teststrategy;

/**
 *
 * @author Admin
 */
public interface Payment {
    public void pay(double amount);
}
// Step 3 & 4 & 5 & 6: Create the Online class implementing Payment
class Online implements Payment {
    private String email;
    private String password;
    public Online(String email, String password) {
        this.email = email;
        this.password = password;
    }
    public void pay(double amount) {
        System.out.println("Paid using online account: " + amount);
    }
}

class Mobile implements Payment {
    private String number;
    private int pin;
    public Mobile(String number, int pin) {
        this.number = number;
        this.pin = pin;
    }
    public void pay(double amount) {
        System.out.println("Paid using mobile wallet: " + amount);
    }
}
// Step 11 & 12 & 13: Create the Cart class
class Cart {
    private double amount;
    public Cart(double amount) {
        this.amount = amount;
    }
    public void pay(Payment mode) {
        mode.pay(amount);
    }
}