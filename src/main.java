import java.io.FileNotFoundException;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        Person p1 = new Person("Kong Andreas", 21);
        Person p2 = new Person("Kong BENTE", 88);
        Converter c = new Converter();


        if(c.convert(p1)){
            System.out.println("Success");
        } else
            System.out.println("Faliure");

        if(c.convert(p2)){
            System.out.println("Success");
        } else
            System.out.println("Faliure");

        c.endStream();
    }
}
