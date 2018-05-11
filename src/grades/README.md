1. Create a Student class

Create a class named Student. It should have private properties for the student's name, and grades. The grades property should be an list of integers. The student class should have a constructor that sets name property, and initializes the grades property as an empty list. The Student class should have the following methods:

**returns the student's name**

public String getName();
 
**adds the given grade to the grades property**

public void addGrade(int grade);

**returns the average of the students grades**

public double getGradeAverage();

Test your Student class by adding a main method and creating Student objects. Verify that you can add grades to each object, and that your getGradeAverage method correctly returns the average of the student's grades.

1. Create a map for students and Github usernames
   
   Create a class named GradesApplication with a main method. Inside the main method, create a HashMap named students. It should have keys that are strings that represent github usernames, and values that are Student objects. Create at least 4 student objects with at least 3 grades each, and add them to the map.
   
   Be creative! Make up github usernames and grades for your student objects.
   
3. Create the command line interface

Print the list of github usernames out to the console, and ask the user which student they would like to see more information about. The user should enter a github username (i.e. one of the keys in your map). If the given input does not match up with a key in your map, tell the user that no users with that username were found. If the given username does exist, display information about that student, including their name and their grades.

After the information is displayed, the application should ask the user if they want to continue, and keep running so long as the answer is yes.


Welcome!

Here are the github usernames of our students:

|zgulde| |ryanorsinger| |jreich5| |fmendozaro| |MontealegreLuis|

What student would you like to see more information on?

> pizza

Sorry, no student found with the gihub username of "pizza".

Would you like to see another student?

> y

What student would you like to see more information on?

> zgulde

Name: Zach - Gihub Username: zgulde
Current Average: 87.4

Would you like to see another student?

> no

Goodbye, and have a wonderful day!

**Bonus**

1. Display all of the student's grades in addition to the grade average
2. Allow the user to view all of the grades for all of the students