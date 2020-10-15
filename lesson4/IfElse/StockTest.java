package lesson4.IfElse;

public class StockTest {
    public static void main(String[] args) {
        Stock stock = new Stock("GOOG", 10, 5, 15);
        stock.printInformation();
        stock.setCompanyName("Explorer");
        stock.updatePrise(18.7, 19.8, 12.0);
        stock.printInformation();
        stock.updatePrise(16, 19, 13);
        stock.printInformation();
    }
}
