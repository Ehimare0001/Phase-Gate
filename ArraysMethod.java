import java.util.Arrays;

public class ArraysMethod{ 

  public static void main(String[]args){

        int [][] numbers = {
                            {1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9},

       };            

for(int index = 0; index < numbers.length;index++) {
  for(int count = numbers.length-1; count >=0; count--) {
  
  System.out.print(numbers[index][count] + " ");
   
  
  }

 System.out.println();
}
}
}
