package com.github.vlsidlyarevich.effectivejava.followup.object_methods.equals;

/**
 * Main
 *
 * @author Vladislav Sidlyarevich <vlsidlyarevich@gmail.com>
 * Created on 11/17/21.
 */
public class Main {

    public static void main(String[] args) {
        Panzer pz4 = new Panzer("PzKpfw IV", 4, 0.75);
        Panzer pz4Late = new Panzer("PzKpfw IV Ausf D.", 4, 0.75);

        assert pz4.equals(pz4Late);
    }
}
