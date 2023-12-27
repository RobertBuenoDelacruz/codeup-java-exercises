import java.util.Arrays;
public class Practicing {
    public static int minCostReduceArray(int[] arr) {
        Arrays.sort(arr);
        int totalCost = 0;

        while (arr.length > 1) {
            int smallest1 = arr[0];
            int smallest2 = arr[1];

            int cost = smallest1 + smallest2;
            totalCost += cost;

            int[] newArr = new int[arr.length -1];
            newArr[0] = cost;
            for(int i = 2; i < arr.length; i++) {
                newArr[i - 1] = arr[i];
            }

            arr = newArr;
            Arrays.sort(arr);
        }
        return totalCost;
    }
    public static void main(String[] args) {
        int[] array = {4, 6, 8, 9};
        int result = minCostReduceArray(array);
        System.out.println("Minimum cost to reduce array to single element: " + result);
    }
}
