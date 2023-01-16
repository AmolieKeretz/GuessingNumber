//Answer = number(Math.random()*)
//User input
//while(input<101)
//if(number==input)
//print found
//else if(number>input)
//print greater
//else(number<input)
//print less
//if(input >101)
//print dumb
import java.util.Scanner;
public class GuessFunc{
    static void guessGame(){
        Scanner input = new Scanner(System.in);
        int number = (int)(Math.random()*101);
        System.out.println("This is a Guessing Game\nYou get 5 chance\n0 to 100\nENJOY!");
        int chance = 5;
        int guess;
        while(chance-1>=0){
            int count = chance-1;
            System.out.println("Enter a number");
            guess = input.nextInt();
            if(guess >= 101){
                System.out.println("\t\t\tDUMB\nTHIS IS THE ONLY THINK WRITTEN IN BOLD AND REPEATED\n\tDUMB DUMD \nGO PLAY AN EASY GAME DUMB\nChoose "+count+" left");
                }
            else if(number == guess){
                System.out.println("Congrates!\n You are one of them");
                break;
            }
            else if(number > guess){
                System.out.println("Guess a Greater number\n"+count+" left");
            }
            else{
                System.out.println("Guess a lesser number\n"+count+" left");
                }  
            chance--;
        }
        System.out.println("The Answer was "+number);
        input.close();
    }
    public static void main(String[] args) {
        guessGame();
    }
}