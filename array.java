import java.util.*;
class Array
{
   public static void main(String[ ] args)
   {
      int[ ] arr= new int[5];
     String[ ] str=new String[5];
     boolean[ ] bool=new boolean[5];
     double[ ] dou=new double[5];
     char[ ] cha=new char[5];
     long[ ] lon=new long[5];
     short[ ] sho=new short[5];
     byte[ ] by=new byte[5];
     float[ ] flo=new float[5];
     Scanner sc=new Scanner(System.in);
     for(int i=0;i<=4;i++)
     {
       System.out.println("Enter data of int datatype");
       arr[i]=sc.nextInt();
     }
    for(int i=0;i<=4;i++)
    {   
      System.out.println("Enter data of string datatype");
      str[i]=sc.next();
    }
    for(int i=0;i<=4;i++)
     {
       System.out.println("Enter data of boolean datatype");
       bool[i]=sc.nextBoolean();
    }
    for(int i=0;i<=4;i++)
     {
       System.out.println("Enter data of double datatype");
       dou[i]=sc.nextDouble();
     }
     for(int i=0;i<=4;i++)
     {
       System.out.println("Enter data of character datatype");
       cha[i]=sc.next().charAt(0);
     }
     for(int i=0;i<=4;i++)
     {
       System.out.println("Enter data of long datatype");
       lon[i]=sc.nextLong();
     }
     for(int i=0;i<=4;i++)
     {
       System.out.println("Enter data of short datatype");
       sho[i]=sc.nextShort();
    }
     for(int i=0;i<=4;i++)
     {
       System.out.println("Enter data of byte datatype");
       by[i]=sc.nextByte();
     }
      for(int i=0;i<=4;i++)
     {
       System.out.println("Enter data of float datatype");
       flo[i]=sc.nextFloat();
    }
    System.out.println();
    System.out.println("Array of int=");
    for(int i=0;i<=4;i++)
    {
      System.out.print(arr[i]+" ");
   }
    System.out.println();
     System.out.println("Array of string =");
    for(int i=0;i<=4;i++)
    {
      System.out.print(str[i]+" ");
   }
    System.out.println();
   System.out.println("Array of boolean =");
    for(int i=0;i<=4;i++)
    {
      System.out.print(bool[i]+" ");
   }
    System.out.println();
    System.out.println("Array of long =");
    for(int i=0;i<=4;i++)
    {
      System.out.print(lon[i]+" ");
   }
   System.out.println();
   System.out.println("Array of short=");
    for(int i=0;i<=4;i++)
    {
      System.out.print(sho[i]+" ");
   }
   System.out.println();
   System.out.println("Array of double =");
    for(int i=0;i<=4;i++)
    {
      System.out.print(dou[i]+" ");
   } 
   System.out.println();
   System.out.println("Array of character =");
    for(int i=0;i<=4;i++)
    {
      System.out.print(cha[i]+" ");
   }
   System.out.println();
   System.out.println("Array of byte =");
    for(int i=0;i<=4;i++)
    {
      System.out.print(by[i]+" ");
   }
   System.out.println();
   System.out.println("Array of float =");
    for(int i=0;i<=4;i++)
    {
      System.out.print(flo[i]+" ");
   }
}
}