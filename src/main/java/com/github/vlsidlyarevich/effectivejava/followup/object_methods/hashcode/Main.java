package com.github.vlsidlyarevich.effectivejava.followup.object_methods.hashcode;

/**
 * Main
 *
 * @author Vladislav Sidlyarevich <vlsidlyarevich@gmail.com>
 * Created on 11/18/21.
 */
public class Main {

    public static void main(String[] args) {
        Panzer pz4 = new Panzer("PzKpfw IV", 4, 0.75);
        Panzer pz4Late = new Panzer("PzKpfw IV", 4, 0.75);

        System.out.println(pz4.hashCode());
        System.out.println(pz4Late.hashCode());
    }
}
