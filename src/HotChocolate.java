public class HotChocolate implements Beverage{
    @Override
    public double cost() {
        return 1.5;
    }

    @Override
    public String description() {
        return "Hot chocolate";
    }
}
