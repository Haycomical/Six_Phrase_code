/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sixphrase;

/**QUESTIONFind sum of all prime numbers in the array, except the smallest prime number:
Madhav has assigned the task of finding the sum of all prime number in the array, except the smallest prime number in the array. Madhav approaches you to help him do this by writing a program.
Given an array of numbers, you are expected to find the sum of all prime numbers in the given array. You must however exclude the smallest prime number while performing this addition.

For Example:
if input1={10,41,18,50,43,31,29,25,59,96,67} representing the given array and input2=11 representing the number of elements in the array, then the expected output is 241, which is the sum of all prime numbers in this array except the smallest prime number 29.

Explanation: The prime number in this array are 41,43,31,29,59 and 67.
The smallest prime number in this array is 29.
So, let us leave out 29 and add all the other prime numbers to get the output. Therefore, output=41+43+31+59+67=241.
 *
 *
 * @author user
 */

import java.util.*;
public class numoper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int res[]=new int[n+1];
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        }int j=0,k=0;
        for(int i=0;i<n;i++){
         //if(k==n-1) k=0;  
        int a=arr[i];
        int flag=0;
        for(int l=2;l<=a/2;l++){
        if(a%l==0){
         flag=1;
                continue;}
             
        }
        if(flag==0){
        res[j++]=a;}
             
        
        }
        Arrays.sort(res);
       
      int sum=0; 
      for(int i=2;i<=n;i++){
      sum+=res[i]; 
          //System.out.println(res[i]);
       }
        System.out.println(sum);
    }
    
}
