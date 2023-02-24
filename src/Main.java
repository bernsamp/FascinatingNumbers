import java.util.Scanner;

/* Fascinating Numbers

Multiplying a number by two and three separately, the number obtained by writing the results obtained with the given number will be called a fascinating number. If the result obtained after concatenation contains all digits from 1 to 9, exactly once.

In other words, we can also say that a number (n) may be a fascinating number if it satisfies the following two conditions:

    If the given number is a 3 or more than three-digit
    If the value getting after concatenation contains all digits from 1 to 9, exactly once.

Let's take any number (n) say 327 and check whether the given number is fascinating or not. On multiplying the given number (n) by 2 and 3, we get:

327×2=654

327×3=981

Now, concatenate the above results to the given number (n).

"327"+"654"+ "981"= 327654981

We observe that the resultant () contains all the digits from 1 to 9, exactly once. Hence, the given number 327 is a fascinating number. Note that, we have not added the result to the given number. Some other fascinating numbers are 192, 219, 273, 327, 1902, 1920, 2019 etc.

 */

public class Main{

    public static boolean isFascinatingNumber(int number){

        String str = "" + number + number*2 + number*3;

        int[] digitsArray = new int[10];


        for(int i=0; i<str.length(); i++){

            int digit = str.charAt(i) - '0';

            if(digit==0 || digitsArray[digit]==0)
                digitsArray[digit]++;
            else return false;
        }

        for(int i=1; i<digitsArray.length; i++){
            if(digitsArray[i]==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter lower limit: ");
        int lowerLimit = scan.nextInt();

        System.out.print("Enter upper range:");
        int upperLimit = scan.nextInt();

        System.out.println("The Fascinating numbers from " + lowerLimit + " to " + upperLimit + " are: ");

        for(int i=lowerLimit ; i<=upperLimit ; i++){
            if(isFascinatingNumber(i))
                System.out.print(i + " ");
        }
    }
}