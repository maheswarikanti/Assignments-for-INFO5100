import java.util.Random;
public class SumValue extends Thread{

    static int total;
    private int[] arr;
    private int low, high, partial;

    public SumValue(int[] arr, int low, int high)
    {
        this.arr = arr;
        this.low = low;
        this.high = Math.min(high, arr.length);
    }

    public int getPartialSum()
    {
        return partial;
    }

    public void run()
    {
        partial = sum(arr, low, high);
    }

    public static int sum(int[] arr, int low, int high)
    {
        int partialTotal = 0;

        for (int i = low; i < high; i++) {
            partialTotal += arr[i];
        }

        return partialTotal;
    }

    public static int parallelSum(int[] arr)
    {
        return parallelSum(arr, 4);
    }

    public static int parallelSum(int[] arr, int threads)
    {
        int size = (int) Math.ceil(arr.length * 1.0 / threads);

        SumValue[] sums = new SumValue[threads];

        for (int i = 0; i < threads; i++) {
            sums[i] = new SumValue(arr, i * size, (i + 1) * size);
            sums[i].start();
        }

        try {
            for (SumValue sum : sums) {
                sum.join();
            }
        } catch (InterruptedException e) { }

        total = 0;

        for (SumValue sum : sums) {
            total += sum.getPartialSum();
        }
        return total;
    }

    static void createRandomArray(int[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(101) + 1; // 1..100
        }
    }

    public static void main(String[] args)
    {
        int[] arr = new int[400000];
        createRandomArray(arr);
        parallelSum(arr);
        System.out.println("Sum: " + total);
    }
}
