import java.util.Arrays;

public class Tester {
  // for test cases and print statements
  public static void main(String[] args) {
    int[] arrempty = {};
    int[] arr1 = {1, 9, 4};
    int[] arr2 = {1, 3, 5};
    int[][] deep1 = {{4, 5, 1}, {3, 6, 9}, {17, 45, 7}, {12, 12, 13}};
    int[][] deep2 = { {  1,  0, 12, -1 },
                      {  7, -2,  2,  1 },
                      { -5, -2,  2, -9 }
                    };
    int[][] depp1 = { {  1,  2, 3, 4 },
                      {  2, 3,  4,  1 },
                      { 3, 4,  1, 2 }
                    };
    int[][] depp2 = { {  1,  1, 1 },
                      {  2, 2, 2 },
                      { 3,  3, 3 }
                    };
    int[][] depp3 = { {  2,  2, 2 },
                      {  2, 2, 2 }
                    };

    //System.out.println(ArrayOps.sum(arr1));
    //System.out.println(ArrayOps.sum(arr2));
    //System.out.println(ArrayOps.sum(arrempty));

    //System.out.println(ArrayOps.largest(arr1));
    //System.out.println(ArrayOps.largest(arr2));

    //System.out.println(Arrays.toString(ArrayOps.sumRows(deep1)));
    //System.out.println(Arrays.toString(ArrayOps.sumRows(deep2)));

    //System.out.println(Arrays.toString(ArrayOps.largestInRows(deep1)));
    //System.out.println(Arrays.toString(ArrayOps.largestInRows(deep2)));

    //System.out.println(ArrayOps.sum(deep1));
    //System.out.println(ArrayOps.sum(deep2));

    //System.out.println(Arrays.toString(ArrayOps.sumCols(deep1)));
    //System.out.println(Arrays.toString(ArrayOps.sumCols(deep2)));

    //System.out.println(ArrayOps.isRowMagic(depp1));
    //System.out.println(ArrayOps.isRowMagic(depp2));
    //System.out.println(ArrayOps.isRowMagic(depp3));

    System.out.println(ArrayOps.isColMagic(depp1));
    System.out.println(ArrayOps.isColMagic(depp2));
    System.out.println(ArrayOps.isColMagic(depp3));
  }

}
