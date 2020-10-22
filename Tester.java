import java.util.Arrays;

public class Tester {
  // for test cases and print statements
  public static void main(String[] args) {
    int[] arrempty = {};
    int [] arr1 = {1, 9, 4};
    int[][] deep1 = {{4, 5, 1}, {3, 6, 9}, {17, 45, 7}, {12, 12, 13}};

    System.out.println(ArrayOps.sum(arr1));
    System.out.println(ArrayOps.sum(arrempty));

    System.out.println(ArrayOps.largest(arr1));

    System.out.println(Arrays.toString(ArrayOps.sumRows(deep1)));

    System.out.println(Arrays.toString(ArrayOps.largestInRows(deep1)));


  }

}
