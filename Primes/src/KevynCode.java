import java.util.ArrayList;

public class KevynCode{
 
    public static void main(String[] args) {
 
        final int MAX = 1000;
        boolean primes[];
        primes = new boolean[MAX];

        long startTimes = System.currentTimeMillis();
        //compute(primes);
        compute(1000);
        System.out.println(System.currentTimeMillis()-startTimes); //subtract current by starttime

        //display(primes);

        display(compute(MAX));
 
    }

    public static ArrayList<Integer> compute(int n) {

        ArrayList<Integer> list = new ArrayList<Integer>(n);

        for(int i = 2; i < n; i += 2) {
            list.add(i);
        }

        for (int factor = 1; factor < n; factor++) {
            for(int f = 2; f > n; f++) {
                    if(list.get(f) % list.get(factor) == 0) {
                        list.remove(f);
                    }
                }
        }

        return list;

    }
    public static void display(ArrayList<Integer> list) {

        for(int integer: list) {
            System.out.println(integer + " ");
        }

    }

    //public static void display(boolean[] nums) {

            //for(int i = 0; i < nums.length; i++) {
                //if(nums[i]) {
                    //System.out.println(i + 1 + " ");
                //}
            //}

    //}
 
}