import java.util.Scanner;

public class HomeworkWeek4 {

    private static void print(String[][] chessBoard) {
        int rows = 6;
        int columns = 6;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                chessBoard[row][col] = " = ";
                figures(chessBoard);
                System.out.print(chessBoard[row][col]);
            }
            System.out.println();
        }
    }

    public static void figures(String[][] chessBoard){
        chessBoard[0][0] = "wDw ";
        chessBoard[0][1] = "wD ";
        chessBoard[0][2] = "wQ ";
        chessBoard[0][3] = "wK ";
        chessBoard[0][4] = "wM ";
        chessBoard[0][5] = "wDw ";

        chessBoard[5][0] = "bDw ";
        chessBoard[5][1] = "bM ";
        chessBoard[5][2] = "bK ";
        chessBoard[5][3] = "bQ ";
        chessBoard[5][4] = "bD ";
        chessBoard[5][5] = "bDw ";
    }

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String[][] chessBoard = new String[6][6];
            print(chessBoard);
                System.out.println("Изберете дали ще играете с Белите или Черните фигури");
                String color = scanner.nextLine();
                if (color.equals("White")){
                    System.out.println("Играта започва. Вие ще играете с Белите.");
                }else if (color.equals("Black")){
                    System.out.println("Играта започва. Вие ще играете с Черните.");
                }else{
                    System.out.println("Try again.");
                }
    }
}