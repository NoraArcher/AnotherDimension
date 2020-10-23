public class ArrayOps {

  public static int sum(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum;
  }

  public static int largest(int[] arr) {
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }

  public static int[] sumRows(int[][] matrix) {
    int[] arr = new int[matrix.length];
    for (int row = 0; row < matrix.length; row++) {
      arr[row] = sum(matrix[row]);
    }
    return arr;
  }

  public static int[] largestInRows(int[][] matrix) {
    int[] arr = new int[matrix.length];
    for (int row = 0; row < matrix.length; row++) {
      arr[row] = largest(matrix[row]);
    }
    return arr;
  }

  public static int sum(int[][] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += sum(arr[i]);
    }
    return sum;
  }

  public static int[] sumCols(int[][] matrix) {
    int[] col0 = matrix[0];
    int[] arr = new int[col0.length];
    for (int i = 0; i < col0.length; i++) {
      //i needs to iterate through through column length not row length
      for (int j = 0; j < matrix.length; j++) {
        arr[i] += matrix[j][i];
      }
    }
    return arr;
  }

  public static boolean numSame(int[] arr) {
    boolean same = true;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] != arr[i - 1]) {
        same = false;
      }
    }
    return same;
  }

  public static boolean isRowMagic(int[][] matrix) {
    return numSame(sumRows(matrix));
  }

  public static boolean isColMagic(int[][] matrix) {
    return numSame(sumCols(matrix));
  }

    ///UNDONE BELOW

  public static boolean isLocationMagic(int[][] matrix,
                                        int row, int col) {
    return false;
  }

}
