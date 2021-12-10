import java.util.Scanner;
public class q13{
    public static void main(String arg[]){
        System.out.println("Enter width and height:");
        Scanner sc= new Scanner(System.in);
        double w= sc.nextDouble();
        double h=sc.nextDouble();
        double ar=w*h;
        double p=2*(w+h);
        System.out.printf("Width=%.1f Height=%.1f\n" ,w,h);
        System.out.printf("Area is= %.2f\n" ,ar);
        System.out.printf("Perimeter is =%.2f" ,p);
    }

    
}
