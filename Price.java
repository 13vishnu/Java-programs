import java.util.Scanner;

public class Price {
    public static void main(String[] args) {
        System.out.println("Enter Quantity:");
        Scanner in=new Scanner(System.in);
        int q=in.nextInt();
        System.out.println("Enter price:");
        double p= in.nextInt();
        if(q>=10){
            p=0.10*p;
            System.out.println("The total dicounted price is"+p);
        }
        else{
            System.out.println("no discount!!!");
        }
    }
}
