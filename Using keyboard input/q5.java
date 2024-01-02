import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the radius of the hemisphere: ");
        double radius,surface,volume;
        radius=in.nextDouble();
        surface=(3*3.14*radius*radius);
        volume=(2/3.0*3.14*radius*radius*radius);
        System.out.println("The surface area of the hemisphere="+surface);
        System.out.println("The volume area of the hemisphere="+volume);
        in.close();
    }
}
// output:-
// Enter the radius of the hemisphere: 7.0 
// The surface area of the hemisphere is 461.814 
// The volume area of the hemisphere is 718.377

