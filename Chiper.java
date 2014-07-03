

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
       str=str.replaceAll("\\s+","");
       
       String str1="";
       int len=str.length();
       double sqrtlen=Math.sqrt(len);
       
       int sqrtFloor=(int) Math.floor(sqrtlen);
       int mainNum=(int)Math.pow(sqrtFloor,2);
       
      // System.out.println(mainNum);
       if(len%sqrtFloor!=0)
       {
           str=str+"*";
           len=str.length();
       
        }
       if(len%sqrtFloor!=0)
       {
           str=str+"*";
           len=str.length();
        }
        //System.out.println(str);
      // System.out.println(len);
       
        int lenLoop = len-(sqrtFloor-1);
        int ini=0;
        while(ini<sqrtFloor)
        {
        
       for(int i=ini;i<lenLoop;i=i+sqrtFloor)
       {
             System.out.println(i);   
           str1=str1+str.charAt(i);
          
     }
     ini=ini+1;
     lenLoop=lenLoop+1;
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
       double sqrtlen=Math.sqrt(len);
       
       int sqrtFloor=(int) Math.floor(sqrtlen);
       int mainNum=(int)Math.pow(sqrtFloor,2);
       
       System.out.println(mainNum);
       
       System.out.println(len);
       double div=len/4f;
       System.out.println(div);
  
       double diff= Math.round(div);
       System.out.println(diff);
       sqrtFloor=(int)diff+1;    // 5
       //sqrtFloor=sqrtFloor+2;
          
       
       //if(len%sqrtFloor==0)
       //{
        int lenLoop = len-(sqrtFloor-1);
        int ini=0;
            while(ini<sqrtFloor)
        {
           for(int i=ini;i<=lenLoop;i=i+sqrtFloor)
           {
               str1=str1+str.charAt(i);
           }
           ini=ini+1;
           lenLoop=lenLoop+1;
        }
         
            System.out.println("Decrypted String");
            System.out.println("----------------");
            
          if(str1.contains("*"))
            {
           int starPos=str1.indexOf("*");
           str1=str1.substring(0,starPos);
        } 
           System.out.println(str1);
     // }
      // else
     //  {
           //System.out.println("Enter Correct Decryption Text");
      // }
       break;
    }
    
    default:
    {
        System.out.println("Enter Correct Choice");
    }
}

} 
}
 
}
