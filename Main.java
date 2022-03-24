class Main {
  public static void main(String[] args) {
// for, while, do while

int i = 0;
  do  { 
    System.out.println(i);
    i++;
    }while (i < 32);
    
    //printBinary(5, 8);
    
  }

private static void printBinary(long value, int size){
  for (int i = size -1; i >= 0; i --){
    long mask = 1L << i;
    long result = (mask & value) >> i;
    System.out.print (result);
  }
System.out.println();
//System.out.println(Long.toBinaryString(value));
}
} 