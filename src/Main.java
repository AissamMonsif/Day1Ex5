// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Coffee();
        System.out.println(beverage.description() + " : " + beverage.cost() + "€");

        beverage = new Milk(beverage);
        System.out.println(beverage.description() + " : " + beverage.cost() + "€");

        beverage = new Cream(beverage);
        System.out.println(beverage.description() + " : " + beverage.cost() + "€");

        beverage = new Cinnamon(beverage);
        System.out.println(beverage.description() + " : " + beverage.cost() + "€");

        Beverage tea = new Tea();
        Beverage teaWithSupplements = new Cinnamon(new Milk(tea));
        System.out.println(teaWithSupplements.description() + " : " + teaWithSupplements.cost() + "€");

        Beverage hotChocolate = new HotChocolate();
        Beverage hotChocolateWithSupplements = new Cream(new Cinnamon(hotChocolate));
        System.out.println(hotChocolateWithSupplements.description() + " : " + hotChocolateWithSupplements.cost() + "€");

    }
}