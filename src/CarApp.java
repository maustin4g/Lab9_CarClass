import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by ernestine on 2/16/2017.
 */
public class CarApp {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            //find out how many we need
            System.out.println("How many cars will you have?");
            int numUsers = scan.nextInt();


            //create the ArrayList empty for now
            ArrayList<Car> userList = new ArrayList<Car>();

            //make and store the required # of users
            for (int i = 0; i < numUsers; i++) {

                System.out.print("What is the car make?");
                String make = scan.next();

                System.out.print("What is the car model? ");
                String model = scan.next();

                System.out.print("What is the car's year? ");
                int year = scan.nextInt();

                System.out.print("What is the price of the car? ");
                int price = scan.nextInt();


                {
                    //create a new instance; this fills the array with user1, then user 2, then user 3
                    //create a new instance
                    Car u = new Car(make, model, year, price);

                    userList.add(u);
                }


            }
            System.out.println("Car inventory: ");
            //go through the users
            for (Car u : userList) {
                //and output them
                System.out.println(u);
                System.out.println(); //skip a line
            }
        }
    }
