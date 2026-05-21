import java.util.*;
public class CF1872D{
    public static long gcd(long a, long b){
        while(b!=0){
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static long lcm(long a, long b){
        return (a * b)/gcd(a,b);
    }
    public static long countsum(long start, long end){
        return ((start + end) * (end - start + 1))/2;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextInt();
            long x = sc.nextInt();
            long y = sc.nextInt();

            long count1 = (n/x) - (n/lcm(x,y));
            long count2 = (n/y) - (n/lcm(x,y));

            long ans = countsum(n-count1+1,n) - countsum(1,count2);
            System.out.println(ans);
        }
    }
}