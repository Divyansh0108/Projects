import java.util.*;
class Guesser
{
    int guessNum;
    public int guessNumber()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Guesser kindly guess the number");
        guessNum=scan.nextInt();
        return guessNum;
    }
}
class Player
{ int pguessNum;

    public int guessNumber()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Player kindly guess the number");
        pguessNum=scan.nextInt();
        return pguessNum;
    }
}

class Umpire
{

    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;


    public void collectNumFromGuesser()
    {
        Guesser g=new Guesser();
        numFromGuesser=g.guessNumber();

    }


    public void collectNumFromPlayer()
    {
        Player p1=new Player();
        Player p2=new Player();
        Player p3=new Player();


        numFromPlayer1=p1.guessNumber();
        numFromPlayer2=p2.guessNumber();
        numFromPlayer3=p3.guessNumber();
    }

    void compare()
    {

        if(numFromGuesser==numFromPlayer1)
        {
            if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
            {
                System.out.println("Game tied all three players guessed correctly and won");
            }
            else if(numFromGuesser==numFromPlayer2)
            {
                System.out.println("Player 1 and Player2 won the game, player 3 lost");
            }
            else if(numFromGuesser==numFromPlayer3)
            {
                System.out.println("Player 1 and Player3 won and player 2 lost ");
            }
            else
            {

                System.out.println("Player 1 won the game and everyone else lost");
            }
        }


        else if(numFromGuesser==numFromPlayer2)
        {

            if(numFromGuesser==numFromPlayer3)
            {
                System.out.println("Player 2 and Player3 won the game and player 1 lost");
            }
            else
            {
                System.out.println("Player 2 won the game and other lost");
            }
        }



        else if(numFromGuesser==numFromPlayer3)
        {
            System.out.println("Player 3 won the game and everyone else lost");
        }
        else
        {
            System.out.println("No one guessed correctly! Try again sometime.");
        }
    }

}





public class Launchgame {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        Umpire u=new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayer();
        u.compare();

    }

}