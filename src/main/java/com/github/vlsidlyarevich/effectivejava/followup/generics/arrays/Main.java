package com.github.vlsidlyarevich.effectivejava.followup.generics.arrays;

/**
 * Main
 *
 * @author Vladislav Sidlyarevich <vlsidlyarevich@gmail.com>
 * Created on 1/31/22.
 */
public class Main {

    public static void main(String[] args) {
        Object[] arr = new String[1];

        // java.lang.ArrayStoreException
        arr[0] = 0L;

        // Can't compile
//        List<Object> list = new ArrayList<String>();
    }
}
