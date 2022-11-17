package sklep.data;
import sklep.products.types.Phone;
import sklep.products.types.TV;
import sklep.products.types.Products;

import java.util.ArrayList;
import java.util.List;

public class ProductsDB {

    private List<Products> products = new ArrayList<>();

    public ProductsDB(){
        this.products.add(new TV("Panasonic", 44, "Silver",1200.00,45,50,"LCD"));
        this.products.add(new TV("Samsung", 65, "Black",1600.00,55,40,"QLED"));
        this.products.add(new Phone("iPhone", 10,"Red",359.00,55,"Li-On","Wireless"));
        this.products.add(new Phone("Motorola", 10,"Purple",659.00,44,"Li","Wire"));


    }

    public List<Products> getProducts() {
        return products;
    }


    public static void listProducts(List<Products> products){
        for (Products  element : products){
            System.out.println(element);


        }
    }
    public void addProducts(Products products){
        this.products.add(products);
    }


}
