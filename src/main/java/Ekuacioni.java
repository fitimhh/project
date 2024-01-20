// zgjidhja e ekuacionit ax^2 +bx +c = 0
public class Ekuacioni {
    public static void main(String[] args) {

        double a = 3; // first number to add
        double b = 9; // second number to add
        double c = 6; // third number to add
        double Dallori = (b * b) - (4 * a * c);
        double x = -b / (2 * a);
        double x1 = (-b + Math.sqrt(Dallori)) / (2 * a);
        double x2 = (-b - Math.sqrt(Dallori)) / (2 * a);

        if (Dallori < 0) {
            System.out.println("Ekuacioni nuk ka rrenje reale");
        } else if (Dallori == 0) {
            System.out.println("Rrenja e vetme e ekuacionit eshte" + x);
        } else {
            System.out.println("Ekuacioni ka dy rrenje" + x1 + x2);
        }

    } // end method main
} // end class Ekuacioni
