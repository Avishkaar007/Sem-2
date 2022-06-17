public class HybridInheritance {
    public static void main(String [] args){
        Animal dog=new Dog();
        Animal tiger=new Tiger();
        Animal deer=new Deer();
        dog.Food();
        tiger.Food();
        deer.Food();    }
}

abstract class Animal{
  abstract void Food();
}
abstract class Pet extends Animal{

}
abstract class Wild extends Animal{

}
class Dog extends Pet{
    void Food(){
        System.out.println("Transferring Pedigree into bowl");
    } 
}
class Tiger extends Wild{
    void Food(){
        System.out.println("Killed prey with claws and teeth , starts eating");
    }
}
class Deer extends Wild{
    void Food(){
        System.out.println("Grazing grass in the field ");
    }
}