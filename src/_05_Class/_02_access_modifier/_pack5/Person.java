package _05_Class._02_access_modifier._pack5;

public class Person {

    private int age;
    private  String name;

    public Person(String name) {
        this.name = name;
    }

    // gette
    public int getAge () {
        return age;
    }

    // setter
    public void setAge(int age) {
     if (age < 0) {
         this.age = 0;
     } else {
         this.age = age;
     }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
