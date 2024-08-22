


//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<   COMMENTS IN JAVA   >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


//-----------------------------------------------------------------------Single-Line Comment:
int x = 5; // Initialize variable x with value 5

//------------------------------------------------------------------------Multi-Line Comment:
/*
This block of code
performs a calculation
based on user input.
*/
int result = calculate(userInput);

//[------------------------------------------------------------------------Javadoc Comment:
/**
 * Thes types of comments are to explain the function of methods in java
 * EVERY METHOD YOU WRITE IN JAVA HAS TO HAVE ONE OF THESE TO DESCRIBE ITS PURPOSE!!!
 * This method calculates the square of a number.
 * @param num The number to be squared
 * @return The square of the input number
 */
public int square(int num) {
    return num * num;
}

//---------------------------------------------------------------------------Block Comment:
/*
int y = 10;
int z = 20;
int sum = y + z;
*/

// The block of code above is commented out.


//---------------------------------------------------------------------------Inline Comment:
int a = 5; // Initialize variable a with value 5

//----------------------------------------------------------------------------TODO Comment:
// TODO: Implement error handling for edge cases


//-------------------------------------------------------------------------Deprecated Comment:
/**
 * @deprecated This method is deprecated. Use calculateArea() instead.
 */
@Deprecated
public void calculatePerimeter() {
    // Method implementation
}