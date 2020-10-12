package lesson3.CapabilitiesClass;

public class Product {

    private String productName;
    private double regularPrise;
    private double discount;

    public Product(String productName, double regularPrise, double discount){
        this.productName = productName;
        this.regularPrise = regularPrise;
        this.discount = discount;
    }
    public void setProductName(String productName){
        this.productName = productName;
    }
    public String getProductName(){
        return productName;
    }
    public void setRegularPrise(double regularPrise){
        this.regularPrise = regularPrise;
    }
    public double getRegularPrise (){
        return regularPrise;
    }
    public void setDiscount(double discount){
        this.discount = discount;
    }
    public double getDiscount(){
        return discount;
    }
    public double actualPrice(){
        double actualPrc;
        double temp = regularPrise / 100 * discount;
        return actualPrc = regularPrise - temp;
    }
    public void printInformation(){
        System.out.print("Наименование продукта: " + productName);
        System.out.print(" , стоимость продукта: " + regularPrise);
        System.out.println(" , стоимость со скидкой: " + actualPrice());
    }
}
