package classAndObject;

public class Test {
    
    public static void main(String[] args) {

        //Create and Initialize Class of Object-----
        Teacher teacher1 = new Teacher("Rijon mia","Male",1752501271);
        teacher1.displayInformation();

        //Second Teacher Object------------------
        Teacher teacher2 = new Teacher("Mohosin", "Male", 1972501271);
        System.out.println("\nSecond Teacher Object or Propartise :");
        teacher2.displayInformation();

        //Third Teacher object--------
        System.out.println("\nThird Teacher Object :");
        Teacher teacher3 = new Teacher();
        teacher3.displayInformation();

    
    }
}
