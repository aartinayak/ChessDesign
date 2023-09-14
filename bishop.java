package com.company;

public class bishop extends piece
{
    void placePiece(char[][] chessBoard,int  boardRow,int boardColumn)
    {
        boolean placeBishop = true;

        for (boardRow = 0; boardRow < chessBoard.length; boardRow++)
        {
            for (boardColumn = 0; boardColumn < chessBoard.length; boardColumn++)
            {

                int rightDiagonalCheck = boardRow + boardColumn;
                placeBishop = true;

                for (int boardRowSecondIteration = 0; boardRowSecondIteration < chessBoard.length; boardRowSecondIteration++)
                {
                    for (int boardColumnSecondIteration = 0; boardColumnSecondIteration < chessBoard.length; boardColumnSecondIteration++)
                        if (boardRowSecondIteration + boardColumnSecondIteration == rightDiagonalCheck)
                        {
                            if (chessBoard[boardRowSecondIteration][boardColumnSecondIteration] == 'p')
                            {
                                placeBishop = false;
                            }
                        }
                }


                if(boardColumn>=boardRow){
                    for(int i=0,j=boardColumn-boardRow;j<chessBoard.length;i++,j++)
                    {
                        if((chessBoard[i][j])=='p'){
                            placeBishop=false;
                        }
                    }
                }
                else
                {
                    for(int j=0,i=boardRow-boardColumn;i<chessBoard.length;i++,j++){
                        if(chessBoard[i][j]=='p'){
                            placeBishop=false;
                        }
                    }

                }
                if (placeBishop&&chessBoard[boardRow][boardColumn]!='H')
                {
                    chessBoard[boardRow][boardColumn] = 'p';
                }
            }

        }
    }

}
