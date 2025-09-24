/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teststrategy;

/**
 *
 * @author Admin
 */
public class TestStrategy {
    public static void main(String[] args) {
        Cart cart = new Cart(1512.75);
        cart.pay(new Online("mark.reyes@gmail.com", "Wasd8456!"));
        cart = new Cart(375.25);
        cart.pay(new Mobile("1234567890", 1234));
    }
}

