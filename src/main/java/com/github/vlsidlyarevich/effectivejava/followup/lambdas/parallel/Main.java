package com.github.vlsidlyarevich.effectivejava.followup.lambdas.parallel;

import java.util.stream.LongStream;

/**
 * Main
 *
 * @author Vladislav Sidlyarevich <vlsidlyarevich@gmail.com>
 * Created on 1/31/22.
 */
public class Main {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        long sum = LongStream.range(0, 1000000000)
                .reduce(0L, Long::sum);
        long duration = System.currentTimeMillis() - start;

        System.out.println("Result: " + sum + ", duration: " + duration);

        // Faster on large numbers, slower on small numbers
        long parallelStart = System.currentTimeMillis();
        long parallelSum = LongStream.range(0, 1000000000)
                .parallel()
                .reduce(0L, Long::sum);
        long parallelDuration = System.currentTimeMillis() - parallelStart;

        System.out.println("Result (p): " + parallelSum + ", duration (p): " + parallelDuration);
    }


}
