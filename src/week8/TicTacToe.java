package week8;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Initialise the tic tac toe board.
		char[][] board = {
				{' ', ' ', ' '},
				{' ', ' ', ' '},
				{' ', ' ', ' '}
		};
		// To notify if someone have won the game
		boolean someoneWins = false;
		// To notify if draw
		boolean draw = false;
		// To notify which player is playing
		boolean player1Turn = true;
		// Player 1 symbol O and Player 2 symbol X
		char playerSymbol;
		// For user input
		String userInput;

		while(!someoneWins && !draw) {
			// Print the tic tac toe board
			System.out.println("\\ y    0      1      2");
			System.out.println("x   =====================");
			for(int x = 0; x < board.length; x++) {
				System.out.print(x + "   ");
				for(int y = 0; y < board[x].length; y++) {
					System.out.print("|  " + board[x][y] + "  |");
				}
				System.out.println();
				System.out.println("    =====================");
			}

			// Ask user input for coordinate to add symbol to.
			if(player1Turn) {
				// Player 1
				playerSymbol = 'O';
				System.out.println("Player 1 (O) turns.");
				System.out.println("Please input xy coordinate");
				userInput = scanner.nextLine();
			} else {
				// Player 2
				playerSymbol = 'X';
				System.out.println("Player 2 (X) turns.");
				System.out.println("Please input xy coordinate");
				userInput = scanner.nextLine();
			}
			// Validate user input
			if(userInput.length() == 2) {
				// Convert user input String to char array.
				char[] userInputArray = userInput.toCharArray();
				// Convert char array value to numeric value.
				int x = Character.getNumericValue(userInputArray[0]);
				int y = Character.getNumericValue(userInputArray[1]);
				// Check if coordinate entered is valid.
				if(x >= 0 && x <= 2 && y >= 0 && y <= 2) {
					if(board[x][y] == ' ') {
						// Update the board
						board[x][y] = playerSymbol;

						// Check if someone wins
						// Check for all rows
						for(int i = 0; i < 3; i++) {
							if(board[i][0] == playerSymbol &&
									board[i][1] == playerSymbol &&
									board[i][2] == playerSymbol) {
								someoneWins = true;
							}
						}
						// Check for all columns
						for(int i = 0; i < 3; i++) {
							if(board[0][i] == playerSymbol &&
									board[1][i] == playerSymbol &&
									board[2][i] == playerSymbol) {
								someoneWins = true;
							}
						}
						// Check for diagonal
						if(board[0][0] == playerSymbol &&
								board[1][1] == playerSymbol &&
								board[2][2] == playerSymbol) {
							someoneWins = true;
						}
						if(board[0][2] == playerSymbol &&
								board[1][1] == playerSymbol &&
								board[2][0] == playerSymbol) {
							someoneWins = true;
						}
						
						// Check for draw
						boolean gotEmptySpace = false;
						for(int i = 0; i < 3; i++) {
							for(int j = 0; j < 3; j++) {
								if(board[i][j] == ' ') {
									gotEmptySpace = true;
									break;
								}
								if(i == 2 && j == 2) {
									draw = true;
								}
							}
							if(gotEmptySpace) {
								break;
							}
						}

						// Change player
						// Don't change player if someone wins
						if(!someoneWins) {
							player1Turn = !player1Turn;
						}
					} else {
						System.out.println("That coordinate has been used.");
					}

				} else {
					System.out.println("Invalid input.");
				}


			} else {
				System.out.println("Invalid input.");
			}

		}

		// Print the tic tac toe board
		System.out.println("\\ y    0      1      2");
		System.out.println("x   =====================");
		for(int x = 0; x < board.length; x++) {
			System.out.print(x + "   ");
			for(int y = 0; y < board[x].length; y++) {
				System.out.print("|  " + board[x][y] + "  |");
			}
			System.out.println();
			System.out.println("    =====================");
		}
		if(someoneWins) { 
			if(player1Turn) {
				System.out.println("Player 1 wins");
			} else {
				System.out.println("Player 2 wins");
			}
		} else {
			System.out.println("Draw");
		}

		scanner.close();
	}

}





