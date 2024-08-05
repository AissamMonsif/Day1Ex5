public class Coffee implements Beverage{
    @Override
    public double cost() {
        return 1.0;
    }

    @Override
    public String description() {
        return "Coffee";
    }
}
