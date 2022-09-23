class Animal{
// Method and fields of animals
String name;
void eat(){
System.out.println("I can eat");}
}
class Dog extends Animal{
//Method and fields of Dog
void display(){
System.out.println("My name is :" +name);}

//Driver code:
public static void main(String[] args){
Dog d = new Dog();
d.name ="Bulldog";
d.eat();
d.display();
}
}