package Coffee;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CoffeeTest {

    @Test
    public void testBasicCoffee() {
        Coffee coffee = new BasicCoffee();
        assertEquals("Basic Coffee", coffee.getDescription());
        assertEquals(2.00, coffee.getCost(), 0);
    }

    @Test
    public void testCoffeeWithMilk() {
        Coffee coffee = new MilkDecorator(new BasicCoffee());
        assertEquals("Basic Coffee, Milk", coffee.getDescription());
        assertEquals(2.50, coffee.getCost(), 0);
    }

    @Test
    public void testCoffeeWithMilkAndSugar() {
        Coffee coffee = new SugarDecorator(new MilkDecorator(new BasicCoffee()));
        assertEquals("Basic Coffee, Milk, Sugar", coffee.getDescription());
        assertEquals(2.70, coffee.getCost(), 0);
    }

    @Test
    public void testCoffeeWithAllAdditions() {
        Coffee coffee = new FlavorDecorator(new SugarDecorator(new MilkDecorator(new BasicCoffee())), "Vanilla");
        assertEquals("Basic Coffee, Milk, Sugar, Vanilla Syrup", coffee.getDescription());
        assertEquals(3.45, coffee.getCost(), 0);
    }
}
