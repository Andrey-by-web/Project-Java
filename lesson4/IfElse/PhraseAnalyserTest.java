package lesson4.IfElse;

import java.util.Scanner;

public class PhraseAnalyserTest {
    public static void main(String[] args) {
        PhraseAnalyser analyser = new PhraseAnalyser();
        String result = analyser.analyse("Make to great again");
        System.out.println(result);
        result = analyser.analyse("to great again");
        System.out.println(result);
        result = analyser.analyse("hello");
        System.out.println(result);
    }
}