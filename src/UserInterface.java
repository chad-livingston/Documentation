import java.util.Scanner;
public class UserInterface {
    private Scanner scanner;

    public UserInterface(Scanner scanner){

        this.scanner = scanner;
    }
    public void start(){
        System.out.println("Documentation");
        mainMenu();

    }
    public void mainMenu(){
        System.out.println("Main Menu:");
        System.out.println("1. New Entry");
        System.out.println("2. Search Entries");
        System.out.println("3. View All");
        System.out.println("4. Exit");
    }
}
