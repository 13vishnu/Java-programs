import java.util.Scanner;

public class DayCalculation {
    public void calculate(){
        int d,m,r;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the days:");
        d=in.nextInt();
        m=d/31;

        System.out.println("month:"+m);
        r=d%31;
        System.out.println("remaining days:"+r);
    }

    public static void main(String[] args) {
        DayCalculation obj=new DayCalculation();
        obj.calculate();
    }
}
