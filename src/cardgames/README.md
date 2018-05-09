# Object Oriented Bonuses:

1. Play the card game of “War”
Make it two player. You can have Player vs. computer or computer1 vs. computer2

- Make a new package called card-games
- Inside, make the following classes:
   - Make a player class called Player.java
       - add a gamesWon count field for the number of games won
       - add a name property and set the name with the constructor
   - Make a card class inside Card.java that has suit and value
   - Make a file called CardsArray.java. (Like the MoviesArray.java) It should have 52 different lines creating playing card objects. The array of objects should be returned by calling a method called .getAllCards()
   - Make a class called 	.java
       The game should play 26 rounds, sum up each won game for each player. Then output the winning player.

2. Make a new package called bookstore. 
   
   Inside it
       
       - make a Person superclass w/ name property, set name w/ constructor
       - Make a Customer subclass that inherits from person
       - Make an Author subclass that inherits from person, add a counter for the number of books written
       - Create a Product class w/ title and price and constructor that sets those properties
       - Create a Book class that inherits from product and ads an author property
       - Book class’s author property should hold an Author typed object
       - Make a class called BookStore.java that has your main method and the code that runs.
       - Make 3 authors
       - Make 5 books
       - Create 8 customers, store them in an array, have each customer buy a book or two
