import java.util.Scanner;

public class UPPconso {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String s=sc.next();
        String res="";
        //char[] eq={'a','e','i','o','u'};
        for(int i=0;i<s.length();i++){
            char temp=s.charAt(i);

            if(temp=='a'||temp=='e'||temp=='i'||temp=='o'||temp=='u'){
                continue;
            }
            else
              res+=temp;
        }
        System.out.println(res.toUpperCase()+":"+res.length());
    }
    
}
