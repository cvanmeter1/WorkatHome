import java.io.File;
import java.io.IOException;
import java.util.Scanner;

// ***************************************************************
// SquareTest.java
//
// Uses the Square class to read in square data and tell if
// each square is magic.
//
// ***************************************************************

public class SquareTest {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("magicSquare.txt"));
        int count = 1; // count which square we're on
        int size = scan.nextInt(); // size of next square
        // Expecting -1 at bottom of input file
        while (size != -1) {
            // create a new Square of the given size
            Square square = new Square(size);
            // call its read method to read the values of the square
            square.readSquare(scan);
            System.out.println("\n******** Square " + count + " ********");
            // print the square
            square.printSquare();
            // print the sums of its rows
            for(int row = 0; row < size; row++)
            {
                System.out.println("The sum of row " + row + "is " + square.sumRow(row)+ ".");
            }
            // print the sums of its columns
            for(int col = 0; col < size; col++)
            {
                System.out.println("The sum of column " + col + "is " + square.sumCol(col)+ ".");
            }
            // print the sum of the main diagonal
            System.out.println("The sum of the main diagonal is " + square.sumMainDiag() + ".");
            // print the sum of the other diagonal
            System.out.println("The sum of the other diagonal is " + square.sumOtherDiag() +".");
            // determine and print whether it is a magic square
            System.out.println("Is the square magic?: " + square.magic());
            // get size of next square
            size = scan.nextInt();
            count++;
        }
    }
}
