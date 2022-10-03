import java.util.Scanner;

public class AngleTraingle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the first angle:");
       int a1=in.nextInt();
        System.out.println("Enter the second angle:");
        int a2=in.nextInt();
        System.out.println("enter the third angle:");
        int a3=in.nextInt();


            if (a1+a2+a3==180 && a1>0 && a2 >0 && a3 > 90){
                System.out.println("Right angled traingle is valid");
            }
            else{
                System.out.println(" Right angled traingle is invalid");
            }
        }
    }

