import java.util.ArrayList;
import java.util.List;

public class Developer extends Employee{
    private String programmingLanguage;
    static ArrayList<String> possibleLanguages = new ArrayList<>(List.of("java", "python", "javascript", "not specified"));

    public Developer(int id, String name, double salary, String programmingLanguage) {
        super( id, name, salary);

        if(possibleLanguages.contains(programmingLanguage)) {
            this.programmingLanguage = programmingLanguage;
        } else {
            System.out.println("Language not found - set to not specified");
            this.programmingLanguage = "not specified";
        }
    }

    @Override
    public double calculateBonus() {
        return 1.2 * salary;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + " ID: " + id + " Salary: " + salary + " Language: " + programmingLanguage;
    }

    public static void addLanguage(String language) {
        if(possibleLanguages.contains(language)) {
            System.out.println("Language is already on the list!");
        } else {
            possibleLanguages.add(language);
        }
    }
}
