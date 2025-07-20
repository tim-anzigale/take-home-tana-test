public class Question5_ClosestMinimum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 4, 5, 2};

        // Step 1: Find the minimum value in the array
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }

        // Step 2: Find the closest distance between any two positions of the minimum value
        int lastIndex = -1;
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == minValue) {
                if (lastIndex != -1) {
                    int distance = i - lastIndex;
                    if (distance < minDistance) {
                        minDistance = distance;
                    }
                }
                lastIndex = i;
            }
        }

        // Step 3: Output the result
        System.out.println("Closest distance between minimums: " + minDistance);
    }
}
