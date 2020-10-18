
//Name:
//Period:
import java.util.*;
public class BMI
{
public static void main(String[] args)
{
Scanner console = new Scanner(System.in);

System.out.print("enter an integer >>> ");
int num1 = console.nextInt();
System.out.println(num1 + 10);
System.out.println("What is your name? >>> ");
String name1 = console.next();
System.out.println("Hello " + name1 + "!");
System.out.println("enter a double (number with a decimal) >>> ");
double something = console.nextDouble();
System.out.println(something * something);
System.out.println("What is your name and age? ");
String name2 = console.next();
int age = console.nextInt();
System.out.println(name2 + " is " + age + " years old!");
System.out.println("enter a double (number with a decimal) >>> ");
double radius = console.nextDouble();
System.out.println(radius*radius*3.14159);
System.out.println("enter a double (number with a decimal) >>> ");
double time = console.nextDouble();
System.out.println(time*time*0.5*32.174 + " feet traveled");
System.out.println("What is your name? >>> ");
name1 = console.next();
System.out.println(name1+name1+name1);

//APP

System.out.println("What is your weight in inches (round to the nearest in)? >>> ");
int w = console.nextInt();
System.out.println("What is your height in inches (round to the nearest pound)? >>> ");
int h = console.nextInt();
double w1 = 0.453592*w;
double h1 = 0.0254*h;
double h2 = h1*h1;
double bmi = w1/h2;
System.out.println("Your BMI is >>>" + bmi);
}
}
