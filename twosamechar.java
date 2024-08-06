import java.util.*;
public class twosamechar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String []arr=s.split(":");
        String res="";
        for(int i=0;i<arr.length;i++){
                if(arr[i].length()==2){
            char fir=arr[i].charAt(0);
            char sec=arr[i].charAt(1);
        if(fir==sec){
            res+=fir;
        }
        else 
          {
            int ch1=(int )fir;
            int ch2=(int )sec;
            int ans=ch1>ch2?ch1-ch2:ch2-ch1;
            char r=(char) ((char) 96+ans);
            res+=r;
          }
        
        }
        

            else continue;
        }
        
        System.out.println(res.toUpperCase());

    }
    
}
