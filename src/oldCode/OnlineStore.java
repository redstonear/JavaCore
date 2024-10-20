package oldCode;

import homeWorks.storage.DataStorage;
import model.User;

import java.util.Scanner;

public class OnlineStore {

    private static DataStorage dataStorage = new DataStorage();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            printCommands();
           String command = scanner.nextLine();
           switch (command) {
               case "0":
                   isRun = false;
                   break;
                   case "1":
                       loginUser();
                       break;
                       case "2":
                           registerUser();
                           break;
               default:
                   System.out.println("Invalid command");
           }
        }

    }

    private static void loginUser() {
        System.out.println("email, password");
        String userDataString = scanner.nextLine();
        String[] userDataArray = userDataString.split(",");
        String email = userDataArray[0];
        String password = userDataArray[1];
        User userByEmail = dataStorage.getUserByEmail(email);
        if (userByEmail != null && userByEmail.getPassword().equals(password)) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed, please register");
        }
    }

    private static void registerUser() {
        System.out.println("Please input id, name, surname, email, password");
        String userDataStr = scanner.nextLine();
        String[] userDataArr = userDataStr.split(",");
        String email = userDataArr[3];
        if (dataStorage.getUserByEmail(email) == null) {
            User user = new User(userDataArr[0], userDataArr[1], userDataArr[2], userDataArr[3]);
            dataStorage.addUser(user);
            System.out.println("You have been registered successfully!");
        } else {
            System.out.println("User already exists!");
        }
    }

    private static void printCommands() {
        System.out.println("Please input 0 for EXIT");
        System.out.println("Please input 1 for LOGIN");
        System.out.println("Please input 2 for REGISTER");
    }

    private static void printUserCommands(){

    }

}
