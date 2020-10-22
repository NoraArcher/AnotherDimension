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

  //
  
}
