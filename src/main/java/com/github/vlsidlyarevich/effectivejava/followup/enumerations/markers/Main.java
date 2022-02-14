package com.github.vlsidlyarevich.effectivejava.followup.enumerations.markers;

import java.time.Month;
import java.util.EnumSet;

/**
 * Main
 *
 * @author Vladislav Sidlyarevich <vlsidlyarevich@gmail.com>
 * Created on 2/10/22.
 */
public class Main {

    public static void main(String[] args) {
        var winter = EnumSet.of(Month.DECEMBER, Month.JANUARY, Month.FEBRUARY);
        System.out.println(winter);
    }
}
