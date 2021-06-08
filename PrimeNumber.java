import java.util.*;

class PrimeNumber{
 
  public static void main(String[] args)
  
  {
    Scanner scn=new Scanner(System.in);
    
     System.out.println("Enter no.");
    int n=scn.nextInt();
    int count=0;
    for(int i=2;i<=n-1;i++){
      
      if(n%i==0){
       count++;
      }


    }
    if(count==0){
      System.out.println(n+"  is a prime no.");
    }
    else{
      System.out.println(n+"  is not a prime no.");
    }
  }
}