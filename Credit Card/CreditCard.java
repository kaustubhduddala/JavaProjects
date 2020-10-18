//Name: Kaustubh Duddala
//Period: A1
public class CreditCard
{
public static void main(String[] args)
{
double tuna = 2.99;
System.out.println(tuna+3);
tuna++;
System.out.println(tuna);
tuna = tuna + 5;
System.out.println(tuna);

int a = 4;
int b = 6;
//PREDICTION: 98
System.out.println(2 * a + 3 * b * (a + b) / 2);
int c = 5;
int d = 9;
//PREDICTION: -49
System.out.println(-1 * (c + d) * (c + d) / 4);

double pi = 3.14159;
double radius = 6.5;
double something = 4.5;
System.out.println(pi * (radius*radius));
System.out.println(something*something);

int sideA = 4;
int sideB = 9;
System.out.println((sideA*sideA) + (sideB*sideB));
System.out.println(sideA%sideB);

//APPLICATION

double totalDebt = 3200;
int numMonths = 8;
double minMonthlyPayment = totalDebt/numMonths;
System.out.println("Total debt >>> " + totalDebt);
System.out.println("Number of months >>> " + numMonths);
System.out.println("Minimum Payment >>> " + minMonthlyPayment);
}
}
