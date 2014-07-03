
import java.util.*;
public class Chiper
{
   public static void main(String args[])
   {
       
       Scanner s = new Scanner(System.in);
       Scanner s1 = new Scanner(System.in);
       Scanner s2 = new Scanner(System.in);
       System.out.println("HI WELCOME TO TEXT ENCRYPTION AND DECRYPTION");
       System.out.println("--------------------------------------------");
       System.out.println("Please Select whether to Encrypt or Decrypt");
       System.out.print("Press 1 to Encrypt and 2 to Decrypt  -  ");
       int choice=s.nextInt();
       switch(choice)
       {
     case 1:
     {
       System.out.println("You Selected ENCRYPTION");
       System.out.println("-----------------------");
       System.out.println("Enter  String to Encrypt  ");
       String str=s1.nextLine();
       String str1="";
       int len=str.length();
       if(len%3!=0)
       {
           str=str+"*";
           len=str.length();
       
        }
       if(len%3!=0)
       {
           str=str+"*";
           len=str.length();
        }
        // System.out.println(str);
       // System.out.println(len);
       
        
       for(int i=0;i<len-2;i=i+3)
       {
                str1=str1+str.charAt(i);
       }
       for(int i=1;i<len-1;i=i+3)
       {
                str1=str1+str.charAt(i);
       }
       for(int i=2;i<len;i=i+3)
       {
                str1=str1+str.charAt(i);
       }
       System.out.println("Encrypted String");
       System.out.println("----------------");
       System.out.println(str1);
       break;
   
   }
   case 2:
    {
       System.out.println("You Selected DECRYPTION");
       System.out.println("-----------------------");
       System.out.println("Enter  String to Decrypt");
       String str=s2.nextLine();
       String str1="";
       int len=str.length();
       if(len%5==0)
       {
           for(int i=0;i<=len-4;i=i+5)
           {
               str1=str1+str.charAt(i);
           }
            for(int i=1;i<=len-3;i=i+5)
           {
               str1=str1+str.charAt(i);
           }
            for(int i=2;i<=len-2;i=i+5)
           {
               str1=str1+str.charAt(i);
           }
            for(int i=3;i<=len-1;i=i+5)
           {
               str1=str1+str.charAt(i);
           }
            for(int i=4;i<=len;i=i+5)
           {
               str1=str1+str.charAt(i);
           }
            System.out.println("Decrypted String");
            System.out.println("----------------");
           int starPos=str1.indexOf("*");
           String strFin=str1.substring(0,starPos);
           System.out.println(strFin);
       }
       else
       {
           System.out.println("Enter Correct Decryption Text");
       }
       break;
    }
    default:
    {
        System.out.println("Enter Correct Choice");
    }
    
}
} 
}
