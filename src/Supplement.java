public abstract class Supplement implements Beverage {
    protected Beverage beverage;

    public Supplement(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public abstract double cost();

    @Override
    public abstract String description();
}