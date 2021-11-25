package com.github.vlsidlyarevich.effectivejava.followup.object_methods.to_string;

/**
 * Main
 *
 * @author Vladislav Sidlyarevich <vlsidlyarevich@gmail.com>
 * Created on 11/18/21.
 */
public class Main {

    public static void main(String[] args) {
        var panzer = new Panzer("PzKpfw IV", 4, 0.75);
        var informativePanzer = new InformativePanzer("PzKpfw IV", 4, 0.75);

        System.out.println(panzer);
        // Feel the difference! =D
        System.out.println(informativePanzer);
    }
}
