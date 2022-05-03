import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

public class AnimalCSVObject {

    private FileHandler fileHandler = new FileHandler();

    public void load() {
        System.out.println("Loading the database ...");
        fileHandler.loadDatabase();
        System.out.println("Done!");
    }

    public void save() throws FileNotFoundException {
        System.out.println("Saving the database ...");
        fileHandler.saveDatabase();
        System.out.println("Saving database completed succesfully");
        System.out.println("You can now exit the application");
    }

}
