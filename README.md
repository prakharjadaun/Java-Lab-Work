# **Java Lab Work - UPES**

This respository contains all the assignments that I have performed in my Java lab. 

## **Experiment 1 : Basics of Java**

1.	Write program to print the kth digit from last. e.g. input 23617 and k=4 output 3.
2.	Write a program to print first digit. e.g. input 23516 output 2.
3.	Write program to print the second digit. e.g. input 23516 the output is 3.
4.	Write program to find sum of all digits. Input 23617 output 2+3+6+1+7=19.
5.	Write program, which will find sum of product to consecutive digits. e.g. when the input is 23145 the output is 2x3 + 3x1 + 1x4 + 4x5 = 33.
6.	Write program, which reads two number (assume that both have same number of digits). The program outputs the sum of product of corresponding digits. Input 327 and 539 output 3x5+2x3+7x9=84. 
7.	Write program to print positional values of digits. Input 21463 output 3, 60, 400, 1000 and 20000.
8.	Modify first example for taking input through command line arguments.
9.	Modify second example for taking input through command line arguments.
10.	Define fa. If point p is (x,y) then p.fa() will make it (x+y,2y). (20,4) (24,8)
11.	Define fb. If point p is (x,y) then p.fb() will make it (2x,x+y). (20,4) (40,24)Define fc. If point p is (x,y) then p.fc() will make it (x+y,x*y). (20,4) (24,80)

## **Experiment 2 : Basics of Java Programming**

1. Write a program to find the largest of 3 numbers.
2. Write a program to implement a command line calculator. (Try for Add sub Mul Division in same program for 2 digits.)
Integer.parseInt will be used<br>
For e.g. java calc 20 + 30<br>
Output should be Sum of 20 and 30 is 50
java calc 50 * 30<br>
Output should be Product of 50 and 30 is 1500
3. Write a program to accept 10 student's mark in an array, arrange it into ascending order, convert it into the following grades and print marks and grades in the tabular form.<br>
Between 40 and 50 : PASS<br>
Between 51 and 75 : MERIT<br>
and above : DISTINCTION<br>
for example:<br>
Enter Marks: 50<br>
30<br>
50<br>
50<br>
30<br>
50<br>
Output should be sorted array with Grade like:<br>
55 Merit<br>
41 Pass<br>
29 Fail<br>
4. WAP to Take input as DD MM YYYY(04 08 2021) in command line and calculate number of days since 1 January 1970.

## **Experiment 3 :**

1. Write a program to accept three digits (i.e., 0 - 9) and print all its possible combinations.<br>
(For example if the three digits are 1, 2, 3 than all possible combinations are : 123, 132, 
213, 231, 312, 321.)
2. Write a Java Program to accept 10 numbers in an array and compute the square of each number. Print the sum of these numbers.
3. Write a program to input a number of a month (1 - 12) and print its equivalent name of 
the month. ( e.g 1 to Jan, 2 to Feb. 12 to Dec.)
4. Write a program to find the sum of all integers greater than 40 and less than 250 that are divisible by 5.

## **Experiment 4 : Inheritance**

1. Write a Java program to show that private member of a super class cannot be accessed from derived classes. 
2. Write a program in Java to create a Player class. Inherit the classes Cricket _Player, Football _Player and Hockey_ Player from Player
class. 
3. Write a class Worker and derive classes DailyWorker and SalariedWorker from it. Every worker has a name and a salary rate. Write 
method ComPay (int hours) to compute the week pay of every worker. A Daily Worker is paid on the basis of the number of days 
he/she works. The Salaried Worker gets paid the wage for 40 hours a week no matter what the actual hours are. Test this program to 
calculate the pay of workers. You are expected to use the concept of polymorphism to write this program.
4. Consider the trunk calls of a telephone exchange. A trunk call can be ordinary, urgent or lightning. The charges depend on the duration 
and the type of the call. Write a program using the concept of polymorphism in Java to calculate the charges.
5. Design a class employee of an organization. An employee has a name, empid, and salary. Write the default constructor, a constructor 
with parameters (name, empid, and salary) and methods to return name and salary. Also write a method increaseSalary that raises the 
employee’s salary by a certain user specified percentage. Derive a subclass Manager from employee. Add an instance variable named 
department to the manager class. Supply a test program that uses theses classes and methods

## **Experiment 5 : Interface**

1. Write a program to create interface named test. In this interface the member function is square. Implement this interface in arithmetic 
class. Create one new class called ToTestInt. In this class use the object of arithmetic class.
2. Write a program to create interface A, in this interface we have two method meth1 and meth2. Implements this interface in another 
class named MyClass.
3. Write a program in Java to show the usefulness of Interfaces as a place to keep constant value of the program
4. Write a program to create an Interface having two methods division and modules. Create a class, which overrides these methods.
5. Write program to create an interface StackInterface having methods push (), pop () and display (). StackClass implements 
StackInterface. Class StackClass contains the main method which is having a switch case for selecting the particular operation of the 
stack

## **Experiment 6 : Packages**

1. Write a Java program to implement the concept of importing classes from user defined package and created packages.
2. Write a program to make a package Balance. This has an Account class with Display_Balance method. Import Balance package in 
another program to access Display_Balance method of Account class. 
3. WAP to create a package p with class A with 4 types of access protected methods. How we will use these methods in different packages 
class i.e. there is main() in class B in package Q and 4 methods are in Class A in package p.

## **Experiment 7 : Exceptions**

1. Write a program in Java to display the names and roll numbers of students. Initialize respective array variables for 10 students. Handle 
ArrayIndexOutOfBoundsExeption, so that any such problem doesn’t cause illegal termination of program. 
2. Create an exception class, which throws an exception if operand is nonnumeric in calculating modules. (Use command line arguments). 
3. Write a code to create your own exception class. Create another class, inside main method prompt user to enter a number if number is 
less than 500 throw instances of your custom exception class.
4. You are given two integers, a and b as input, you have to compute a/b: If a and b are not bit signed integers or if is zero, exception 
will occur and you have to report it. Read sample Input/Output to know what to report in case of exception. <br>
Sample Input 0:<br>
10<br>
3<br>
Sample Output 0: <br>
3<br>
Sample Input 1:<br>
10<br>
Hello<br>
Sample Output 1 :<br>
java.util.InputMismatchException<br>
Sample Input 2:<br>
10<br>
0<br>
Sample Output 2:<br>
java.lang.ArithmeticException: / by zero<br>
Sample Input 3:<br>
23.323<br>
0<br>
Sample Output 3:<br>
java.util.InputMismatchException<br>

5. You are required to compute the power of a number by implementing a calculator. Create a class Calc which consists of a single 
method long power(int, int). This method takes two integers, a and b, as parameters and finds a
b
. If either a or b is negative, then 
the method must throw an exception which says "a and b should not be negative". Also, if both a and b are zero, then the method 
must throw an exception which says "a and b should not be zero"<br>
For example, -4 and -5 would result in java.lang.Exception: a and b should not be negative.<br>
Complete the function power in class Calc and return the appropriate result after the power operation or an appropriate exception as 
detailed above.<br>
<b>Input Format</b><br>
Each line of the input contains two integers, a and b. The code must read the input and send the values to the method as 
parameters.<br>
Constraints<br>
* -10 <= a<= 10<br>
* -10 <= b<= 10<br>

<b>Output Format</b><br>
Each line of the output contains the result, if both a and b are positive. If either a or b is negative, the output contains "a and b
should be non-negative". If both a and b are zero, the output contains "a and b should not be zero."<br>
<b>Sample Input 0 :</b><br>
3 5<br>
2 4<br>
0 0<br>
-1 -2<br>
-1 3<br>
<b>Sample Output 0 :</b><br>
243<br>
16<br>
java.lang.Exception: n and p should not be zero.<br>
java.lang.Exception: n or p should not be negative.<br>
java.lang.Exception: n or p should not be negative<br>

## **Experiment 8 : String Handling and Exceptions**

1. Write a program for searching strings for the first occurrence of a character or substring and for the last occurrence of a character or 
substring. 
2. Write a program that converts all characters of a string in capital letters. (Use StringBuffer to store a string). Don’t use inbuilt function. 
3. Write a program in Java to read a statement from console, convert it into upper case and again print on console. (Don’t use inbuilt 
function) 
4. Write a program in Java to create a String object. Initialize this object with your name. Find the length of your name using the 
appropriate String method. Find whether the character ‘a’ is in your name or not; if yes find the number of times ‘a’ appears in your 
name. Print locations of occurrences of ‘a’ .Try the same for different String objects

5. Write a Java code that converts int to Integer, converts Integer to String, converts String to int, converts int to String, converts String 
to Integer converts Integer to int.
6. Write a Java code that converts float to Float converts Float to String converts String to float converts float to String converts String 
to Float converts Float to float. 

## **Experiment 9 : Threads**

1. Write a program to implement the concept of threading by extending Thread Class and Runnable interface.
2. Write a program for generating 2 threads, one for printing even numbers and the other for printing odd numbers.
3. Write a program to launch 10 threads. Each thread increments a counter variable. Run the program with synchronization. 
4. Write a Java program to create five threads with different priorities. Send two threads of the highest priority to sleep state. Check the 
aliveness of the threads and mark which thread is long lasting

## **Experiment 10 : Collections**

1. Write a program for the following<br>
* Read all elements from ArrayList by using Iterator.
* Create duplicate object of an ArrayList instance.
* Reverse ArrayList content.
2. Write a program for the following HashMap
* find whether specified key exists or not.
* find whether specified value exists or not
* get all keys from the given HashMap
* get all key-value pair as Entry objects
3. Write a program for the following HashSet
* copy another collection object to HashSet object.
* delete all entries at one call from HashSet
* search user defined objects from HashSet<br>

## **Experiment 11 : JDBC**

1. Create a database table to store the records of employee in a company. Use getConnection function to connect the database. The 
statement object uses executeUpdate function to create a table.
2. Create a database of employee of company in mysql and then use java program to access the database for inserting information of 
employees in database. The SQL statement can be used to view the details of the data of employees in the database.
3. Create a table Meeting having columns (NameOfParticipant, MeetingID, ScheduledTime, Email, Mobile), Populate with random data 
and perform following operations. READ COMPLETE QUESTION TO POPULATE DATABASE.<br>
a) Using JaveCode determine the names of the columns in the MEETING table and display the column names on the console.<br>
b) Write a query to find the names of all participants for the meeting with ID 1144. Display the names on the console, preceded by 
the message, “Names of participants in meeting 1144”.<br>
c) Insert a new participant with using only the participant’s name. Don’t specify the participant ID - let the ID be determined by the 
database. Determine the ID that was assigned to the new participant and display it on the console (the statement that displays the 
ID should display the name of the new participant as well).<br>
d) Count the number of people participating in the meeting with ID 1105. Display a message on the console that gives both the 
meeting name and the number of participants.<br>
e) Determine the names of all people who participate in meetings that meet on Tuesdays. Display the names, preceded by the 
message, “Participants attending Tuesday meetings”.<br>

## **Experiment 12 : Servlet**

1. Servlet : <br>a) ServletContext interface<br> b) getParameterValues() of Servlet Request<br>
2) Write a Servlet page to display current date of the server.<br>
3) Write a Servlet page to which include the two other Servlet page through of include directives feature provided in Servlet.
4) Write a Servlet page to create a simple calculator.




