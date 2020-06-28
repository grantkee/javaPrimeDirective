// Import statement:
import java.util.ArrayList;

class PrimeDirective {
  
  //method to check if specific number is prime
  public boolean isPrime(int number){
    boolean primeStatus = true;
    if(number == 2){
      return primeStatus;
    } else if (number < 2){
      return !primeStatus;
    }
    for(int i = 2; i < number; i++){
      if(number % i == 0){
        primeStatus = false;
      }
    }
    return primeStatus;
  }

  // method to filter int[] and return prime numbers
  public ArrayList<Integer> onlyPrimes(int[] numbers){
    ArrayList<Integer> primes = new ArrayList<Integer>();
    for(int number : numbers){
      if(isPrime(number)){
        primes.add(number);
      }
    }
    return primes;
  }
  
  //main
  public static void main(String[] args) {

    PrimeDirective pd = new PrimeDirective();
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89, 31};
    // System.out.println(numbers);
    System.out.println(pd.onlyPrimes(numbers));
  }
}
