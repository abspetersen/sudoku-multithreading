/*
 * program that uses multithreading to validate a solution to a 9x9 sudoku-
 * threads are used to keep track of values in each row, column, and 3x3 sub-grid.
 * row(s)/column(s)/3x3 sub-grid(s) number(s) that contain atleast one error
 * are displayed
 */

package sudoku;

/**
 *
 * @author abbypetersen
 */
public class Sudoku {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

            //create grid object and fill with values
            Grid g = new Grid(9,9);
            g.fillGrid();

            //x and y placeholder values to keep track of rows and columns
            int x = 0;
            int y = 0;

            //variable to keep track of number of threads
            int p = 0;

            //create a thread for each row and
            //pass array of numbers in each row
            //as a parameter to the thread
            for(int i = 0; i < 9; i++){
                p = (i+1);
                Multithreading sud = new Multithreading((g.getRow(x, i)),p);
                sud.start();
            }


            //create a thread for each column and
            //pass array of numbers in each column
            //as a parameter to the thread
            for(int i = 0;i < 9;i++){
                p++;
                Multithreading sud = new Multithreading((g.getColumn(i,y)),p);
                sud.start();
            }



            //create a thread for each 3x3 subgrid and
            //pass array of numbers in each 3x3 subgrid
            //as a parameter to the thread
            for(int i = 0; i < 9; i += 3){
                p++;
                Multithreading sud = new Multithreading((g.getSubGrid(i,0)),p);
                sud.start();
            }

            for(int i = 0; i < 9; i += 3){
                p++;
                Multithreading sud = new Multithreading((g.getSubGrid(i,3)),p);
                sud.start();
            }

            for(int i = 0; i < 9; i += 3){
                p++;
                Multithreading sud = new Multithreading((g.getSubGrid(i,6)),p);
                sud.start();
            }
    }

}
