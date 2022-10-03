import java.util.Scanner;

public class Arithmetic {

    public void add(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1=in.nextInt();
        int num2=in.nextInt();
        int result=num1+num2;
        System.out.println("Addition ="+result);
    }
    public int sub(int a,int b){
        return (a-b);
    }
    public int multiply(int a,int b){
        return (a*b);

    }
    public void division(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1=in.nextInt();
        int num2=in.nextInt();
        int result=num1/num2;
        System.out.println("Division ="+result);
    }
    public int modulus(int a,int b){
        return (a%b);
    }

    public static void main(String[] args) {

        Arithmetic obj=new Arithmetic();
        obj.add();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1=in.nextInt();
        int num2=in.nextInt();
        System.out.println("Subtraction ="+obj.sub(num1,num2));


        System.out.println("multiplication ="+obj.multiply(num1,num2));


        obj.division();


        System.out.println("modulus ="+obj.modulus(num1,num2));
    }
}
