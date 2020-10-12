package lesson3.CapabilitiesClass;


class Human {
    private String humanName;
    private int ageHuman;


    Human(String humanName, int ageHuman){
        this.humanName = humanName;
        this.ageHuman = ageHuman;
    }

    public void greet(){
        System.out.println("My name is " + humanName);
        System.out.println("I`m " + ageHuman);
    }
}
