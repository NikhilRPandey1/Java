class check_Prime_Number_without_function{
  public static void main(String[] args){
    int number = 11;
    boolean flag = true;
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
