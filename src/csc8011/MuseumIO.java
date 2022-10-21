package csc8011;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.File;

public class MuseumIO {

    /*Create new instance of museum object named 'm' and
    given a default name that will update when user sets name from menu.
    */
    private static Museum m = new Museum("Default name");
//main method to run the museum menu.
    public static void main(String[] args) {
        boolean done = false; //while done is false menu will keep showing
        while (!done) {
            printMenu();
            try {
                Scanner userInput = new Scanner(System.in);
                int option = userInput.nextInt(); //Uses nextInt to store user input on menu.

                switch (option) {
                    case 1:
                        changeName(); //If user inputs 1, run the changeName method
                        break;
                    case 2:
                        readCSV(); //If user inputs 2, run the readCSV method
                        break;
                    case 3:
                        System.out.println("Museum name: " + m.getName());
                        printMuseumExhibits(); //Gets name from 'm' object instance and calls printMuseumExhibits method
                        break;
                    case 4:
                        if (m.getExhibits().size() > 0) { //only print if at least 1 exhibits have been created, if not return error message and return to menu.
                            /*
                            Calls the relevant methods for getting exhibit stats.  Not the most efficient code
                            but will format correctly according to the assignment.  Would look to tidy this up
                            in future Museum manager versions.
                             */
                        System.out.println("The statistics on highest value, first exhibit acquired and average value of exhibits:");
                        System.out.println("Highest value exhibit: " + m.highestValueExhibit().getExhibitDescription() + " (" + m.highestValueExhibit().getExhibitId() + "), £" + m.highestValueExhibit().getExhibitValue());
                        System.out.println("First exhibit acquired: " + m.firstExhibitAcquired().getExhibitDescription() + " (acquired " + m.firstExhibitAcquired().getYearAcquired() + ")");
                        System.out.println("Average value of exhibits: £" + m.averageValue()); }
                        else
                            System.out.println("No exhibits exist yet!");
                        break;
                    case 5:
                        //Prints the current named museum
                        System.out.println(m.getName());
                        break;
                    case 6:
                        System.out.println("Bye!");
                        done = true; //Terminates main method by setting done to true.
                        break;
                    default:  //Sends error message if input does not match the menu.
                        System.out.println("Wrong value entered.  Please choose a number between 1-6!");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Enter a number!");
            }

        }
    }

    /*
    Calls method to input CSV file.  Specifies file location, and calls split to identify the comma
    seperated values.
     */
    private static void readCSV() {
        try {
            File input = new File("src/csc8011/exhibits.csv");
            Scanner s = new Scanner(input);
            s.nextLine();
            while (s.hasNext()) {
                String[] line = s.nextLine().split(",");
                Exhibit e = new Exhibit(line[0], line[1], Integer.parseInt(line[2]), Double.parseDouble(line[3]));
                m.addExhibitName(e);
            }
            System.out.println("Read in" + " " + m.getExhibits().size() + " " + "exhibit items.");

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }

    /*
    Method to get and then print all the exhibit information.
    Will return error if tried to run without adding exhibits from CSV first.
     */
    private static void printMuseumExhibits()
    {
        if (m.getExhibits().size() > 0)
        {
            for (Exhibit name : m.getExhibits())
            {
                System.out.println(name);
            }
        }
        else
        {
            System.out.println("No Exhibits!");
        }
    }
    /*
    Presents the user with a menu printed to the console
     */
        private static void printMenu()
        {
            System.out.println("\nWelcome to the museum manager menu! Select an option below by entering 1-6.");
            System.out.println("1. Set museum name");
            System.out.println("2. Get exhibit information from CSV file");
            System.out.println("3. Summary of museum");
            System.out.println("4. Museum exhibit statistics");
            System.out.println("5. Show museum name");
            System.out.println("6. Leave menu");
            System.out.println("Enter a option here --> ");
        }
        //Updates the name of museum to what the user specifies.
        private static void changeName ()
        {
            System.out.println("Enter the new name of museum:");
            Scanner input2 = new Scanner(System.in);
            String newName = input2.nextLine();
            m.setName(newName);
            System.out.println("Museum renamed to: " + m.getName());
        }
    }
