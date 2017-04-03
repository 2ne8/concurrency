package threadinglab.primes;

import threadinglab.util.Profiler;

/**
 * Main class for Lab7. Prints the number of primes in the range [2, MAX_NUMBER_TO_TEST).
 * 
 * @author jw19, kwhan
 *
 */
public class PrimesMain {
	public static final int MAX_NUMBER_TO_TEST = 8000000;
	
	public static void main(String [] argv){
		Profiler p = Profiler.getInstance();
		p.startProfiling();
		
		int numprimes = 0;
		/** TODO(1): Count the number of primes less than MAX_NUMBER_TO_TEST, and store it in numprimes*/

		
		/** TODO(2): Count the number of primes less than MAX_NUMBER_TO_TEST using 4 separate threads.
		* In order to count the number of primes using several threads, we give each thread a shared counter and
		* each thread will increment that counter. Each thread also gets some range of numbers to test for primality.
		* The final value of the counter will be the total number of primes.
		* 
		* Pseudocode:
		* create a shared counter (use IntegerWrapper)
		* create 4 threads (use PrimeCalcThread)
		* start the threads
		* join the threads
		*
		* store the final result in numprimes
		*/

		
		
		//DO NOT TOUCH CODE BELOW THIS LINE
		System.out.println("The number of prime numbers less than " + MAX_NUMBER_TO_TEST + " is " + numprimes);
		System.out.println(p.stopProfiling());
	}
}
