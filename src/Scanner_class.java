import java.io.PrintStream;
import java.util.Scanner; //Import the Scanner class

public class Scanner_class {
    public static void main(String[] args) {

        //task 8

Scanner SizeA = new Scanner(System.in); // Create a scanner object
System.out.println("Enter the lengh of your parcel: ");

String userSizeA = SizeA.nextLine(); // Read user input
System.out.println("The lengh of my parcel is: " + userSizeA); // Output, user input

Scanner SizeB = new Scanner(System.in);
System.out.println("Enter the width of your parcel: ");

String userSizeB = SizeB.nextLine();
System.out.println("The width of my parcel is: " + userSizeB);

int A = 13;
int B = 39;
System.out.println(A*B);

    }}
