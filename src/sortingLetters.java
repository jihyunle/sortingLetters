import java.util.Scanner;

public class sortingLetters {
    public static void main(String[] args){

        String a;
        String b;
        String c;

        String temp;

        // prompt user for three letters
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the first letter: ");
        a = keyboard.next();

        System.out.println("Enter the second letter: ");
        b = keyboard.next();

        System.out.println("Enter the third letter: ");
        c = keyboard.next();

        // sort them into ascending sequence
        System.out.println("before sort: " + a + b + c);

        // max number of swaps for 3 letters is 3
        if(a.compareToIgnoreCase(b)>0){
            temp = a;
            a = b;
            b = temp;
        }

        if (a.compareToIgnoreCase(c)>0){
            temp = c;
            c = a;
            a = temp;
        }
        if(b.compareToIgnoreCase(c)>0){
            temp = b;
            b = c;
            c = temp;
        }

        // display all
        System.out.println("after sort: " + a + b + c);

    }
}
