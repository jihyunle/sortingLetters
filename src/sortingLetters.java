import java.util.Scanner;

public class sortingLetters {
    public static void main(String[] args){
        char a;
        char b;
        char c;

        char temp;

        // prompt user for three letters
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the first letter: ");
        a = keyboard.next().charAt(0);
        System.out.println("Enter the second letter: ");
        b = keyboard.next().charAt(0);
        System.out.println("Enter the third letter: ");
        c = keyboard.next().charAt(0);

        // sort them into ascending sequence
        System.out.println("before sort: " + a + b + c);
        // max number of swaps for 3 letters is 3
        if(a<b){
            temp = a;
            a = b;
            b = temp;
        }
        if(b<c){
            temp = b;
            b = c;
            c = temp;
        }
        if (c<a){
            temp = c;
            c = a;
            a = temp;
        }

        // display all
        System.out.println("after sort: " + a + b + c);

    }
}
