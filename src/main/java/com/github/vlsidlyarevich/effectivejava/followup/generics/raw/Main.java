package com.github.vlsidlyarevich.effectivejava.followup.generics.raw;

import java.util.ArrayList;
import java.util.List;

/**
 * Main
 *
 * @author Vladislav Sidlyarevich <vlsidlyarevich@gmail.com>
 * Created on 1/24/22.
 */
public class Main {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        doSmth(names);
        //Now collection is broken
        System.out.println(names.get(0));
    }

    //Incorrect way
    public static void doSmth(List names) {
        names.add(1);
    }

    //Correct way
    public static void doSmthRight(List<String> names) {
        //Will not compile
//        names.add(new ArrayList<>());

        names.add("kitty");
    }

    //Correct way with wildcard
    public static void doSmthRightWildcardVersion(List<?> names) {
        //Will not compile
//        names.add(new ArrayList<>());

        names.add(null);
    }
}
