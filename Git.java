import java.util.Scanner;

public class Git {
    public static void main(String [] args){
        Scanner kb = new Scanner(System.in);

        String username = "";
        String surname = "";
        String statement = "";
        double money = 0.0;

        System.out.println("Enter your username: ");
        username = kb.nextLine();

        System.out.println("Enter your Surname: ");
        surname = kb.nextLine();

        System.out.print("Enter the amount of money you got: R");
        money = kb.nextDouble();

        if(money < 1000){
            statement = "I am broke";
        } else if (money >= 1000 && money < 5000) {
            statement = "I am doing okay";
        } else if (money >= 5000 && money < 10000) {
            statement = "I am rich";
        } else {
            statement = "I am very rich";
        }
        System.out.println("I am "+username+" "+surname+" and i'm stalking Katlego Mothoa. I don't wanna lie, this guy is destined for greatness.");
        System.out.println("Also, based on my bank balance, "+statement);
    }
}