import java.util.*;
public class sumofunitsinINCRE {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int res=0;
        for(int i=0;i<n;i++){
            int ans=1;
           ans= power(arr[i],i);
          // System.out.println(ans);
           ans=ans*ans;
           res+=ans;
           //System.out.println(res);
            
        }
        System.out.println(res);
        

    }
    public static int power(int num,int p){
        if(num==1) return 1;
        int div=(int) Math.pow(10, p);
        num=num/div;
        return num;
    }
    
}
