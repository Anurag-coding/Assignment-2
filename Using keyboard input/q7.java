
public class q7 {
    public static void main(String[] args) {
        System.out.println("a\tb\tpow(a,b)");
        int c=1;
        System.out.println(c+"\t"+(c+1)+"\t"+(int)Math.pow(c,(c+1)));
        c++;
        System.out.println(c+"\t"+(c+1)+"\t"+(int)Math.pow(c,(c+1)));
        c++;
        System.out.println(c+"\t"+(c+1)+"\t"+(int)Math.pow(c,(c+1)));
        c++;
        System.out.println(c+"\t"+(c+1)+"\t"+(int)Math.pow(c,(c+1)));
        c++;
        System.out.println(c+"\t"+(c+1)+"\t"+(int)Math.pow(c,(c+1)));
    }
}
// output:-
// a  b  pow(a, b)
// 1  2  1 
// 2  3  8 
// 3  4  81 
// 4  5  1024 
// 5  6  15625
