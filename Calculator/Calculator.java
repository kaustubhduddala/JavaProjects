//Name: Kaustubh Duddala    
//Period: 1B
import java.util.*;
public class Calculator
{
public static void main(String[] args)
{
Scanner console = new Scanner(System.in);

// #1
int a = console.nextInt();
if (a == 9)
{
System.out.println("#1");
}

// #2
int b = console.nextInt();
if (b == 9 || b > 20)
{
System.out.println("#2");
}

// #3
int c = console.nextInt();
if (c == 5 || c == 6)
{
System.out.println("#3");
}

// #5
int d = console.nextInt();
if (d != 5)
{
System.out.println("#5");
}

// #6
Double e = console.nextDouble();
if (e < 10 && e > 2 && e != 7.5)
{
System.out.println("#6");
}

// #7
Double f = console.nextDouble();
if (f < 24 && f > 17)
{
System.out.println("#7");
}

// #8
System.out.println("Welcome to Jeff's Quest:");
System.out.println("Assign stats to your character (max 15 points TOTAL)");
System.out.println("****************************************************");
System.out.println("Enter strength (from 1 to 10)");
int s = console.nextInt();
System.out.println("Enter health (from 1 to 10)");
int h = console.nextInt();
System.out.println("Enter magic (from 1 to 10)");
int m = console.nextInt();
if (s + m + h > 15)
{
System.out.println("Point limit exceeded! Default values assigned");
System.out.println("Strength = 5, health = 5, magic = 5. Good luck!");
}

//APP

System.out.println("1 – addition (+)");
System.out.println("2 – subtraction (-)");
System.out.println("3 – multiplication (*)");
System.out.println("4 – division (/)");
System.out.println("5 – modulus (%)");
System.out.println("Enter the number of your desired operation from the menu above >>>");

int operation = console.nextInt();

System.out.println("Enter first number >>> ");
System.out.println("Enter second number >>> ");

double num1 = console.nextInt();
double num2 = console.nextInt();

if(operation == 1)
{
System.out.println(num1 + num2);
}
else if (operation == 2)
{
System.out.println(num1 - num2);
}
else if (operation == 3)
{
System.out.println(num1 * num2);
}
else if (operation == 4)
{
System.out.println(num1/num2);
}
else if (operation == 5)
{
System.out.println(num1%num2);
}
else
{
System.out.println("Error: Operation doesn't exist");
}
}
}