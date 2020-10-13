package lesson4.IfElse;

public class SignComparator {
    private int number;


    public void setNumber(int number){
        this.number = number;
    }
    public int getNumber(){
        return number;
    }

    public void compare(){
        if(number > 0){
            System.out.println("number " + number + " is positive");
        }
        else if(number < 0){
            System.out.println("number " + number + " is negative");
        }
        else if(number == 0){
            System.out.println("number " + number + " is equal zero");
        }
    }
}
