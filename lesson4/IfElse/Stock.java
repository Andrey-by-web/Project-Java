package lesson4.IfElse;

public class Stock {
    private String companyName;
    private double currentPrise;
    private double maxPrise;
    private double minPrise;

    public Stock(String companyName, double currentPrise, double maxPrise, double minPrise){
        this.companyName = companyName;
        this.currentPrise = currentPrise;
//        this.maxPrise = maxPrise;
//        this.minPrise = minPrise;
    }
//    public Stock(){
//        this.companyName = null;
//        this.currentPrise = 0.0;
//        this.maxPrise = 0.0;
//        this.minPrise = 0.0;
//    }
    void setCompanyName (String companyName){
        this.companyName = companyName;
    }
//    void setCurrentPrise (double currentPrise){
//        this.currentPrise = currentPrise;
//    }
//    void setMaxPrise (double maxPrise){
//        this.minPrise = maxPrise;
//    }
//    void setMinPrise (double minPrise){
//        this.minPrise = minPrise;
//    }
    String getCompanyName(){
        return companyName;
    }
    double getCurrentPrise(){
        return currentPrise;
    }
    double getMaxPrise(){
        return maxPrise;
    }
    double getMinPrise(){
        return minPrise;
    }
    public void updatePrise (double currentPrise, double maxPrise, double minPrise){
        this.currentPrise = currentPrise;
        this.maxPrise = maxPrise;
        this.minPrise = minPrise;
    }
    public void printInformation(){
        System.out.print("Company: " + companyName);
        System.out.print(", current prise: " + currentPrise);
        System.out.print(", max prise: " + maxPrise);
        System.out.println(", min prise: " + minPrise + ";");
    }
}
