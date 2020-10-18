//Name: Kaustubh Duddala
//Period: 1B
import java.util.*;
public class BasicBlackJack
{
public static void main(String[] args)
{
Scanner console = new Scanner(System.in);

// #2
System.out.println("input an integer");
int apples;
apples = console.nextInt();
if (apples > 0)
{
System.out.println("Hello World");
}

// #3
System.out.println("input an integer");
apples = console.nextInt();
if (apples%2 == 0)
{
System.out.println("Omg its even! ");
} // #4
else
{
System.out.println("hmm thats odd");
}

// #5
System.out.println("input your age");
int votingAge = 18;
int actualAge;
actualAge = console.nextInt();
if (actualAge >= votingAge)
{
System.out.println("You can vote");
}
else
{
System.out.println("You can't vote");
}

// #6
int angle1;
int angle2;
int angle3;
System.out.println("input three integer that add up to 180");
System.out.println("input number 1");
angle1 = console.nextInt();
System.out.println("input number 2");
angle2 = console.nextInt();
System.out.println("input number 3");
angle3 = console.nextInt();
if (angle1 == 0 || angle2 == 0 || angle3 ==0)
{
System.out.println("Error: No such thing as 0 degree angle");
}
else if (angle1+angle2+angle3 != 180)
{
System.out.println("Error: Does not add up to 180");
}
else if (angle1 + angle2 == 2*angle3)
{
System.out.println("Equilateral");
}   
else if (angle1 == angle2 || angle2 == angle3 || angle1 == angle3)
{
System.out.println("Isosceles");
}        
else
{
System.out.println("Scalene");
}  

// #7
int p1;
int p2;
System.out.println("Player 1 – choose 1 for paper, 2 for rock, or 3 for scissors >>>");
p1 = console.nextInt();
System.out.println("Player 2 – choose 1 for paper, 2 for rock, or 3 for scissors >>>");
p2 = console.nextInt();

if (p1 == 1 && p2 == 1)
{
System.out.println("Paper vs Paper its a tie!");
}
else if (p1 == 2 && p2 == 1)
{
System.out.println("Rock vs Paper Player 2 wins!");
}
else if (p1 == 3 && p2 == 1)
{
System.out.println("Scissors vs Paper Player 1 wins!");
}
else if (p1 == 1 && p2 == 2)
{
System.out.println("Paper vs Rock Player 1 wins!");
}
else if (p1 == 2 && p2 == 2)
{
System.out.println("Rock vs Rock its a tie!");    
}
else if (p1 == 3 && p2 == 2)
{
System.out.println("Scissors vs Rock Player 2 wins!");    
}
else if (p1 == 1 && p2 == 3)
{
System.out.println("Paper vs Scissors Player 2 wins!");    
}
else if (p1 == 2 && p2 == 3)
{
System.out.println("Rock vs Scissors Player 1 wins!");
}
else if (p1 == 3 && p2 == 3)
{
System.out.println("Scissors vs Scissors its a tie!");   
}
else
{
System.out.println("not sure what you did but whatever it was it was wrong");
}
// APP

int hand1;
int hand2;
System.out.println("Player 1 – type hand value >>>");
hand1 = console.nextInt();
System.out.println("Player 2 – type hand value >>>");
hand2 = console.nextInt();
int finalhand1 = 21 - hand1;
int finalhand2 = 21 - hand2;

if (hand1 > 21)
{
System.out.print("Player 1 bust, Player 2 wins");  
}
else if (hand2 > 21)
{
System.out.print("Player 2 bust, Player 1 wins");  
}
else if (finalhand1 < finalhand2)
{
System.out.print("Player 1 Wins");
}
else if (finalhand1 > finalhand2)
{
System.out.print("Player 2 Wins");
}
else if (finalhand1 == finalhand2 && hand1 < 21 && hand2 < 21)
{
System.out.print("Tie!");  
}
else if (hand1 > 21 && hand2 > 21)
{
System.out.print("Both players bust");
}
}
}