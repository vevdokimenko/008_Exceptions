package homework.task3;

public class Price {
    private String product;
    private String shop;
    private double priceUAH;

    public Price(String[] args) {
        this.product = args[0].trim();
        this.shop = args[1].trim();
        this.priceUAH = Double.parseDouble(args[2].trim());
    }

    public String getShop() {
        return shop;
    }

    @Override
    public String toString() {
        return
                "Продукт: " + product +
                " Магазин: " + shop +
                " Цена: " + priceUAH;
    }
}
