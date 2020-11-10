//import package for input
import java.util.Scanner;
//import package for LocalTime
import java.time.LocalTime;

public class helloUser {

    public int currentTime(){
        //get current time
        int currentTime = LocalTime.now().getHour();
        //System.out.println(currentTime);
        return currentTime;
    }

    public void userGreeting(int currentTime, String userName){
        int time = currentTime;
        // user greeting by current time
        if (time > 0 && currentTime < 5) {
            System.out.println("Good night, " + userName + "!");
        }
        else if (currentTime >= 5 && currentTime < 11) {
            System.out.println("Good morning, " + userName + "!");
        }
        else if (currentTime >= 11 && currentTime < 17) {
            System.out.println("Good afternoon, " + userName + "!");
        }
        else {
            System.out.println("Good evening, " + userName + "!");
        }
    }

    public static void main(String[] args) {
        //create object for user input
        Scanner userInput = new Scanner(System.in);

        System.out.print("Type your name please: ");
        //get user input from console
        String userName = userInput.next();

        helloUser user = new helloUser();
        user.userGreeting(user.currentTime(), userName);
    }
}
