/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            fizzBuzzWhile(i);
            i++;
        }

    }

    public static void fizzBuzzWhile(int i) {
        boolean divBy3 = i % 3 == 0;
        boolean divBy5 = i % 5 == 0;
        if (divBy3) {
            System.out.println("Fizz");
        }
        else if (divBy5) {
            System.out.println("Buzz");
        }
        else if (divBy3 && divBy5){
            System.out.println("FizzBuzz");
        }
        else {
            System.out.println(i);
        }
    }
}
