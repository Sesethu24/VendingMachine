package vending;

import vending.product.Product;
import vending.product.SoftDrink;
import vending.product.Chocolate;
import vending.product.SaltySnack;

public class Main {
    public static void main(String[] args) {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(3, 3,3);

        SaltySnack saltySnack = new SaltySnack();
        SoftDrink softDrink = new SoftDrink();
        Chocolate chocolate = new Chocolate();

        overloadedVendingMachine.addStock(softDrink);
        overloadedVendingMachine.addStock(saltySnack);
        overloadedVendingMachine.addStock(chocolate);

        overloadedVendingMachine.buy(softDrink);
        overloadedVendingMachine.buy(saltySnack);
        overloadedVendingMachine.buy(chocolate);

        System.out.println("Soft Drink: " + overloadedVendingMachine.getStock(softDrink));
        System.out.println("Salty Snack: " + overloadedVendingMachine.getStock(saltySnack));
        System.out.println("Chocolate: " + overloadedVendingMachine.getStock(chocolate));
    }
}
