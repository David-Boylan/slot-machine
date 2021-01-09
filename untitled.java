import java.util.*;
public class untitled{
    public static void main(String[]args){
        int money = 50;
        Scanner gargrave = new Scanner(System.in);
        String reply = "yes";
        int bet;
        double winnings;
        int earned;
        while (reply.equals("yes")){
            Random rand = new Random();
            boolean win = false;
            System.out.println(" You have $" + money + " how much would you like to bet?");
            bet = gargrave.nextInt();
            int gamble1 = rand.nextInt(10);
            int gamble2 = rand.nextInt(10);
            int gamble3 = rand.nextInt(10);
            int gamble4 = rand.nextInt(10);
            int gamble5 = rand.nextInt(10);
            int gamble6 = rand.nextInt(10);
            int gamble7 = rand.nextInt(10);
            int gamble8 = rand.nextInt(10);
            int gamble9 = rand.nextInt(10);
            System.out.print(gamble1);
            System.out.print(gamble2);
            System.out.println(gamble3);
            System.out.print(gamble4);
            System.out.print(gamble5);
            System.out.println(gamble6);
            System.out.print(gamble7);
            System.out.print(gamble8);
            System.out.print(gamble9);
            if ((gamble1 == gamble2 && gamble2 == gamble3)||
            (gamble1 == gamble5 && gamble5 == gamble9)||
            (gamble1 == gamble4 && gamble4 == gamble7)||
            (gamble2 == gamble5 && gamble5 == gamble8)||
            (gamble3 == gamble6 && gamble6 == gamble9)||
            (gamble4 == gamble5 && gamble5 == gamble6)||
            (gamble3 == gamble5 && gamble5 == gamble7)||
            (gamble7 == gamble8 && gamble8 == gamble9)){
                winnings = bet * 1.5;
                earned = (int) winnings;
                money = money + earned;
                System.out.println("\n" + "You win, you have $" + money );
            }
            else{
                money = money-bet;
                System.out.println("\n" + "You lost, you have $" + money);
            }
            if (money <= 0){
                System.out.println("You lost all of your money");
                System.exit(0);
            }
            System.out.println("Would you like to play again? type yes to continue");
            reply = gargrave.next();
        }
    }
}