/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package surakarta;

/**
 * The class responsible for displaying the game board to the users.
 * @author Matt Jourard
 */
public class View {
    /**
     * Displays the current state of the board and all it's pieces. Then prompts the user to "move" or "capture". Selecting
     * these options will trigger the respective "validateMove" or "validateCapture" methods.
     * Once all this is done the user is shown an "end of game" prompt where if chosen triggers.
     * @param bg
     * @param bp 
     */
    public void Show_Board(char[][] bg, Board_piece[] bp) {
        int boardHeight;
        
        int boardRowIndex;
        
        int boardWidth;
        
        int column;
        
        int dataRow;               
                
        char[][] displayBoard;
        
        int row;
        
        String temp;
        
        boardHeight = 30;
        boardWidth = 30;
        boardRowIndex = 0;        
               
        dataRow = 0;
        
        displayBoard = new char[boardHeight][boardWidth];
                       
        temp = " ____________    ____________ ";
        putStringInBoard(displayBoard, temp, boardWidth, boardRowIndex);
        boardRowIndex++; //set to 1
        
        temp = "|	     |  |            |";
        putStringInBoard(displayBoard, temp, boardWidth, boardRowIndex);
        boardRowIndex++; //set to 2
        
        temp = "|   ______   |  |   ______   |";
        putStringInBoard(displayBoard, temp, boardWidth, boardRowIndex);
        boardRowIndex++; //set to 3
        
        temp = "|  |      |  |  |  |      |  |";
        putStringInBoard(displayBoard, temp, boardWidth, boardRowIndex);
        boardRowIndex++; //set to 4
        
        temp = "|  |      |  |  |  |      |  |";
        putStringInBoard(displayBoard, temp, boardWidth, boardRowIndex);
        boardRowIndex++; //set to 5
        
        temp = "|  |      |  |  |  |      |  |";
        putStringInBoard(displayBoard, temp, boardWidth, boardRowIndex);
        boardRowIndex++; //set to 6
        
        temp = "|  |      |  |  |  |      |  |";
        putStringInBoard(displayBoard, temp, boardWidth, boardRowIndex);
        boardRowIndex++; //set to 7
        
        temp = "|  |   " + bg[dataRow][0] + "--" + bg[dataRow][0] + "--" + bg[dataRow][0] + "--" + bg[dataRow][0] + "--" + bg[dataRow][0] + "--" + bg[dataRow][0] + "   |  |";
        putStringInBoard(displayBoard, temp, boardWidth, boardRowIndex);
        boardRowIndex++; //set to 8
        dataRow++; //set to 1
        
        temp = "|  |   |  |  |  |  |  |   |  |";
        putStringInBoard(displayBoard, temp, boardWidth, boardRowIndex);
        boardRowIndex++; //set to 9
        
        temp = "|  |   |  |  |  |  |  |   |  |";
        putStringInBoard(displayBoard, temp, boardWidth, boardRowIndex);
        boardRowIndex++; //set to 10
        
        temp = "|   ---" + bg[dataRow][0] + "--" + bg[dataRow][0] + "--" + bg[dataRow][0] + "--" + bg[dataRow][0] + "--" + bg[dataRow][0] + "--" + bg[dataRow][0] + "---   |";
        putStringInBoard(displayBoard, temp, boardWidth, boardRowIndex);
        boardRowIndex++; //set to 11        
        dataRow++; //set to 2
        
        temp = "|      |  |  |  |  |  |      |";
        putStringInBoard(displayBoard, temp, boardWidth, boardRowIndex);
        boardRowIndex++; //set to 12
        
        temp = "|      |  |  |  |  |  |      |";
        putStringInBoard(displayBoard, temp, boardWidth, boardRowIndex);
        boardRowIndex++; //set to 13
        
        temp = " ------"  + bg[dataRow][0] + "--" + bg[dataRow][0] + "--" + bg[dataRow][0] + "--" + bg[dataRow][0] + "--" + bg[dataRow][0] + "--" + bg[dataRow][0] +  "------ ";
        putStringInBoard(displayBoard, temp, boardWidth, boardRowIndex);
        boardRowIndex++; //set to 14
        dataRow++; //set to 3
        
        temp = "       |  |  |  |  |  |       ";
        putStringInBoard(displayBoard, temp, boardWidth, boardRowIndex);
        boardRowIndex++; //set to 15
        
        temp = "       |  |  |  |  |  |       ";
        putStringInBoard(displayBoard, temp, boardWidth, boardRowIndex);
        boardRowIndex++; //set to 16
        
        temp = " ------" + bg[dataRow][0] + "--" + bg[dataRow][0] + "--" + bg[dataRow][0] + "--" + bg[dataRow][0] + "--" + bg[dataRow][0] + "--" + bg[dataRow][0] + "------ ";
        putStringInBoard(displayBoard, temp, boardWidth, boardRowIndex);
        boardRowIndex++; //set to 17
        dataRow++; //set to 4
        
        temp = "|      |  |  |  |  |  |      |";
        putStringInBoard(displayBoard, temp, boardWidth, boardRowIndex);
        boardRowIndex++; //set to 18
        
        temp = "|      |  |  |  |  |  |      |";
        putStringInBoard(displayBoard, temp, boardWidth, boardRowIndex);
        boardRowIndex++; //set to 19
        
        temp = "|   ---" + bg[dataRow][0] + "--" + bg[dataRow][0] + "--" + bg[dataRow][0] + "--" + bg[dataRow][0] + "--" + bg[dataRow][0] + "--" + bg[dataRow][0] + "---   |";
        putStringInBoard(displayBoard, temp, boardWidth, boardRowIndex);
        boardRowIndex++; //set to 20
        dataRow++; // set to 5
        
        temp = "|  |   |  |  |  |  |  |   |  |";
        putStringInBoard(displayBoard, temp, boardWidth, boardRowIndex);
        boardRowIndex++; //set to 21
        
        temp = "|  |   |  |  |  |  |  |   |  |";
        putStringInBoard(displayBoard, temp, boardWidth, boardRowIndex);
        boardRowIndex++; //set to 22
        
        temp = "|  |   " + bg[dataRow][0] + "--" + bg[dataRow][0] + "--" + bg[dataRow][0] + "--" + bg[dataRow][0] + "--" + bg[dataRow][0] + "--" + bg[dataRow][0] + "   |  |";
        putStringInBoard(displayBoard, temp, boardWidth, boardRowIndex);
        boardRowIndex++; //set to 23        
        
        temp = "|  |      |  |  |  |      |  |";
        putStringInBoard(displayBoard, temp, boardWidth, boardRowIndex);
        boardRowIndex++; //set to 24
        
        temp = "|  |      |  |  |  |      |  |";
        putStringInBoard(displayBoard, temp, boardWidth, boardRowIndex);
        boardRowIndex++; //set to 25
        
        temp = "|  |      |  |  |  |      |  |";
        putStringInBoard(displayBoard, temp, boardWidth, boardRowIndex);
        boardRowIndex++; //set to 26
        
        temp = "|  |______|  |  |  |______|  |";
        putStringInBoard(displayBoard, temp, boardWidth, boardRowIndex);
        boardRowIndex++; //set to 27
        
        temp = "|            |  |            |";
        putStringInBoard(displayBoard, temp, boardWidth, boardRowIndex);
        boardRowIndex++; //set to 28
        
        temp = "|____________|  |____________|";
        putStringInBoard(displayBoard, temp, boardWidth, boardRowIndex);
        boardRowIndex++; //set to 29                        
        
        column = 0;
        
        row = 0;
        
        for (row = 0; row < boardHeight; row++) {
            for (column = 0; column < boardWidth; column++) {
                System.out.print(displayBoard[row][column]);
            }
            System.out.println(" " + Integer.toString(row + 1));
        }
    }
    
    private void putStringInBoard(char[][] displayBoard, String line, int boardWidth, int boardRowIndex) {
        int i;
        
        if (boardWidth > line.length() ) {
            throw new IllegalArgumentException("Argument line exceeds the width of the board.");
        }
        
        if (boardRowIndex < 0) {
            throw new IllegalArgumentException("Argument boardRowIndex must be greater than 0.");
        }
        
        
        for (i = 0; i < line.length(); i++) {
            displayBoard[boardRowIndex][i] = line.charAt(i);
        }        
    }
    
    /**
     * 
     * @param p
     * @param number
     * @param tg 
     */
    public void Display_Score(Player[] p, int number, int tg) {
        
    }
}
