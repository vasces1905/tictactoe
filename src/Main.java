
import java.util.Scanner;
//ycanli
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Board board = new Board();
        System.out.println("Welcome..");
        board.getPlayerName();
     
        board.printBoard();
        board.symbolOfPlayer();


        //  board.placeToken(0, 0, 0);

       // board[0][2] = " X |";
        
       // board.printBoard();
     
        //draw the board
        //board.drawBoard();
    }
}
