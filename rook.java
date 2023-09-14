package com.company;

public class rook extends piece
{
    void placePiece(char[][] chessBoard,int boardRow,int boardColumn)
    {
        boolean placedRookChecker = false;
        for (boardRow = 0; boardRow < chessBoard.length; boardRow++)
        {
            for (boardColumn = 0; boardColumn < chessBoard.length; boardColumn++)
            {
                placedRookChecker = true;

                for (int rookRowChecker = 0; rookRowChecker < chessBoard.length; rookRowChecker++)
                {

                    if ((chessBoard[boardRow][rookRowChecker] == 'r'))
                    {
                        placedRookChecker = false;
//                            break;
                    }
//
                }
                for (int rookColumnChecker = 0; rookColumnChecker < chessBoard.length; rookColumnChecker++)
                {
                    if ((chessBoard[rookColumnChecker][boardColumn] == 'r')) {
                        placedRookChecker = false;
//                            break;
                    }

                }
                if (placedRookChecker&&chessBoard[boardRow][boardColumn]!='H') {
                    chessBoard[boardRow][boardColumn] = 'r';
                }
            }

        }


    }
}
