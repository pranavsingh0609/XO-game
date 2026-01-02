import java.util.Scanner;
class XO {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

 char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };
    
   char player = 'X';


    while (true){
        printBoard(board);
            System.out.println("Player" + player + "Enter row or Colomun 0 0 , 0 1 , 0 2");

            int r = sc.nextInt();
            int c = sc.nextInt();

            if (board[r][c]==' '){
                board[r][c] = player;
                if(player == 'X'){
                 player = 'O';
            }else{
                player = 'X';
            }
            }else{
                System.out.println("Box is already filled");
            }

            if (Win(board, player)){
                printBoard(board);
                System.out.println("Player "+ player + " wins");
                break;
            }
        }  
    }
     static void printBoard(char[][] board)
    {
        System.out.println("_____________");
    for (int i = 0; i<3; i++){
        System.out.print("| ");
       for (int j=0; j<3; j++){
        System.out.print(board[i][j]+" | ");
       }
       System.out.println();
     System.out.println("_____________");
   
     } }

static  boolean Win (char [][]board, char player)
     {
        if (board[0][0]==player &&
            board[1][0]==player &&
            board[2][0]==player){
                return true;
            }
        if (board[0][1]==player &&
            board[1][1]==player &&
            board[2][1]==player){
                return true;
            }
        if (board[0][2]==player &&
            board[1][2]==player &&
            board[2][2]==player){
                return true;
            }
        if (board[0][0]==player &&
            board[0][1]==player &&
            board[0][2]==player){
                return true;
            }
        if (board[1][0]==player &&
            board[1][1]==player &&
            board[1][2]==player){
                return true;
            }
        if (board[2][0]==player &&
            board[2][1]==player &&
            board[2][2]==player){
                return true;
            }
        if (board[0][0]==player &&
            board[1][1]==player &&
            board[2][2]==player){
                return true;
            }
        if (board[0][2]==player &&
            board[1][1]==player &&
            board[2][0]==player){
                return true;
            }
        return false;

     }

}