package com.company;
import java.util.*;

public class chessMax
{
    int boardRow = 0;
    int boardColumn = 0;
    char chessBoard[][];
    int dimension;
    int holePosition[][];

    chessMax(int dimension)
    {
        this.chessBoard = new char[dimension][dimension];
        this.dimension = dimension;
    }

    void assignChessBoard()
    {
        for (boardRow = 0; boardRow < this.dimension; boardRow++) {
            for (boardColumn = 0; boardColumn < this.dimension; boardColumn++) {
                if (boardRow % 2 == 0) {
                    if (boardColumn % 2 == 0) {
                        chessBoard[boardRow][boardColumn] = 'W';
                    } else {
                        chessBoard[boardRow][boardColumn] = 'B';
                    }
                }
                if (boardRow % 2 == 1)
                {
                    if (boardColumn % 2 == 0) {
                        chessBoard[boardRow][boardColumn] = 'W';
                    } else {
                        chessBoard[boardRow][boardColumn] = 'B';
                    }
                }
                if(boardRow == 0 && boardColumn == 0)
                {
                    chessBoard[boardRow][boardColumn] = 'H';
                }
                if(boardRow == 1 && boardColumn == 3)
                {
                    chessBoard[boardRow][boardColumn] = 'H';
                }
            }
        }
    }

    void printChessBoard()
    {

        for (boardRow = 0; boardRow < chessBoard.length; boardRow++)
        {
            for (boardColumn = 0; boardColumn < chessBoard.length; boardColumn++)
            {

                char currentSym = chessBoard[boardRow][boardColumn];
                System.out.print("  " + currentSym + "  ");
            }
            System.out.println(" ");
            System.out.println("___________________");
        }
    }



    public static void main (String[]args)
    {

        int dimension = 4;

        chessMax chessMaxObject1 = new chessMax(4);
        chessMaxObject1.assignChessBoard();
        piece rookPiece = new rook();
        rookPiece.placePiece(chessMaxObject1.chessBoard,4,4);
        piece queenPiece = new queen();
        queenPiece.placePiece(chessMaxObject1.chessBoard,4,4);
        piece bishopPiece = new bishop();
        bishopPiece.placePiece(chessMaxObject1.chessBoard,4,4);
        chessMaxObject1.printChessBoard();


    }
    }









