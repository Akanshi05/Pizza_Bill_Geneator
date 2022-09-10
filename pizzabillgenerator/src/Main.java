/*
Author: Akanshi Gupta
Date: 9-10-21
Description : It's a project about if-else conditions.

 */

public class Main {

    public static void main(String[] args) {
//          pizza basePizza = new pizza(false);//instance of a class
//          basePizza.addExtraCheese();
//          basePizza.addExtraToppings();
//          basePizza.takeAway();
//          basePizza.getBill();

        DeluxPizza dp = new DeluxPizza(true);
        dp.addExtraCheese();
        dp.addExtraCheese();
        dp.getBill();
    }
}