import java.util.*;

public class ChessBoard {
  public static void main(String[] args) {
    int boardDim = 8;
    char[][] board = new char[boardDim][boardDim];
    boolean isWhite = false;

    for(int i = 0; i < board.length; i++) {
      isWhite = !isWhite;
      for(int j = 0; j < board[i].length; j++) {
        if(isWhite) board[i][j] = 'W';
        if(!isWhite) board[i][j] = 'B';
        isWhite = !isWhite;
      }
    }

    for(int i = 0; i < board.length; i++) {
      System.out.println(Arrays.toString(board[i]));
    }
  }
}
