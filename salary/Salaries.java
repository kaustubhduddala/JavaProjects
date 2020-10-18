//Name:
//Period:
public class Salaries
{
public static void main(String[] args)
{
String hi = "hi", mom = "mom";
System.out.println(hi + ", " + mom);

String hi2 = "hi"; 
String mom2 = "mom";
System.out.println(hi2 + ", " + mom2);

String someName = "Bob";
System.out.println("Hello, " + someName + "!");

int a = 14;
int b = 6;
System.out.println(a + " % " + b + " is " + a%b);

//APP

double hourlyRate, hoursWorked, overtimeHours, totalSalary, taxRate, netSalary;
hourlyRate = 20;
hoursWorked = 40; 
overtimeHours = 4;
totalSalary = (hoursWorked*hourlyRate)+(1.5*hourlyRate*overtimeHours);
taxRate = .25;
netSalary = totalSalary - (totalSalary*.25);
System.out.println("Hourly rate >>> $" + hourlyRate);
System.out.println("Regular hours worked >>> " + hoursWorked); 
System.out.println("Overtime hours worked >>> " + overtimeHours);
System.out.println("Gross salary (total, before taxes) >>> " + totalSalary);
System.out.println("Net salary (after taxes) >>> " + netSalary);
}
}
