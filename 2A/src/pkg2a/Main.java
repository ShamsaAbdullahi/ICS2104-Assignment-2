package pkg2a;
import java.util.Scanner;

public class Main {
     public static void convertbinary(int num)
     {
    int binary[];    
       binary = new int[40];
    int index = 0;    
    while(num > 0){    
      binary[index++] = num%2;    
      num = num/2;  
      
    } 
    System.out.println("Decimal to Binary:");
    for(int i = index-1;i >= 0;i--){    
       System.out.print(binary[i]);    
    }    
System.out.println();//new line 
    
    }
public static void converthexadecimal(int num){
        
       int rem;       
     // For storing result
    String str2; 
       str2 = "";

    // Digits in hexadecimal number system
    char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
// 
   while(num>0)
   {
      rem=num%16; 
      str2=hex[rem]+str2; 
      num=num/16;
       
     }
    System.out.println("Decimal to hexadecimal:\n "+str2);
     
  }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
         System.out.println("choose the choice you want\n");
 
         System.out.println("choice 1:input your own number");
         System.out.println("choice 2:output the table");
         int choice=input.nextInt();
        switch (choice){
            case 1:
                System.out.println("enter the number you wish to convert");
                
                int number=input.nextInt();
                convertbinary(number);
          converthexadecimal(number);
          break;
            case 2:
               int[]a=new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,31,100,255,256};
      
            int index=0;
            do{
//            while(index<a.length)
//            {
                System.out.println("Decimal number");
              System.out.println(a[index]+"");
             
           int al=a[index];
           convertbinary(al);
          converthexadecimal(al);
     
     
     index++;
            }while(index<23); 
             break;
            default:
             System.out.println("you didnt choose");
}    
        
       
        
        
        
  }
  
}
