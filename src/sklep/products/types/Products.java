package sklep.products.types;

public class Products {
    public Products() {
    }


        public String brand;
        public int size;
        public String color;
        public double price;
        public int inWarehouse;

        public Products(String brand, int size, String color, double price, int inWarehouse) {
            this.brand = brand;
            this.size = size;
            this.color = color;
            this.price = price;
            this.inWarehouse = inWarehouse;
        }


                public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getInWarehouse() {
            return inWarehouse;
        }

        public void setInWarehouse(int inWarehouse) {
            this.inWarehouse = inWarehouse;
        }

        @Override
        public String toString() {
            return new StringBuilder().append(this.getBrand())
                            .append(" Kolor: ")
                            .append(this.getColor())
                    .append(" Rozmiar: ")
                    .append(this.getSize())
                    .append(" Cena: ")
                    .append(this.getPrice())
                    .toString();
        }
    }

