import java.util.Scanner;
public class q1{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        double f,cel;
        System.out.print("enter the degree in Fahrenheit:");
        f=in.nextDouble();
        cel=(f-32)*5/9;
        System.out.println(f+" Fahrenheit is "+cel+" Celsius");
        in.close();
    }
}
// output:-
// Enter a degree in Fahrenheit:54 
// 54 Fahrenheit is 12.22 Celsius



    
