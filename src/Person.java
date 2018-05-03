public class Person {
    public static void main(String[] args) {

        Person kelly = new Person("Kelly");

        System.out.println(kelly);
        System.out.println(kelly.getName());
        kelly.setName("Kelly Villalobos");
        System.out.println(kelly.name);
        kelly.sayHello();




    }

    private String name;

    // returns the person's name
    public String getName() {
        return name;
    }

    // changes the name property to the passed value
    public void setName(String name) {
        this.name = name;
    }

    // prints a message to the console using the person's name
    public void sayHello() {
        System.out.println("Hello " + this.name);
    }

    //---constructor---
    public Person(String personName) {
        this.name = personName;
    }

}
