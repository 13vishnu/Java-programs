import java.util.Scanner;

public class CheckAge {
    public void CalculateAge(){
        int age;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your age:");
        age= in.nextInt();
        if(age>=18){
            System.out.println("You are eligible for vote");
        }
        else{
            System.out.println("you are not eligible for vote");
        }

    }

    public static void main(String[] args) {
        CheckAge obj=new CheckAge();
        obj.CalculateAge();
    }

}
