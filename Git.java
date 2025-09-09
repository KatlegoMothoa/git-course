import java.util.Scanner;

public class Git {
    public static void main(String [] args){
        Scanner kb = new Scanner(System.in);

        String username = "";
        String surname = "";

        System.out.println("Enter your username: ");
        username = kb.nextLine();

        System.out.println("Enter your Surname: ");
        surname = kb.nextLine();

        System.out.println("I am "+username+" "+surname+" and i'm stalking Katlego Mothoa. I don't wanna lie, this guy is destined for greatness.");

    }
}