package Coffee;

public class FlavorDecorator extends CoffeeDecorator {
    private String flavor;

    public FlavorDecorator(Coffee coffee, String flavor) {
        super(coffee);
        this.flavor = flavor;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", " + flavor + " Syrup";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 0.75; // Adding flavor syrup costs $0.75
    }
}