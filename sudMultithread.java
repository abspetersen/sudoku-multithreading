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
public class Multithreading extends Thread {
    private
            int arr[];
            int n = 0;
            int numThreads = 0;

    Multithreading(int arr[], int _numThreads){
        this.arr = arr;
        numThreads = _numThreads;
    }

    //checks each thread to see if sudoku solution is valid
    //prints out row/column/subgrid number of area with
    //invalid solution
    @Override
    public void run()
    {
        try
        {
            for(int i = 0; i < (arr.length) ;i++){
                for(int j = (i+1); j < (arr.length); j++){
                    if((arr[j] == arr[i]) && (arr[i] <= 9 && arr[i] >= 0) && (arr[j] <= 9 && arr[j] >= 0)){
                        n++;
                    }
                }
            }

            if(n > 0){
                if(numThreads <= 9){
                    System.out.println ("Row Number: " + numThreads + " does not contain a valid sudoku solution!\n");
                }
                else if((numThreads > 9) && (numThreads <= 18)){
                    System.out.println ("Column Number: " + (numThreads-9) + " does not contain a valid sudoku solution!\n");
                }
                else{
                    System.out.println ("From left to right and top to bottom: sub-grid number: " + (numThreads-18) + " does not contain a valid sudoku solution!\n");
                }
            }
            else{
                if(numThreads <= 9){
                    System.out.println ("Row Number: " + numThreads + " contains a valid sudoku solution!\n");
                }
                else if((numThreads > 9) && (numThreads <= 18)){
                    System.out.println ("Column Number: " + (numThreads-9) + " contains a valid sudoku solution!\n");
                }
                else{
                    System.out.println ("From left to right and top to bottom: sub-grid number: " + (numThreads-18) +  " contains a valid sudoku solution!\n");
                }

            }

        }
        catch (Exception e)
        {
            //Throwing an exception
            System.out.println ("Exception was caught!\n");
        }
    }
}
