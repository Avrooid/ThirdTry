import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class Lesson4 {

    private static int  a = 0;
    private static List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

    public static void main(String[] args){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    if(a % 2 == 0)
                        System.out.println(a);
                }
            }
        });

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    a++;
                    System.out.println(a);

                }

            }
    });

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Callable<Integer> callable = () -> someFunc();

}

private static int someFunc(){
    IntStream.range(0, 100).forEach(i -> nums.add(nums.get(nums.size() - 1) + 1));

    return nums.stream()
            .mapToInt(Integer ::intValue)
            .sum();
}
}
