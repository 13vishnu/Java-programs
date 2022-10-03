import java.util.Scanner;

public class GreaterNumbers {
    public void greater(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a value:");
        System.out.println("Enter b value:");
        int num1=in.nextInt();
        int num2=in.nextInt();
        if(num1>num2){
            System.out.println(" a is greater than b");
        }
        else{
            System.out.println("b is greater than a");
        }

    }

    public static void main(String[] args) {
        GreaterNumbers obj= new GreaterNumbers();
        obj.greater();


    }
}
