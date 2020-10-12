package lesson3.CapabilitiesClass;

public class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product("Конфеты", 12.20, 20.0);

        product.printInformation();
        product.setProductName("Морженное");
        product.setRegularPrise(2.50);
        product.setDiscount(5.0);
        product.printInformation();
        product.setProductName("Пирожки");
        product.setRegularPrise(4.30);
        product.setDiscount(7.0);
        product.printInformation();

    }
}
