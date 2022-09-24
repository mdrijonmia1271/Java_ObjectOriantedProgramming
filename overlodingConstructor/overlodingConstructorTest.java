package overlodingConstructor;

public class overlodingConstructorTest {
    public static void main(String[] args) {
        

        Teacher teacher = new Teacher();
        teacher.displayInformation();

        Teacher teacher1 = new Teacher("Rijon Islam","Male");
        teacher1.displayInformation();

        Teacher teacher2 = new Teacher("Tahbila Islam","Female",1752501271);
        teacher2.displayInformation();

    }
}
