import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class FileHandler {
    private ArrayList<Animal> animals;

    public void loadDatabase() {
        Scanner fileInput = new Scanner("Animals.csv");
        while (fileInput.hasNextLine()){
            String line = fileInput.nextLine();
            Scanner lineInput = new Scanner(line).useDelimiter(";").useLocale(Locale.ENGLISH);
            String name = lineInput.next();
            String description = lineInput.next();
            String type = lineInput.next();
            int age = lineInput.nextInt();
            double weight = lineInput.nextDouble();
            Animal animal = new Animal(name, description, type, age, weight);
            animals.add(animal);
        }
    }

    public void saveDatabase() throws FileNotFoundException {
        PrintStream outputfile = new PrintStream("animals.csv");
        for (int i = 0; i < animals.size(); i++) {
            Animal animal = animals.get(i);
            outputfile.print(animal.getName());
            outputfile.print(";");
            outputfile.print(animal.getDesc());
            outputfile.print(";");
            outputfile.print(animal.getType());
            outputfile.print(";");
            outputfile.print(animal.getAge());
            outputfile.print(";");
            outputfile.print(animal.getWeight());
            outputfile.print("\n");
        }
    }
}
