public class Tesla extends Car {
    // Method of tesla:
void drive(){
    System.out.println("Print drive safely");
}
// main method
public static void main(String[] args) {
    // create object of Tesla:
    Tesla t = new Tesla();
    // call the method of car and tesla:
    t.drive();
    t.gear();
}
}
