import java.util.*;
class count
{ public static void main(String[] args)
{ Scanner sc=new Scanner(System.in);
System.out.print("enter a number");
 int number=sc.nextInt();
 int count=0;
 while(number!=0)
{ number=number/10;
  count++;
}
System.out.println("digits of your number:"+count);
}
}