import java.util.Scanner;

public class Board
{
    
	//private String[][] board = new String[6][6];
	char[][] board=new char[6][6];
    
    private int turn = 0;
   
    
    //initilize the board..
    public Board()
    {
        for(int row = 0; row < board.length; row++)
        {
            for(int col = 0; col< board[row].length; col++)
            {
                board[row][col] = '-';
            }
        }
    }
          
    //printing out the board..
    public void printBoard()
    {
        System.out.println("  1 2 3 4 5 6 ");
        int row = 1;
        for(char[] array:board)
        {
            System.out.print(row+ " ");
            for(char item: array)
            {
            System.out.print(item + " ");
                
            }
            row++;
            System.out.println();
        }
    }
    
 // get the player's name
 	public void getPlayerName() {		
 		Scanner in = new Scanner(System.in);
 		System.out.println("First player:");
 		String p1 = in.nextLine();
 		System.out.println("second player");
 		String p2= in.nextLine();

 	}
 		

 	 public void symbolOfPlayer() {
    //keep track whose turn it is other player is false
    //drawboard(board);
    	boolean isPlayer1=true;
        //print out the player's turn
        if(isPlayer1) {
        	Scanner in = new Scanner(System.in);
        	String player1 = in.nextLine();
    		System.out.println(player1 + "1'st Turn (X):");
        }
        else {
        	Scanner in = new Scanner(System.in);
        	String player2 = in.nextLine();
			System.out.println(player2 + "2'nd Turn (O):");
        	 }
        
    //keep track of what symbol we are using to play
    char symbol = ' ';
    if (isPlayer1) {
    	symbol='X';
    	    }
    else {
    	symbol='O';
    }
    int row=0;
    int col=0;
    
    while(true)  {
    
  //get row and col from user
		Scanner in = new Scanner(System.in);
	    System.out.println("Enter a row between (1...6: ,ex:2/3 ");
	    row=  in.nextInt()-1; 
	    System.out.println("Enter a row between (1...6: ,ex:2/3 ");
	    col=  in.nextInt()-1;
	    
	      
  //check if row and col are vail - for is not vaild try/catch
	    if(row<0 || col<0 || row>5 || col>5) {
	    	//row and col out of bounds
	    	System.out.println("Row and Col values are not true..");
	    }
	    	else if (board[row][col] != '-') {
	    		System.out.println("already move there be careful..");
        }
	    	else {
	    		//row and col are valid
	    	break;
	    	}
    }
   
      //setting the position on the board to the player's symbol
    		board[row][col] = symbol;
    		printBoard();
    }
 	 
 	 public void placeToken(int row,int col, char token){
         board[row][col]=token;
         for (int i = -1; i < 5; i++){
             if (board[row+i][col-1] == '-'){
                 board[row+i][col-1] = '*';
             }
             if (board[row+i][col] == '-'){
                 board[row+i][col] = '*';
             }
             if (board[row+i][col+1] == '-'){
                 board[row+i][col+1] = '*';
             }
         }
     }
 	 
 	public static void drawboard(char[][] board) {
  	  for(int i=0;i<6;i++) {
  		  for(int j=0;j<6;j++) {
  	  		  System.out.println(board[i][j]);

  		  }
	  		System.out.println();

    }
    }
}





