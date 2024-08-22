
//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<  Types of Variables in JAVA programming  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

/*
Outcomes:
    Understand what variables are in Java.
    Learn how to declare and initialize variables.
    Identify different types of variables in Java.
*/

/*
What is a Variable?
    A variable is a container for storing data values.
    Variables are used to store information to be referenced and manipulated in a program.
 */
int age = 25;

/*
when Declaring Variables, it is important to note the Syntax for them, as follows:
type variableName = value;
*/
int age = 25;
String name = "John";

//Variables can also be declared first and initialized later, eg:
int age;
age = 25;

/*
============================================================ Types of Variables include: =============================================
------------------------------------------------------------------Primitive Types-----------------------------------------------------
int (integer)
float (floating-point number)
char (character)
boolean (true/false)
*/
int age = 25;
float price = 19.99f;
char grade = 'A';
boolean isValid = true;
/*
============================================================ Types of Variables include: =============================================
------------------------------------------------------------------Non-Primitive Types-------------------------------------------------
Non-primitive types include classes, arrays, and interfaces.
*/
String name = "John";
int[] numbers = {1, 2, 3, 4, 5};


/*
==================================================================== Variable Scope ==================================================
Local Variables: 
Declared inside a method or block and accessible only within that method or block.

Instance Variables: 
Declared inside a class but outside any method, accessible by all methods in the class.

Static Variables: 
Declared with the static keyword, shared among all instances of the class.
*/
public class Example {
    int instanceVar; // Instance variable
    static int staticVar; // Static variable

    public void method() {
        int localVar = 10; // Local variable
    }
}


/*
================================================================== Final Variables ====================================================
Definition: 
Variables declared with the 'final' keyword cannot be changed once assigned.
*/
final int MAX_VALUE = 100;





/*
<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< NB! >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
Use meaningful names when naming variables, follow camelCase syntax for variables.
ALWAYS initialize variables before use.
Keep the scope of variables as narrow as possible.
*/