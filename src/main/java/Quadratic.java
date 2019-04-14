
import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a:");
        double a = scanner.nextDouble();
        System.out.println("Enter b:");
        double b = scanner.nextDouble();
        System.out.println("Enter c:");
        double c = scanner.nextDouble();

        Quadratic quadratic = new Quadratic(a,b,c);
        System.out.println("Delta = " + quadratic.getDiscriminant());
        if (quadratic.getDiscriminant() <0 ){
            System.out.println("The equation has no roots.");
        } else if (quadratic.getDiscriminant() == 0){
            System.out.println("Root = " + quadratic.getRoot1());
        } else {
            System.out.println("Root 1 = " + quadratic.getRoot1());
            System.out.println("Root 2 = " + quadratic.getRoot2());
        }
    }

    double a,b,c,delta,r1,r2;
    public Quadratic(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return this.a;
    }
    public double getB() {
        return this.b;
    }
    public double getC() {
        return this.c;
    }
    public double getDiscriminant() {
        return delta = getB()*getB() - 4*getA()*getC();
    }
    public double getRoot1(){
        return r1 = (-getB() + Math.sqrt(delta))/(2*getA());
    }
    public double getRoot2(){
        return r2 = (-getB() - Math.sqrt(delta))/(2*getA());
    }
}