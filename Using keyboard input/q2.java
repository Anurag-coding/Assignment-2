import java.util.Scanner;
public class q2{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        double km,meter,feet,inch,centimeter;
        System.out.print("enter the distance in km=");
        km=in.nextDouble();
        meter=km*1000;
        feet=km*3280.8399;
        inch=km*39370.0787;
        centimeter=km*100000;
        System.out.println(km+" km is "+meter+" meters");
        System.out.println(km+" km is "+feet+" feet");
        System.out.println(km+" km is "+inch+" inch");
        System.out.println(km+" km is "+centimeter+" centimeters"); 
        in.close();
    }
}
// output:-
// Enter the distance in km=165
// 165 km is 165000 meters
// 165 km is 541338.5835 feet
// 165 km is 6496062.9854999995 inch
// 165 km is 16500000 centimetres
        