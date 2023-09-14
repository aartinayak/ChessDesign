package com.company;

public class queen extends piece
{
    void placePiece(char[][] chessBoard,int boardRow,int boardColumn) {
        for (boardRow = 0; boardRow < chessBoard.length; boardRow++) {
            for (boardColumn = 0; boardColumn < chessBoard.length; boardColumn++) {

                int rightDiagonalCheck = boardRow + boardColumn;
                boolean placeQueen = true;
                for (int boardRowSecondIteration = 0; boardRowSecondIteration < chessBoard.length; boardRowSecondIteration++) {
                    for (int boardColumnSecondIteration = 0; boardColumnSecondIteration < chessBoard.length; boardColumnSecondIteration++)
                        if (boardRowSecondIteration + boardColumnSecondIteration == rightDiagonalCheck) {
                            if (chessBoard[boardRowSecondIteration][boardColumnSecondIteration] == 'Q') {
                                placeQueen = false;
                            }
                        }
                }
                if (boardColumn >= boardRow) {
                    for (int i = 0, j = boardColumn - boardRow; j < chessBoard.length; i++, j++) {
                        if ((chessBoard[i][j]) == 'Q') {
                            placeQueen = false;
                        }
                    }
                } else {
                    for (int j = 0, i = boardRow - boardColumn; i < chessBoard.length; i++, j++) {
                        if (chessBoard[i][j] == 'Q') {
                            placeQueen = false;
                        }
                    }

                }

                for (int queenRowChecker = 0; queenRowChecker < chessBoard.length; queenRowChecker++) {

                    if (chessBoard[boardRow][queenRowChecker] == 'Q') {
                        placeQueen = false;
//                            break;
                    }
//
                }
                for (int queenColumnChecker = 0; queenColumnChecker < chessBoard.length; queenColumnChecker++) {
                    if (chessBoard[queenColumnChecker][boardColumn] == 'Q') {
                        placeQueen = false;
                    }

                }
                if (placeQueen&&chessBoard[boardRow][boardColumn]!='H') {
                    chessBoard[boardRow][boardColumn] = 'Q';
                }


            }


        }
    }

}
