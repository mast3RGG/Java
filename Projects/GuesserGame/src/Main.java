import java.util.Scanner;

class Guesser{
    int valGuesser;
    int getValGuesser(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Guesser , type your number :");
        valGuesser = scan.nextInt();
        return valGuesser;
    }
}

class Player{
    Scanner scan = new Scanner(System.in);
    int valPlayer1,valPlayer2,valPlayer3;
    int getValPlayer1() {
        System.out.println("Player 1 , type your number");
        valPlayer1 = scan.nextInt();
        return valPlayer1;
    }
    int getValPlayer2() {
        System.out.println("Player 2 , type your number");
        valPlayer2 = scan.nextInt();
        return valPlayer2;
    }
    int getValPlayer3() {
        System.out.println("Player 3, type your number");
        valPlayer3 = scan.nextInt();
        return valPlayer3;
    }
    }

    class Emperor{
    int pl1Points , pl2Points, pl3Points;
    int Player1 , Player2 , Player3;
    int Guesser;
    void getValues(){
        Guesser g1 = new Guesser();
        Guesser = g1.getValGuesser();
        System.out.println("------------");
        Player p1 = new Player();
        Player1 = p1.getValPlayer1();
        Player p2 = new Player();
        Player2 = p2.getValPlayer2();
        Player p3 = new Player();
        Player3 = p3.getValPlayer3();
    }
    void compareValues(){
        if(Player1 == Guesser)
        {
            if(Player2 == Guesser && Player3 == Guesser){
                System.out.println("All players won");
                pl1Points++;
                pl2Points++;
                pl3Points++;
            }
            else if ( Player2 == Guesser){
                System.out.println("Player1 and Player2 won");
                pl1Points++;
                pl2Points++;
            }
            else if (Player3 == Guesser) {
                System.out.println("Player1 and Player 3 won");
                pl1Points++;
                pl2Points++;
            }
            else
            { System.out.println("Player1 won");
                pl1Points++;
            }
        }
        else if (Player2 == Guesser ) {
            if (Player3 == Guesser) {
                System.out.println("Player2 and Player 3 won");
                pl3Points++;
                pl2Points++;
            }
            else {
                System.out.println("Player2 won");
                pl2Points++;
            }
            }
        else if (Player3 == Guesser) {
            System.out.println("Player3 won");
            pl3Points++;
        }
        else System.out.println("Noone");
    }
    }

    public class Main{
        public static void main(String[] args)
        {
           Scanner scan = new Scanner(System.in);
            System.out.println("Type 0 if you do not want to play but type one if you want to play");
           int decision = scan.nextInt();
           int i =1 ;
            Emperor game = new Emperor();
            while(decision != 0) {
                game.getValues();
                game.compareValues();
                System.out.println();
                System.out.println("Rezultatele dupa jocul " + i );
                System.out.println("Player 1 : " + game.pl1Points);
                System.out.println("Player 2 : " + game.pl2Points);
                System.out.println("Player 3 : " + game.pl3Points);
                System.out.println("0 to stop but 1 to contiunue");
                 decision = scan.nextInt();
                i++;
            }
        }
    }
