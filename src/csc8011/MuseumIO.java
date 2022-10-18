package csc8011;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class MuseumIO {

    private Scanner s = new Scanner(System.in);

    private Museum museum = new Museum("Sample name");


    public void menu() throws FileNotFoundException {

        System.out.println("Welcome to the museum menu. Select an option below by entering 1-5.).");
        System.out.println("1. Enter museum name: ");
        System.out.println("2. Get exhibit information from CSV file");
        System.out.println("3. Summary of museum");
        System.out.println("4. Museum exhibit statistics");
        System.out.println("5. Leave menu");

        int input = storeInput();

        switch (input){
            case 1:
                museumName(); //Get museum name method.
                break;
            case 2:
                readCSV(); //Exhibit information upload
                break;
            case 3:
                System.out.println(museum); //print Museum summary
                break;
            case 4:
                museum.highestValueExhibit();
                museum.firstExhibitAcquired();
                museum.averageValue();//Print Statistics
                break;
            case 5:
                System.out.println("Bye!");
                System.exit(0);
            default:
                System.out.println("Wrong value entered.  Please choose a number between 1-5.");
        }
    }

    //nextInt method to store option selected by user.
    private int storeInput() {
        int n = s.nextInt();
        if
        (n <= 5 && n > 0 ){
            return 0;
        }
        else
            return n;

    }
    private int museumName() {
        System.out.println("The current museum name: " + museum.name);
         return 0;
    }

    private void readCSV () throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/csc8011/exhibits.csv"));
        sc.useDelimiter(",");
        while (sc.hasNext())
        {
            System.out.print(sc.next());
        }
        sc.close();
        }


    public static void main(String[] args) throws FileNotFoundException {
        MuseumIO museumIO = new MuseumIO();
        {
            museumIO.menu();
        }
    }
}
