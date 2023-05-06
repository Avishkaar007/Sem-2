//Practise Set 4
public class Constructor {
    String name;
    int age;

    Constructor() {
        name = "Default";
        age = 0;
        System.out.println("Default Constructor , Name : " + name + " Age : " + age);
    }

    Constructor(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized Constructor , Name : " + name + " Age : " + age);
    }
    // Copy Constructor

    Constructor(Constructor obj) {
        this.name= obj.name ;
        this.age=obj.age ;
        System.out.println("Copy Constructor , Name : " + name + " Age : " + age);
    }

    public static void main(String[] args) {
        Constructor c1 = new Constructor();
        Constructor c2 = new Constructor("Rohan", 18);
        Constructor c3 = new Constructor(c2);
    }

}
