package com.github.vlsidlyarevich.effectivejava.followup.generics.varargs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Main
 *
 * @author Vladislav Sidlyarevich <vlsidlyarevich@gmail.com>
 * Created on 1/31/22.
 */
public class Main {

    public static void main(String[] args) {
        var result = removeLastCopy("First", "Last");
        System.out.println(result);
    }

    @SafeVarargs
    static <T> List<T> removeLastCopy(T... input) {
        List<T> result = new ArrayList<>();
        Collections.addAll(result, input);
        result.remove(result.size() - 1);
        return result;
    }
}
