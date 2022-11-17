package sklep.products.types;

public class TV extends Products {
    public int weight;
    public String screenType;

    public TV(String brand, int size, String color, double price, int inWarehouse, int weight, String screenType) {
        super(brand, size, color, price, inWarehouse);
        this.weight = weight;
        this.screenType = screenType;
    }

    public TV(String brand, int size, String color, double price, int inWarehouse) {
        super(brand, size, color, price, inWarehouse);
    }

    public TV() {

    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    @Override
    public String toString() {
        return super.toString() + " Waga: " + this.weight + " Ekran: " + this.screenType;
    }
}
