import java.util.Scanner;

public class Areas {
    public void circle(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Radius");
        int r= in.nextInt();
        double pi=3.14159265;
        double result=pi*r*r;
        System.out.println("Area of circle :"+result);
    }
    public void square(){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the side");
        int s= in.nextInt();
        int result=s*s;
        System.out.println("Area of square:"+result);

    }
    public void traingle(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the a value");
        System.out.println("Enter the b value");
        int a=in.nextInt();
        int b= in.nextInt();
        int result=(a*b)/2;
        System.out.println("Area of Right angled traingle:"+result);
    }

    public static void main(String[] args) {
        Areas obj=new Areas();
        obj.circle();
        obj.square();
        obj.traingle();
    }

}
