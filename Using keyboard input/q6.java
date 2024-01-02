import java.util.Scanner;
public class q6{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the number of seconds: ");
        double distance,time;
        time=in.nextDouble();
        distance=(1/2.0)*32.174*time*time;
        System.out.println("Distance travelled:"+distance);
        in.close();
    }
}
// output:-
// Enter the number of seconds: 5.4 
// Distance travelled: 469.096

    
