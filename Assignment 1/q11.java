import java.util.Scanner;
public class q11 {
    public static void main(String arg[]){
        System.out.println("Enter the radius:");
        Scanner sc= new Scanner(System.in);
        double r= sc.nextDouble();
        double pi=3.14159265358979323846;
        double p=2*pi*r;
        double ar= pi*r*r;
        System.out.printf(" Area: %.14f\n" ,ar);
        System.out.printf(" Perimeter: %.14f\n" ,p);
    }
    
}
