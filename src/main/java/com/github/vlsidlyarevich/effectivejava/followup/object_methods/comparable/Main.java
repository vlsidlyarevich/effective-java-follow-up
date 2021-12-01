package com.github.vlsidlyarevich.effectivejava.followup.object_methods.comparable;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

/**
 * Main
 *
 * @author Vladislav Sidlyarevich <vlsidlyarevich@gmail.com>
 * Created on 11/18/21.
 */
public class Main {

    public static void main(String[] args) {
        BigDecimal one = new BigDecimal("1.0");
        BigDecimal two = new BigDecimal("1.00");

        var set = new HashSet<>(List.of(one, two));
        // Two elements
        System.out.println(set);

        // One element o_O
        var wat = new TreeSet<>(List.of(one, two));
        System.out.println(wat);

        Panzer pz4 = new Panzer("PzKpfw IV", 4, 0.75);
        Panzer pz4Late = new Panzer("PzKpfw IV", 5, 0.75);

        System.out.println(pz4.compareTo(pz4Late));
    }
}
