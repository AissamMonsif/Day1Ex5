public class Milk extends Supplement {

    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.2;
    }

    @Override
    public String description() {
        return beverage.description() + " with milk";
    }
}
