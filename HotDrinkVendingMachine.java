import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine{
    List<HotDrink> hotDrinks;

    public HotDrinkVendingMachine(List<HotDrink> products) {
        this.hotDrinks = products;
    }

    public List<HotDrink> getHotDrinks() {
        return hotDrinks;
    }

    public void setHotDrinks(List<HotDrink> hotDrinks) {
        this.hotDrinks = hotDrinks;
    }

    @Override
    public Product getProduct(String name) {
        for (HotDrink item : hotDrinks) {
            if(item.getName().equals(name))
                return item;
        }
        return null;
    }

    @Override
    public Product getProduct(String name, double volume) {
        for (HotDrink item : hotDrinks) {
            if(item.getName().equals(name))
                return item;
        }
        return null;
    }

    public Product getProduct(String name, double volume, int temperature){
        for (HotDrink cup : hotDrinks) {
            if(cup.getName().equals(name) && cup.getVolume() == volume && cup.getTemperature() == temperature)
                return cup;
        }
        return null;
    }
    public void addHotDrink(HotDrink hotDrink){
        this.hotDrinks.add(hotDrink);
    }
}
