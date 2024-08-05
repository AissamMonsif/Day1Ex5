public class Tea implements Beverage{
    @Override
    public double cost() {
        return 0.5;
    }

    @Override
    public String description() {
        return "Tea";
    }
}
