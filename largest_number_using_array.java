class largest_number{
  public static void main(String[] args){
  int arr[] = {58,98,45,25,63,10,52};
    largest_number(arr);
  }
  private static void largest_number(int[] arr){
  int largest = arr[0];
    for(int i=0; i < arr.length; i++){
      if(largest < arr[i]){
        largest = arr[i];
      }
    }
    System.out.println("Largest Number is : "+largest);
  }
}
