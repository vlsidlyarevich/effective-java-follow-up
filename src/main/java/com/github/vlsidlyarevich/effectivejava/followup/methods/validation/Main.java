package com.github.vlsidlyarevich.effectivejava.followup.methods.validation;

import java.util.List;
import java.util.Objects;

/**
 * Main
 *
 * @author Vladislav Sidlyarevich <vlsidlyarevich@gmail.com>
 * Created on 10/28/21.
 */
public class Main {

    public static void main(String[] args) {
        modifyAllStrings(List.of(""));
    }

    public static void modifyAllStrings(List<String> col) {
        Objects.requireNonNull(col, "Collection should not be null!");
        col.forEach(Main::modify);
    }

    private static void modify(String str) {
        assert str != null && !str.isEmpty();

        //modification
        System.out.println(str);
    }
}
