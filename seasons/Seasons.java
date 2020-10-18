//Name:
//Period:
import java.util.*;
public class Seasons
{
public static void main(String[] args)
{
Scanner console = new Scanner(System.in);

// #1
System.out.println("Enter your pressure (left then right)");
int leftPressure = console.nextInt();
int rightPressure = console.nextInt();
if (leftPressure < 36 || rightPressure < 36)
{
System.out.println("Warning low tire pressure");   
}
else
{
System.out.println("You're good to go");    
}

// #2
System.out.println("Enter your pressure (left then right)");
leftPressure = console.nextInt();
rightPressure = console.nextInt();
if (leftPressure - rightPressure <= 4  && leftPressure - rightPressure >= -4)
{
System.out.println("You're good to go"); 
}
else
{
System.out.println("with leftPressure = " + leftPressure + " , rightPressure = " + rightPressure + " >>> Warning!, uneven tire pressure!");
}

// #3
System.out.println("What is your grade");
double grade = console.nextDouble();
if (grade >= 90)
{
System.out.println("A");
}
else if (grade < 90 && grade >= 80)
{
System.out.println("B");    
}
else if (grade < 80 && grade >= 70)
{
System.out.println("C");    
}
else if (grade < 70 && grade >= 60)
{
System.out.println("D");    
}
else if (grade < 60)
{
System.out.println("F");    
}

// #5
System.out.println("Enter a number");
int num = console.nextInt();
int rem = num%10;
if (rem >= 5)
{
System.out.println(num + (10-rem));
}
else
{
System.out.println(num - rem);
}

// APP

System.out.println("Enter the month in a number");
int mon = console.nextInt();
System.out.println("Enter the day in a number");
int day = console.nextInt();
if (mon == 12 || mon == 1 || mon == 2 || mon == 3)
{
if (mon == 12 && day >= 16 && day <= 31)
{
System.out.println("Winter");
}
else if(mon == 1 || mon == 2)
{
System.out.println("Winter");
}
else if(mon == 3 && day <= 15)
{
System.out.println("Winter");
}
}

if (mon == 3 || mon == 4 || mon == 5 || mon == 6)
{
if (mon == 3 && day >= 16 && day <= 31)
{
System.out.println("Spring");
}
else if(mon == 4 || mon == 5)
{
System.out.println("Spring");
}
else if(mon == 6 && day <= 15)
{
System.out.println("Spring");
}
}

if (mon == 6 || mon == 7 || mon == 8 || mon == 9)
{
if (mon == 6 && day >= 16 && day <= 31)
{
System.out.println("Summer");
}
else if(mon == 7 || mon == 8)
{
System.out.println("Summer");
}
else if(mon == 9 && day <= 15)
{
System.out.println("Summer");
}
}


if (mon == 9 || mon == 10 || mon == 11 || mon == 12)
{
if (mon == 9 && day >= 16 && day <= 31)
{
System.out.println("Fall");
}
else if(mon == 10 || mon == 11)
{
System.out.println("Fall");
}
else if(mon == 12 && day <= 15)
{
System.out.println("Fall");
}
}
}
}