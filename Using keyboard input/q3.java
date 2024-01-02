import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double salary,Da,Hra,Gross;
        System.out.print("enter the basic salary of an employee: ");
        salary=in.nextDouble();
        Da=(40/100.0*salary);
        Hra=(20/100.0*salary);
        Gross=salary+Da+Hra;
        System.out.println("DA is="+Da);
        System.out.println("HRA is="+Hra);
        System.out.println("Gross salary is="+Gross);
        in.close();
    }
}
// output:-
// Enter basic salary of an employee: 15600
// DA is 6240.0
// HRA is 3120.0
// Gross salary is 24960
