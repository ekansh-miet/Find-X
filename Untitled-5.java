import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int ans=0;
        for(int i=1;i<=n;i++){
            if(x%i==0 && x/i<=n){
                ans++;
            }
        }
        System.out.println(ans);
    }
}