//Name: Kaustubh Duddala
//Period: 1B
public class BigMacWalk
{
public static void main(String[] args)
{
int apples = 12;
int oranges = 24;

System.out.print("You have this many apples... ");
System.out.print(apples);
System.out.println(" ");
System.out.print("You have this many oranges... ");
System.out.print(oranges);
System.out.println(" ");

double pi = 3.14159;
System.out.print("Pi is equal to... ");
System.out.print(pi);
System.out.println(" ");

String day = "Tuesday";
System.out.print("Hello! Today is ");
System.out.print(day);
System.out.println(" ");

int a = 10;
int b = 20;
int c = b-a;
System.out.println("b minus a equals... " + c);

int miles = 192;
int gallons = 16;
int mpg = 0;
mpg = miles/gallons;
System.out.println(mpg);

double length = 12.75;
double width = 8.65;
System.out.print(length*width);
System.out.println(" ");

double base = 11.89;
double height = 22.4;
System.out.println((base*height)/2);
System.out.println(" ");

System.out.println("{[If you only ate Big Macs]}");
System.out.println("(Tip: If you are on a diet do not eat fast food dummy)");
double numBigMacs = 0;
double macCals = 590;
double calsPerMile = 94;
numBigMacs = 4;
System.out.println("Big Macs eaten >>> " + numBigMacs);
System.out.println("Total calories consumed >>> " + numBigMacs*macCals);
System.out.println("Miles to walk to burn off all calories>>> " + ((numBigMacs*macCals)/calsPerMile));
System.out.println("{[If you also ate fries/drinks]}");
double numFries = 3;
double friesCals = 320;
double numDrinks = 14;
double drinksCals = 150;
System.out.println("Big Macs eaten >>> " + numBigMacs);
System.out.println("Fries eaten >>> " + numFries);
System.out.println("Drinks Drank >>> " + numDrinks);
System.out.println("Total calories consumed >>> " + ((numBigMacs*macCals) + (numFries*friesCals) + (numDrinks*drinksCals)));
System.out.println("Miles to walk to burn off all calories>>> " + (((numBigMacs*macCals) + (numFries*friesCals) + (numDrinks*drinksCals))/calsPerMile));
System.out.println("(At this point just stop dieting its not working for you)");

int grge = 8.0;
}
}
