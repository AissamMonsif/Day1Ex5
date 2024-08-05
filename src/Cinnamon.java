public class Cinnamon extends Supplement {

    public Cinnamon(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.05;
    }

    @Override
    public String description() {
        return beverage.description() + " with cinnamon";
    }
}
