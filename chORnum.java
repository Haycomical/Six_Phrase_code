import java.util.Scanner;
public class chORnum {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int check=sc.nextInt();
        String []str=new String [10];
        int []num=new int [10];
        int  a=0;
        String st="";
        for(int i=0;i<s.length();i++){
            char cur=s.charAt(i);
            if(Character.isDigit(cur)){
             a+=Integer.parseInt(String.valueOf(s.charAt(i)));
            }
            else{
                st+=s.charAt(i);
            }


        }
switch (check) {
    case 0:
        if(a==0)
         System.out.print("Zero");

        else
         System.out.println(a);
        break;

    case 1:
     if(st.isEmpty())
      System.out.println("ZERO");

    else
     System.out.println(st);
       break;

    default:
        break;
}



    }
   // public static int isnum(String s){
       

    

    
}
