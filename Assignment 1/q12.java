import java.util.Scanner;
public class q12 {
    public static void main(String arg[]){
        System.out.printf("Enter 3 numbers:");
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b =sc.nextInt();
        int c=sc.nextInt();
        int av=(a+b+c)/3;
        System.out.printf("Average: %d",av);

    }
    
}
