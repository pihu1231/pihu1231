public class Temporary_E extends Permanent_E {
    double hike = 0.35;
void show() {
	System.out.println("Print the salary of Permanent Employee :" +p_salary);
	System.out.println("Print the hike: " +hike);
}

public static void main(String[] args) {
	  Permanent_E pe = new Permanent_E();
		pe.print();
		pe.display();
		Temporary_E te = new Temporary_E();
		te.show();
}
}
