// derived class from  Mammal:
public class Dog extends Mammal {
    // Method of dog
    void sound(){
        System.out.println("I bark:");
    }
    // main method:
    public static void main(String[] args) {
        Dog d =new Dog();
        d.print();
        d.sound();
        Mammal m = new Mammal();
        m.print();
        m.nature();
        Animal a  = new Animal();
        a.print();
        a.eat();
    }
}
