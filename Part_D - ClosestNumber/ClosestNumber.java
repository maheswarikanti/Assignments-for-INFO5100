
class ClosestNumber {

    // Returns element closest to target in arr[] 
    public static int findClosest(int arr[], int target)
    {
        int n = arr.length;
        if (arr == null)
            throw new NullPointerException("Can't handle null arrays");
        // Corner cases
        if (target <= arr[0])
            return arr[0];
        if (target >= arr[n - 1])
            return arr[n - 1];

        // Doing binary search
        int i = 0, j = n, mid = 0;
        while (i < j) {
            mid = (i + j) / 2;

            if (arr[mid] == target)
                return arr[mid];

            /* If target is less than array element,
               then search in left */
            if (target < arr[mid]) {

                // If target is greater than previous
                // to mid, return closest of two
                if (mid > 0 && target > arr[mid - 1])
                    return getClosest(arr[mid - 1],
                            arr[mid], target);

                /* Repeat for left half */
                j = mid;
            }

            // If target is greater than mid
            else {
                if (mid < n-1 && target < arr[mid + 1])
                    return getClosest(arr[mid],
                            arr[mid + 1], target);
                i = mid + 1; // update i
            }
        }

        // Only single element left after search
        return arr[mid];
    }

    public static int getClosest(int val1, int val2,
                                 int target)
    {
        if (target - val1 >= val2 - target)
            return val2;
        else
            return val1;
    }

    public static int findIndex(int arr[], int t)
    {

        // if array is Null
        if (arr == null) {
            return -1;
        }

        // find length of array
        int len = arr.length;
        int i = 0;

        // traverse in the array
        while (i < len) {

            // if the i-th element is t
            // then return the index
            if (arr[i] == t) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
        return -1;
    }

    // Driver code 
    public static void main(String[] args)
    {
        try{
            int arr[] = { 1, 2, 4, 5, 6, 6, 8, 9 };
            int target = 11;
            int arr1[] = null;
            int target1 = 2;
            int arr2[] = {0, 1, 5};
            int target2 = 7;
            System.out.println(findIndex(arr, findClosest(arr, target)));
            System.out.println(findIndex(arr2, findClosest(arr2, target2)));
            System.out.println(findIndex(arr1, findClosest(arr1, target1)));

        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
    }
} 