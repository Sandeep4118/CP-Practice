import java.util.*;
public class CF1914D{
    static class Pair {
        int val;
        int idx;

        Pair(int val, int idx) {
            this.val = val;
            this.idx = idx;
        }
    }

    public static ArrayList<Integer> findmax(int[]arr){
        ArrayList<Pair> temp = new ArrayList<>();
        for(int i = 0; i<arr.length; i++){
            temp.add(new Pair(arr[i],i));
        }

        // decending order
        temp.sort((a,b) -> b.val - a.val);

        ArrayList<Integer> ans = new ArrayList<>();

        // taking the top 3 elements
        for(int i = 0; i<3; i++){
            ans.add(temp.get(i).idx);
        }
        return ans;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();

            int[]a = new int[n];
            for(int i = 0; i<n; i++){
                a[i] = sc.nextInt();
            }

            int[]b = new int[n];
            for(int i = 0; i<n; i++){
                b[i] = sc.nextInt();
            }

            int[]c = new int[n];
            for(int i = 0; i<n; i++){
                c[i] = sc.nextInt();
            }

            ArrayList<Integer> mexa = findmax(a);
            ArrayList<Integer> mexb = findmax(b);
            ArrayList<Integer> mexc = findmax(c);

            int maxi = Integer.MIN_VALUE;
            for(int i = 0; i<3; i++){
                for(int j = 0; j<3; j++){
                    for(int k = 0; k<3; k++){
                        int x = mexa.get(i);
                        int y = mexb.get(j);
                        int z = mexc.get(k);

                        if((x==y) || (y==z) || (z==x)) continue;
                        maxi = Math.max(maxi,a[x]+b[y]+c[z]);
                    }
                }
            }
            System.out.println(maxi);
        }
    }
}