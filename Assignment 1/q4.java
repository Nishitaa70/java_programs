import java.util.Scanner;
public class q4 {
    public static void main(String args[]){
        
        System.out.println("Enter 9 numbers :");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        int f= sc.nextInt();
        int g=sc.nextInt();
        int h=sc.nextInt();
        int i= sc.nextInt();
        int x=-a+b*c;
        int y =(d+e)%e;
        int z=f+ -g*a/b;
        int k=a+h/g*i-b%g;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(k);

    }
    
}
