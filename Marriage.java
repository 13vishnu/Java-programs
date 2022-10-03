import java.util.Scanner;

public class Marriage {
    public static void main(String[] args) {
        System.out.println("enter 1 =if Married");
        System.out.println("enter 2=if male unmarried");
        System.out.println("enter 3=if female unmarried");
        Scanner in=new Scanner(System.in);
        int c= in.nextInt();
        if(c==1){
            System.out.println("Driver is insured");
        }
        else{
            System.out.println("Enter age:");
            int age=in.nextInt();
            if(c==2 && age >30){
                System.out.println("Driver is insured");
            } else if (c==3 && age>25) {
                System.out.println("Driver is insured");

            }
            else{
                System.out.println("Driver is not insured");
            }
        }

    }
}
