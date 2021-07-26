package vending;

import org.junit.Test;
import vending.product.Chocolate;
import vending.product.SaltySnack;
import vending.product.SoftDrink;
import static org.junit.Assert.assertEquals;

public class OverloadedVendingMachineTest {

    @Test
public void shouldBeAbleToAddSoftDrink(){
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(0,0,0);

        SoftDrink softDrink = new SoftDrink();

        overloadedVendingMachine.addStock(softDrink);

        assertEquals(1, overloadedVendingMachine.getStock(softDrink));
    }
    @Test
    public void shouldBeAbleToAddTwoSaltySnacks(){
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(0,0,0);

        SaltySnack saltySnack = new SaltySnack();

        overloadedVendingMachine.addStock(saltySnack);
        overloadedVendingMachine.addStock(saltySnack);

        assertEquals(2, overloadedVendingMachine.getStock(saltySnack));
    }
    @Test
    public void shouldBeAbleToAddChocolate(){
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(0,0,0);

        Chocolate chocolate = new Chocolate();
        SaltySnack saltySnack = new SaltySnack();

        overloadedVendingMachine.addStock(chocolate);
        overloadedVendingMachine.addStock(saltySnack);

        assertEquals(1, overloadedVendingMachine.getStock(saltySnack));
    }
    @Test
    public void shouldBeAbleBuyChocolate(){
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(1,1,1);

        Chocolate chocolate = new Chocolate();

        overloadedVendingMachine.buy(chocolate);

        assertEquals(0, overloadedVendingMachine.getStock(chocolate));
    }
}
