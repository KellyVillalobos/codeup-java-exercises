More Shapes

Remove the code from the body of your Rectangle and Square classes.

Inside of the shapes directory, create a Measurable interface with the following methods:


double getPerimeter();\
double getArea();

Create an abstract Shape class inside of the shapes directory.

Inside of shapes, create an abstract Quadrilateral class that extends Shape and implements Measurable. This class should have:

  * protected properties for length and width

  * a constructor that accepts two numbers for the length and width and sets those properties\

  * methods for getting the length and width

  * abstract methods for setting the length and width

Change your existing Rectangle class to inherit from Quadrilateral and implement Measurable.

IntelliJ can automatically create the skeleton of all the methods that need to be implemented.

Change your existing Square class to extend Quadrilateral.

Because the length of all sides of a sqare are the same, the methods for setting the length and the width should set both protected properties.

Modify your ShapesTest class, use it to:

declare a variable of the type Measurable named myShape.
display the shape's area and circumference
Test your code by creating instances of both Square and Rectangle and assigning them to myShape.

Answer the following questions:

Why does the code fail to compile if you leave off the getPerimeter method in Rectangle?

What happens if you try to call the getLength or getWidth methods of the myShape variable? Why?