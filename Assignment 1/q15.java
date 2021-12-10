import java.util.Scanner;
public class q15 {
    public static void main(String arg[]){
        System.out.println("Enter two numbers: ");
        Scanner sc= new Scanner(System.in);
        int a,b,temp;
        a= sc.nextInt(); 
        b=sc.nextInt();
        System.out.printf("Before swapping: a= %d b= %d\n" ,a,b);    
        temp=a;                                                    
        a=b;                                                        
        b=temp;                                                       
        
        System.out.printf("After swapping: a= %d b= %d" ,a,b);
    }
}
