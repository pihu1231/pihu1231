
// Derived Class from Intermediate 
public class Derived extends Intermediate{
    // method of derived class:
    void print(){
        System.out.println("My id is:" +id);
    }
    // main class
    public static void main(String[] args) {
        // create the obj of derived class
        Derived dr = new Derived();
        dr.name ="Practice";
        dr.id = 101;
        dr.display();
        dr.show();
        dr.print();
    }
}