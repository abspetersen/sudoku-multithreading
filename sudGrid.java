/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;


/**
 *
 * @author abbypetersen
 */
public class Grid {
    private
            final int [][] sGrid;
            int x;
            int y;

    public
            Grid(int _x, int _y){
                sGrid = new int[9][9];
                _x = x;
                _y = y;
            }

            //fill 2D array with int values ranging from 1-9
            void fillGrid(){
                sGrid[0][0] = 6;
                sGrid[1][0] = 2;
                sGrid[2][0] = 4;
                sGrid[3][0] = 5;
                sGrid[4][0] = 3;
                sGrid[5][0] = 9;
                sGrid[6][0] = 1;
                sGrid[7][0] = 8;
                sGrid[8][0] = 7;

                sGrid[0][1] = 5;
                sGrid[1][1] = 1;
                sGrid[2][1] = 9;
                sGrid[3][1] = 7;
                sGrid[4][1] = 2;
                sGrid[5][1] = 8;
                sGrid[6][1] = 6;
                sGrid[7][1] = 3;
                sGrid[8][1] = 4;

                sGrid[0][2] = 8;
                sGrid[1][2] = 3;
                sGrid[2][2] = 7;
                sGrid[3][2] = 6;
                sGrid[4][2] = 1;
                sGrid[5][2] = 4;
                sGrid[6][2] = 2;
                sGrid[7][2] = 9;
                sGrid[8][2] = 5;

                sGrid[0][3] = 1;
                sGrid[1][3] = 4;
                sGrid[2][3] = 3;
                sGrid[3][3] = 8;
                sGrid[4][3] = 6;
                sGrid[5][3] = 5;
                sGrid[6][3] = 7;
                sGrid[7][3] = 2;
                sGrid[8][3] = 9;

                sGrid[0][4] = 9;
                sGrid[1][4] = 5;
                sGrid[2][4] = 8;
                sGrid[3][4] = 2;
                sGrid[4][4] = 4;
                sGrid[5][4] = 7;
                sGrid[6][4] = 3;
                sGrid[7][4] = 6;
                sGrid[8][4] = 1;

                sGrid[0][5] = 7;
                sGrid[1][5] = 6;
                sGrid[2][5] = 2;
                sGrid[3][5] = 3;
                sGrid[4][5] = 9;
                sGrid[5][5] = 1;
                sGrid[6][5] = 4;
                sGrid[7][5] = 5;
                sGrid[8][5] = 8;

                sGrid[0][6] = 3;
                sGrid[1][6] = 7;
                sGrid[2][6] = 1;
                sGrid[3][6] = 9;
                sGrid[4][6] = 5;
                sGrid[5][6] = 6;
                sGrid[6][6] = 8;
                sGrid[7][6] = 4;
                sGrid[8][6] = 2;

                sGrid[0][7] = 4;
                sGrid[1][7] = 9;
                sGrid[2][7] = 6;
                sGrid[3][7] = 1;
                sGrid[4][7] = 8;
                sGrid[5][7] = 2;
                sGrid[6][7] = 5;
                sGrid[7][7] = 7;
                sGrid[8][7] = 3;

                sGrid[0][8] = 2;
                sGrid[1][8] = 8;
                sGrid[2][8] = 5;
                /*invalid solution to test validator: row 9, column 4, sub-grid 8
                //correct solution = 4
                sGrid[3][8] = 8;
                */
                sGrid[4][8] = 7;
                sGrid[5][8] = 3;
                sGrid[6][8] = 9;
                sGrid[7][8] = 1;
                sGrid[8][8] = 6;

            }

            //return array of the numbers in the column of the
            //coordinates passed as params
            int[] getColumn(int x, int y){
                int cArr[];
                cArr = new int[9];

                for(int i=0;i < 9;i++){
                    cArr[i] = sGrid[x][y];
                    y++;
                }
                return cArr;
            }

            //return array of the numbers in the row of the
            //coordinates passed as params
            int[] getRow(int x, int y){
                int rArr[];
                rArr = new int[9];

                 for(int i=0;i < 9; i++){
                    rArr[i] = sGrid[x][y];
                    x++;
                 }
                return rArr;
            }

            //return array of the numbers in the subgrid of the
            //coordinates passed as params
            int[] getSubGrid(int x, int y){
                int sgArr[];
                sgArr = new int[9];

                switch (x) {
                    case 0:
                    case 1:
                    case 2:
                        switch (y) {
                            case 0:
                            case 1:
                            case 2:
                                    sgArr[0] = sGrid[0][0];
                                    sgArr[1] = sGrid[1][0];
                                    sgArr[2] = sGrid[2][0];
                                    sgArr[3] = sGrid[0][1];
                                    sgArr[4] = sGrid[1][1];
                                    sgArr[5] = sGrid[2][1];
                                    sgArr[6] = sGrid[0][2];
                                    sgArr[7] = sGrid[1][2];
                                    sgArr[8] = sGrid[2][2];
                                    break;
                            case 3:
                            case 4:
                            case 5:
                                    sgArr[0] = sGrid[0][3];
                                    sgArr[1] = sGrid[1][3];
                                    sgArr[2] = sGrid[2][3];
                                    sgArr[3] = sGrid[0][4];
                                    sgArr[4] = sGrid[1][4];
                                    sgArr[5] = sGrid[2][4];
                                    sgArr[6] = sGrid[0][5];
                                    sgArr[7] = sGrid[1][5];
                                    sgArr[8] = sGrid[2][5];
                                    break;
                            default:
                                    sgArr[0] = sGrid[0][6];
                                    sgArr[1] = sGrid[1][6];
                                    sgArr[2] = sGrid[2][6];
                                    sgArr[3] = sGrid[0][7];
                                    sgArr[4] = sGrid[1][7];
                                    sgArr[5] = sGrid[2][7];
                                    sgArr[6] = sGrid[0][8];
                                    sgArr[7] = sGrid[1][8];
                                    sgArr[8] = sGrid[2][8];
                                    break;
                            }
                    break;
                    case 3:
                    case 4:
                    case 5:
                            if(y == 0 || y == 1 || y == 2){
                                    sgArr[0] = sGrid[3][0];
                                    sgArr[1] = sGrid[4][0];
                                    sgArr[2] = sGrid[5][0];
                                    sgArr[3] = sGrid[3][1];
                                    sgArr[4] = sGrid[4][1];
                                    sgArr[5] = sGrid[5][1];
                                    sgArr[6] = sGrid[3][2];
                                    sgArr[7] = sGrid[4][2];
                                    sgArr[8] = sGrid[5][2];
                            }
                            else if(y == 3 || y == 4 || y ==5){
                                    sgArr[0] = sGrid[3][3];
                                    sgArr[1] = sGrid[4][3];
                                    sgArr[2] = sGrid[5][3];
                                    sgArr[3] = sGrid[3][4];
                                    sgArr[4] = sGrid[4][4];
                                    sgArr[5] = sGrid[5][4];
                                    sgArr[6] = sGrid[3][5];
                                    sgArr[7] = sGrid[4][5];
                                    sgArr[8] = sGrid[5][5];
                            }
                            else {
                                    sgArr[0] = sGrid[3][6];
                                    sgArr[1] = sGrid[4][6];
                                    sgArr[2] = sGrid[5][6];
                                    sgArr[3] = sGrid[3][7];
                                    sgArr[4] = sGrid[4][7];
                                    sgArr[5] = sGrid[5][7];
                                    sgArr[6] = sGrid[3][8];
                                    sgArr[7] = sGrid[4][8];
                                    sgArr[8] = sGrid[5][8];
                            }
                            break;
                    default:
                            if(y == 0 || y == 1 || y == 2){
                                    sgArr[0] = sGrid[6][0];
                                    sgArr[1] = sGrid[7][0];
                                    sgArr[2] = sGrid[8][0];
                                    sgArr[3] = sGrid[6][1];
                                    sgArr[4] = sGrid[7][1];
                                    sgArr[5] = sGrid[8][1];
                                    sgArr[6] = sGrid[6][2];
                                    sgArr[7] = sGrid[7][2];
                                    sgArr[8] = sGrid[8][2];
                                    }
                            else if(y == 3 || y == 4 || y ==5){
                                    sgArr[0] = sGrid[6][3];
                                    sgArr[1] = sGrid[7][3];
                                    sgArr[2] = sGrid[8][3];
                                    sgArr[3] = sGrid[6][4];
                                    sgArr[4] = sGrid[7][4];
                                    sgArr[5] = sGrid[8][4];
                                    sgArr[6] = sGrid[6][5];
                                    sgArr[7] = sGrid[7][5];
                                    sgArr[8] = sGrid[8][5];
                                    }
                            else{
                                    sgArr[0] = sGrid[6][6];
                                    sgArr[1] = sGrid[6][7];
                                    sgArr[2] = sGrid[6][8];
                                    sgArr[3] = sGrid[7][6];
                                    sgArr[4] = sGrid[7][7];
                                    sgArr[5] = sGrid[7][8];
                                    sgArr[6] = sGrid[8][6];
                                    sgArr[7] = sGrid[8][7];
                                    sgArr[8] = sGrid[8][8];
                                }
                                break;
        }

        return sgArr;
    }

}
