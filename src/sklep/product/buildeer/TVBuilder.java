package sklep.product.buildeer;

import sklep.products.types.TV;

public class TVBuilder {

    private TV tv = new TV();

    public TVBuilder brand (String brand) {
        this.tv.setBrand(brand);
        return this;
    }
}
