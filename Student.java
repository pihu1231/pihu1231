
public class Student extends Teacher{
    public Student() {
    }

    void listen(){
        System.out.println("Listen all the subjects Carefully");
    }

// MAin Method:
public static void  main(String[]args) {
Student s =new Student();
s.sub = "JAVA";
s.name = "Priya";
s.print();
s.teach();
s.listen();
}
}