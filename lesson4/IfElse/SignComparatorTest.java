package lesson4.IfElse;

public class SignComparatorTest {
    public static void main(String[] args) {
        SignComparator signComp = new SignComparator();
        signComp.setNumber(18);
        signComp.compare();
        signComp.setNumber(-21);
        signComp.compare();
        signComp.setNumber(0);
        signComp.compare();
    }
}
