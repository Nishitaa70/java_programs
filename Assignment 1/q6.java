import java.util.Scanner;
public class q6 {
    public static void main(String args[]){
        System.out.println(" Enter two numbers: ");
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        int y=sc.nextInt();
        int add= x+y;
        int sub=x-y;
        int mul=x*y;
        int div=x/y;
        int mod= x%y;
        System.out.printf("%d + %d = %d\n",x,y,add);
        System.out.printf("%d - %d = %d\n",x,y,sub);
        System.out.printf("%d x %d = %d\n",x,y,mul);
        System.out.printf("%d / %d = %d\n",x,y,div);
        System.out.printf("%d mod %d = %d",x,y,mod);
    }
    
}
