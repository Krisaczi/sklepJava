package sklep.products.types;

public class Phone extends Products{
    public String batteryType;
    public String chargerType;

    public Phone() {
    }

    public Phone(String brand, int size, String color, double price, int inWarehouse, String batteryType, String chargerType) {
        super(brand, size, color, price, inWarehouse);
        this.batteryType = batteryType;
        this.chargerType = chargerType;
    }

    public String getBatteryType() {
        return batteryType;
    }

    public void setBatteryType(String batteryType) {
        this.batteryType = batteryType;
    }

    public String getChargerType() {
        return chargerType;
    }

    public void setChargerType(String chargerType) {
        this.chargerType = chargerType;
    }

    @Override
    public String toString() {
        return super.toString() + " Bateria: " + this.batteryType + " Ładowarka: " + this.chargerType;
    }
}
