package This_Keyword;

public class Person {
    String name;
    int age;
    String haircolor;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    Person(String name, int age, String haircolor){
        this(name, age);
        this.haircolor = haircolor;
    }

    void message(){
        System.out.println("I'm Message Method");
    }

    void display(){
        this.message();
        System.out.println("Name = "+name);
        System.out.println("Age = "+age);
        System.out.println("Haircolor = "+haircolor);
        System.out.println();

    }
}
