import java.util.concurrent.RecursiveAction;
import java.util.concurrent.ForkJoinPool;
import java.util.Arrays;

public class RecursiveAction_1 {
    static class SumTask extends RecursiveAction {
        final int[] array;
        final int lo, hi;

        SumTask(int[] array, int lo, int hi) {
            this.array = array;
            this.lo = lo;
            this.hi = hi;
        }

        @Override
        protected void compute() {
            if (hi - lo < 2) {
                return;
            }
            int mid = (lo + hi) >>> 1;
            SumTask left = new SumTask(array, lo, mid);
            SumTask right = new SumTask(array, mid, hi);
            invokeAll(left, right);
            array[mid - 1] += array[mid];
        }
    }

    public static void main(String[] args) {
        int[] array = new int[1000000];
        Arrays.fill(array, 1);
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(new SumTask(array, 0, array.length));
        System.out.println(array[array.length - 1]);
    }
}
