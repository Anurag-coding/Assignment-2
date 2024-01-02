import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter number between 0 to 1000: ");
        int n,Sum=0;
        n=in.nextInt();
        Sum=Sum+n%10;
        n=n/10;
        Sum=Sum+n%10;
        n=n/10;
        Sum=Sum+n%10;
        System.out.println("The sum of the digits is "+Sum);
        in.close();
    }
}
// output:-
// Enter a number between 0 and 1000: 999
// The sum of the digits is 27

