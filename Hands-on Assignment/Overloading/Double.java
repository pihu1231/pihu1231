
 public class Double extends Sum2   { // Memebers of Double
    double x, y;
    // method of double:
    double sum(double x, double y){
        // Store the result of x+y:
        double add = x+y;
        // print the Result
        System.out.println("Print hte result of double:" +add);
        return add;
    }
    // main method:
    public static void main(String[] args) {
        // create object of Double:
        Double d= new Double();
        // pass the arguments in d.sum()
        d.sum(2.4d,4.5d);
        // creating object of Sum2:
        Sum2  s2 = new Sum2();
        // pass the aruuements of s2.sum():
        s2.sum(21, 34, 54);
        // cretaing the object of Sum:
        Sum s = new Sum();
        // pass the arguments in s.sum()
        s.sum( 32, 45);
    }
}
