package pkg2b;
import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);  
    
    int choice;
    System.out.println("1. Enter number to be converted"
            + "\n2. Generate random numbers"
            + "\nEnter choice 1 or 2");
    choice=scn.nextInt();

    switch(choice){
        
        case 1:
        {
         double num,fractionalPart= 0,number;
    int rem=0,integralPart,k;
    int count=0,index=0, integralPart1=0,counter=-1;
    double fractionalPart1=0;
    StringBuilder s=new StringBuilder();
    
    System.out.println("Enter the number");
    num=scn.nextDouble();    //112.564
   // System.out.println("Enter number upto which precision is required");
   // k=scn.nextInt(); 
   //5
   k=5;
    System.out.print("Output is ");
    int n=(int) num;
    fractionalPart=num-n;
    while(n!=0) {
      rem=n%2;
      n=n/2;
      s.insert(0,rem);
    }
    System.out.print(s+".");
   // System.out.println(s+"here3"); 
    s=new StringBuilder();
    while(k!=0) {
      integralPart=(int) (fractionalPart*2);
      s.append(integralPart);
      number=fractionalPart*2;
      fractionalPart=number-integralPart;
      k--;
    
       
    }
  
   System.out.println(s); 
  String ss=s.toString();
  //System.out.println(ss);
   float ik=Float.parseFloat(ss);  
   float ok=(ik/100000);
  //System.out.println(ok+"here");  
  //float in=ok-ik;
 // System.out.println(num+"here2");
  int b=(int)num;
  //System.out.println(b);
  double c=(float)num-b;
 // System.out.printf("%.5f",c);
  //System.out.println();
  
  
   index=ss.indexOf(".");
    for(int i=index-1;i>=0;i--) {
      int number1=ss.charAt(i)-'0';
      double temp=number1*Math.pow(2,count);
      integralPart1+=temp;
      count++;
    }
    
    for(int i=index+1;i<s.length();i++) {
      int number1=ss.charAt(i)-'0';
      double temp=number1*Math.pow(2, counter);
      fractionalPart1+=temp;
      counter--;
    }
    fractionalPart1+=integralPart1;
    //System.out.print("The Output is: ");
    //System.out.print(fractionalPart1);
    
    if(fractionalPart1==c)
    {
        System.out.println("EXACT");
    }
    else
    {
       System.out.println("APPROXIMATE"); 
    }
        break;
        
        }
     
        case 2:
        {
           int min=0;
      int max=100;
      //Generate random double value from 50 to 100 
      
      
    System.out.println("Random value in double from "+min+" to "+max+ ":");
      for(int ij=0;ij<=30;ij++){
    float random_float = (float) (Math.random() * (max - min + 1) + min); 
      System.out.format("%.3f",random_float);
       System.out.println();
     
    double num,fractionalPart= 0,number;
    int rem=0,integralPart,k;
     int count=0,index=0, integralPart1=0,counter=-1;
    double fractionalPart1=0;
    StringBuilder s=new StringBuilder();
    
    //System.out.println("Enter the number");
    //num=scn.nextDouble();    //112.564
   // System.out.println("Enter number upto which precision is required");
   // k=scn.nextInt(); 
   //5
   k=5;
    System.out.print("Output is ");
    int n=(int) random_float;
    fractionalPart=random_float-n;
    while(n!=0) {
      rem=n%2;
      n=n/2;
      s.insert(0,rem);
    }
    System.out.print(s+".");
   // System.out.println(s+"here3"); 
    s=new StringBuilder();
    while(k!=0) {
      integralPart=(int) (fractionalPart*2);
      s.append(integralPart);
      number=fractionalPart*2;
      fractionalPart=number-integralPart;
      k--;
    
       
    }
  
   System.out.println(s); 
       
     String ss=s.toString();
  //System.out.println(ss);
   float ik=Float.parseFloat(ss);  
   float ok=(ik/100000);
  //System.out.println(ok+"here");  
  //float in=ok-ik;
 // System.out.println(num+"here2");
  int b=(int)random_float;
  //System.out.println(b);
  double c=(float)random_float-b;
 // System.out.printf("%.5f",c);
  //System.out.println();
  
  
   index=ss.indexOf(".");
    for(int i=index-1;i>=0;i--) {
      int number1=ss.charAt(i)-'0';
      double temp=number1*Math.pow(2,count);
      integralPart1+=temp;
      count++;
    }
    
    for(int i=index+1;i<s.length();i++) {
      int number1=ss.charAt(i)-'0';
      double temp=number1*Math.pow(2, counter);
      fractionalPart1+=temp;
      counter--;
    }
    fractionalPart1+=integralPart1;
    //System.out.print("The Output is: ");
    //System.out.print(fractionalPart1);
    
    if(fractionalPart1==c)
    {
        System.out.println("EXACT");
    }
    else
    {
       System.out.println("APPROXIMATE"); 
    }
    
    
    }
        
        }
    }
       
    
        
   
       
     } 
}
        
        
   