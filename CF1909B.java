import java.util.*;
public class CF1909B{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long[] arr = new long[n];
            for(int i = 0; i<arr.length; i++){
                arr[i] = sc.nextLong();
            }

            long ans = 0;
            for(int i = 1; i<=60; i++){
                long k = 1L << i;

                HashSet<Long> map = new HashSet<>();
                for(int j = 0; j<n; j++){
                    map.add(arr[j]%k);
                }
                if(map.size() == 2){
                    System.out.println(k);
                    break;
                }
            }
            // long ans = 0;
            // int i = 1;
            // while(true){
            //     long k = (long)Math.pow(2,i);

            //     HashSet<Long> set = new HashSet<>();
            //     for(int j = 0; j<n; j++){
            //         set.add(arr[j]%k);
            //     }
            //     if(set.size() == 2){
            //         ans = k;
            //         break;
            //     }
            //     i++;
            // }
            System.out.println(ans);
        }
    }
}