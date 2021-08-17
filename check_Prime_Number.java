import java.util.*;
class check_Prime_Number{
  public static void main(String[] args){
    // function call
  check_prime_Number();
  }
  //function to check prime number
  private static void check_prime_Number(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter number to check prime or not ");
    int number = scan.nextInt();
    boolean flag;
    for(int i = 2; i <= number / 2; i++){
    if(number % 2 == 0){
      System.out.println("Not prime number : ");
      flag = false;
      break;
      }
    }
    if(flag == true){
    System.out.println("Prime Number : ");
    }
  }
}
