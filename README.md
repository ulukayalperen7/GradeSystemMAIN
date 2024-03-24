# Requirements:
I wrote a program that will simulate the user interface for a course. It will
take arrays as parameters for the grading information. Then will ask the teacher to enter
grade information, make grade changes, or display a grade.
## To facilitate the execution of this program, I  wrote and modified the following methods:
1. menu(input, item)
- A new method to display the options based on the contents of the array
- Takes an array of strings and a Scanner object as parameters
- Displays to the output each of the names in the array preceded by a
consecutive number ending with “Q - to Quit”
- Requests an input from the user
- Returns an Integer for the user’s choice
- If the user requests “Q”, returns -1

2. calculateGrade(category, quantity, weight)

- It will take three parameters
i. String array for names of the graded categories For each item in this array it will change the name to
capitalize the first letter and lowercase other letters
ii. Integer array for number of each item
iii. Integer array for weight of each item
iv. If the sizes of the three arrays are not the same or if the values
passed are not valid, should display an error message and exit.
- It will run according to the description above until the user types “Q” for the prompt.
- NOTE: This method will use much of the main method from your previous assignment
- Returns None
3. formatCategoryName(name)
- For each value in the name array, format name with the first letter uppercase; all other letters lowercase
- Takes an array of Strings as a parameter
- Changes the values in the array
- Returns none
- Note: You can call your previous formatCategoryName method from this method using method overloading
- Methods from previous assignments that are useful to this assignment may be tested. There should be no change to the requirements for these methods.
- Any other methods you feel helpful can be implemented, however, these will be the only methods tested.

```java
public static void main(String[] args){
    String[] list = {"ITEM ONE", "item two"};
    formatCategoryName(list);
    System.out.println(list[0]);
    System.out.println(list[1]);
}
```
output:     
  Item one   
Item two

### Design:
When calculateGrade is called with valid quantity and weight values, my program should display the list of options to the teacher and ask what he/she would like to do. When the teacher decides to enter all grades, the system should ask for values for all grades. If the teacher asks to change a grade, the system should ask which grade to change, show the current grade and get the new value. If the teacher asks to display the student grade, it should calculate the student’s grade based on the values entered so far.

### the following code shows some example arrays in the main method:
```java
public static void main(String[] args){
    String[] category = {"QUIZ", "homework", "MidTerm exam", "FINAL Exam"};
    int[] quantity = {4,3,2,1};
    int[] weight = {10,20,30,40};
    calculateGrade(category, quantitiy, weight);
}
```