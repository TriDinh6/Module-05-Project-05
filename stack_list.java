
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

/**
 * main purpose of this class to read inputs from the user then put into a stack 
 * then sort the stack in ascending order
 * @author Tri Dinh
 * @version 1.0
 * @since week 5 of CSC6301
 */
public class stack_list {

    /**
     * the main function which is a copy of the module 4 homework with some maintenance to work with stack instead of linked list
     * • replaced the linked list with a stack
     * • ask the user repeatedly what number they want put in the stack (instead of link list) until getting any input that is not a number
     * • replaced the "num_list.add(number_input)" with "num_list.push(number_input)"
     * • print unsorted stack the sort it with Collections.sort(num_list) then print it again
     * 
     * @param args store cmd line prompts
     */
    public static void main(String[] args) {

        //setting up the link list and scanner
        /******************** maintenance and reuse code ***************************************************************
         * replaced "LinkedList<Integer> num_list = new LinkedList<>()" with "Stack<Integer> num_list = new Stack<>()"
         * ********************************************************************************************************/
        //LinkedList<Integer> num_list = new LinkedList<>();
        Stack<Integer> num_list = new Stack<>();
        Scanner read_numbers = new Scanner(System.in);

        //ask user for numbers until a non-number is entered
        /******************** maintenance and reuse code ***************************************************************
         * replaced "num_list.add(number_input)" with "num_list.push(number_input)"
         * ********************************************************************************************************/
        while(true){
            try {
                System.out.print("enter the numbers you want in the list(to stop, enter anything that is not a number): ");
                int number_input = read_numbers.nextInt();
                //num_list.add(number_input);
                num_list.push(number_input);
            } catch (Exception e) {
                break;
            }
            
        }
        
        /******************** reuse code *********************
         * use "Collections.sort(num_list)"  to sort array
         * ****************************************************/
        System.out.println("before: " + num_list);
        Collections.sort(num_list);
        System.out.println("Sorted: " + num_list);


        read_numbers.close();
        
        
    }

   
    

}
