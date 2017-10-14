/**
 * <h1>GitGood - Big O Practice Algorithms</h1>
 * This implements the practice problems for big o problems in the book, cracking the coding interview
 * <p>
 * If you have any question concerning git good, see <a href="https://github.com/funkeyfreak/GitGood/wiki">the wiki</a>. If that doesn't work, check to see if there is an <a href="https://github.com/funkeyfreak/GitGood/issues">issue</a> submitted. Feel free to create a pull request, but make sure you read the requirements for doing as such on the wiki. Peace and Love.
 * <p>
 * Dalin Williams
 * @title GitGood.CrackingTheCodingInterview(TM).bigo
 * @author Dalin Williams, aka <a href="https://github.com/funkeyfreak">@funkeyfreak</a>
 * @copyright Apache 2.0, see <a href="https://github.com/funkeyfreak/GitGood/blob/master/LICENSE">LICENCE.md for more details</a>
 * @since 2017-10-09
 * @version 0.1.0
 */

package com.gitgood.crackingthecodinginterview.bigo;
import org.jetbrains.annotations.Contract;


//resolves the todo for now, remove when complete
import static java.util.Arrays.binarySearch;
import static java.util.Arrays.sort;

/**
 * <h1>Algos</h1>
 * The general assortment of algorithms/problems given in each section of cracking the coding interview.
 * <p>
 * As per the usual, we have a catalogue of tests for every exported(public) function. Please, ensure you do the same
 * <p>
 * Algos as discussed on page 55 of cracking the coding interview
 * <b>NOTE:</b> These are algorithms for practicing big o understanding and in no means should be interpreted as the 'correct' way to develop an algorithm.
 *
 * @author Dalin Williams
 * @since 10-09-2017
 * @version 0.1.0
 */
public class Algo {
    /**
     * The time complexity of product is b
     *
     *
     * @param a the item to sum
     * @param b the number with which to multiply a by
     * @return the sum of a b times
     * @attempts 1 attempt(s) made by @user in bigo.Algo.product
     */
    @Contract(pure = true)
    public static int product(int a, int b){
        int sum = 0;
        for (int i = 0; i < b; i++){
            sum += a;
        }
        return sum;
    }

    /**
     * Gets the result of a raised to the power of b
     *
     * Uses recursion to achieve the calculation of a raised to the power of b
     *
     * @bigo The time complexity of power is b
     *
     * @attempts 1 attempt(s) by @user on bigo.Algo.power
     * @param a the number to raise b to
     * @param b the number to power
     * @return a^b
     */
    public static int power(int a, int b){
        if (b < 0){
            return 0;
        } else if (b == 0) {
            return 1;
        } else {
            return a * power(a, b - 1);
        }
    }

    /**
     * Finds the mod of a on b
     *
     * Uses simple arithmetic operations to get the modulo result
     *
     * @bigo The time complexity of mod is 1
     * @attempts 1 attempt(s) made by @user on bigo.Algo.mod
     * @param a the number with which to mod b by
     * @param b the number to mod
     * @return a and b
     */
    @Contract(pure = true)
    public static int mod(int a, int b){
        if (b <= 0){
            return -1;
        }
        int div = a / b;
        return a - div * b;
    }

    /**
     * Gets the result of a/b
     *
     * Uses a interesting approach that leaves no remainder. This remainder can be found if compared against the original sum
     *
     * @bigo The time complexity of div is a at worst case, 1 at best, a/b at theta
     * @attempts 1 attempt(s) were made by @user on bigo.Algo.div
     * @param a the divisor
     * @param b the number
     * @return a / b
     */
    @Contract(pure = true)
    public static int div(int a, int b) {
        int count = 0;
        int sum = b;
        while (sum <= a) {
            sum += b;
            count++;
        }
        return count;
    }

    /**
     * Gets the square root of a number through recursion
     *
     * @bigo the complexity of sqrt is log(n)
     * @attempts 1 attempts were made by @author on bigo.Algo.sqrt
     * @param n the number to find the square root
     * @return the square root of n
     */
    public static int sqrt(int n){
        return sqrtHelper(n, 1, n);
    }

    private static int sqrtHelper(int n, int min, int max){
        if(max < min){
            return -1;
        }
        int guess = (min + max) / 2;
        if (guess * guess == n){
            return guess;
        } else if (guess * guess < n) {
            return sqrtHelper(n, guess + 1, max);
        } else{
            return sqrtHelper(n, min, guess - 1);
        }
    }

    /**
     * Gets the square root of an integer through a iterative loop
     *
     * Uses a non recursive method as opposed to the bethod above
     *
     * @bigo The time complexity of sqrtLoop is sqroot(n)
     * @attempts 1 attempt(s) were made on bigo.Algo.sqrtLoop
     * @param n The integer to square
     * @return The squared integer
     */
    public static int sqrtLoop (int n) {
        for (int guess = 1; guess * guess <= n; guess++){
            if (guess * guess == n) {
                return guess;
            }
        }
        return -1;
    }
    /*
        TODO: Implement a btree solution that shows the following Non code result
        If you are given a unbalanced tree, what is the worst case to find a element

        at worst, a non balanced tree will have a search time of N
     */

    /*
        TODO: Implement a btree solution that shows the following Non code result
        If you are looking for a specific value in a binary tree, but it is not a BST

        at worst, a non BST binary tree is n
     */

    /**
     * Takes an array and copies it by moving one item at a time to a new array
     *
     * This is an example of a more tricky big o approximation
     *
     * @bigo The time complexity of appendArray through copyArray is n^2
     * @attempts 1 attempt(s) were made by @user on bigo.Algo.copyArray
     * @param array an array of int.
     * @return appends a new value to an array by creating a new longer array
     */
    @Contract(pure = true)
    public static int[] copyArray(int[] array){
        int[] copy = new int[0];
        for (int value : array){
            copy = appendToNew(copy, value);
        }
        return copy;
    }

    /**
     * Takes an array and appends a new value to said array
     *
     * @bigo The time complexity of appendArray is n
     * @attempts 1 attempt(s) were made by @user on bigo.Algo.appendToNew
     * @param array The array on which to append
     * @param value The value to append
     * @return The appendedArray, i.e. array.length+1
     */
    @Contract(pure = true)
    public static int[] appendToNew(int[] array, int value){
        int[] bigger = new int[array.length + 1];
        for (int i = 0; i < array.length; i++){
            bigger[i] = array[i];
        }

        bigger[bigger.length - 1] = value;
        return bigger;
    }

    /**
     *
     * Sums the numbers within a digit
     *
     * @bigo The time complexity of sumDigits is log(n)
     * @attempts 2 attempt(s) were made by @user on bigo.Algo.sumDigits
     * @param n The digit to sum
     * @return The number of digits in a number (base 10)
     */
    public static int sumDigits(int n){
        int sum = 0;
        while (n > 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    /**
     * A wrapper sub class for the numChars O() problem
     * @see numChars child method "printSortedStrings
     */
    public static class numChars{
        private static int numChars = 26;

        /***
         * Prints all sorted strings of length remaining
         *
         * @bigo The complexity of numChars is O(lc^l) where l is the length of the string, and c is the numChars variable
         * @attempts 2 attempt(s) made by @user on bigo.Algo.numChars.printSortedStrings
         * @param remaining the number of characters you want to print, permute, and sort
         */
        public static void printSortedStrings(int remaining){
            printSortedStrings(remaining, "");
        }
        private static void printSortedStrings(int remaining, String prefix) {
            if (remaining == 0){
                if (isInOrder(prefix)){
                    System.out.println(prefix);
                }
                else {
                    for (int i = 0; i < numChars; i++){
                        char c = ithLetter(i);
                        printSortedStrings(remaining, prefix + c);
                    }
                }
            }
        }

        private static boolean isInOrder(String s){
            for(int i = 1; i < s.length(); i++){
                int prev = ithLetter(s.charAt(i-1));
                int curr = ithLetter(s.charAt(i));
                if (prev > curr){
                    return false;
                }
            }
            return true;
        }
        @Contract(pure = true)
        private static char ithLetter(int i) {
            return (char) (((int) 'a') + i);
        }
    }

    /**
     *
     * Finds the intersection of two arrays of integers
     *
     * Uses merge sort and then binary search to find the intersection
     *
     * @bigo The complexity of intersection is O(log[a]+log[b]) due to using two log base searches
     * @attempts 2 attempt(s) made by @user on bigo.Algo.intersection
     * @param a The first array
     * @param b The second array
     * @return The number of common elements in two given arrays
     */
    public static int intersection(int[] a, int[] b){
        //TODO import from data structures and algos source once completed
        //mergesort(b);
        //This runs a merge sort from java's utils package. See the following link for more details.
        //https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html
        sort(a);

        int intersect = 0;
        for(int x : a){
            //TODO import from data structures and algos source once completed
            if(binarySearch(b, x) >= 0) {
                intersect++;
            }
        }
        return intersect;
    }
}
