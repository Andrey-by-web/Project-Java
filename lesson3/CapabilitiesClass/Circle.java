package lesson3.CapabilitiesClass;

 import java.lang.Math;

public class Circle {
    private double radius;

   public Circle(double radius){
       this.radius = radius;
    }

    void setSqueare(double radius){
        this.radius = radius;
    }

    public void calculateArea(){
        double squeare = Math.PI * Math.pow(radius, 2.0);
        System.out.println("Площадь круга равна " + squeare);
    }
}
