public class Cream extends Supplement {

    public Cream(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.3;
    }

    @Override
    public String description() {
        return beverage.description() + " with cream";
    }
}
