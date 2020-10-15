package lesson4.IfElse;

public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetector detector = new LightColorDetector();

        String result = detector.detect(391);
        System.out.println(result);
        result = detector.detect(100);
        System.out.println(result);
        result = detector.detect(501);
        System.out.println(result);
        result = detector.detect(691);
        System.out.println(result);
        result = detector.detect(751);
        System.out.println(result);
    }
}
