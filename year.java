import java.util.*;
class year
{public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the year");
int year=sc.nextInt();
if(year%4==0||year%400==0||year%100==0)
System.out.println("entered year is a leap year");
else
System.out.println("entered year is not a leap year");
}
}