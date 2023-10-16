import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BottleOfWatter b1 = new BottleOfWatter("1", 1, 1);
        BottleOfWatter b2 = new BottleOfWatter("2", 2, 2);
        BottleOfWatter b3 = new BottleOfWatter("5", 4, 3);
        BottleOfWatter b4 = new BottleOfWatter("15", 123, 1);
        BottleOfWatter b5 = new BottleOfWatter("20", 6, 5);
        HotDrink h1 = new HotDrink("Tee",1,1,50);
        HotDrink h2 = new HotDrink("Cofee",2,1,50);
        HotDrink h3 = new HotDrink("Latte",3,1,50);
        HotDrink h4 = new HotDrink("Capucchino",3,1,50);
        BottleOfWaterVendingMachine vendingMachine = new BottleOfWaterVendingMachine(new ArrayList<>());
        vendingMachine.addBottleOfWater(b1);
        vendingMachine.addBottleOfWater(b2);
        vendingMachine.addBottleOfWater(b3);
        vendingMachine.addBottleOfWater(b4);
        vendingMachine.addBottleOfWater(b5);
        HotDrinkVendingMachine vendingMachine1 = new HotDrinkVendingMachine((new ArrayList<>()));
        vendingMachine1.addHotDrink(h1);
        vendingMachine1.addHotDrink(h2);
        vendingMachine1.addHotDrink(h3);
        vendingMachine1.addHotDrink(h4);
        System.out.println(vendingMachine.getProduct("20", 5));
        System.out.println(vendingMachine.getProduct("20", 100));
        System.out.println("\n");
        for (BottleOfWatter b : vendingMachine.getBottleOfWatters()) {
            System.out.println(b);
        }
        System.out.println("\n");
        System.out.println(vendingMachine1.getProduct("Tee", 1));
        System.out.println(vendingMachine1.getProduct("Cofee", 1));
        System.out.println("\n");
        for (HotDrink h : vendingMachine1.getHotDrinks() ) {
            System.out.println(h);
        }
    }

}