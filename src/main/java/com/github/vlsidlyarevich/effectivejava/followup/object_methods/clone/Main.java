package com.github.vlsidlyarevich.effectivejava.followup.object_methods.clone;

import java.util.List;

/**
 * Main
 *
 * @author Vladislav Sidlyarevich <vlsidlyarevich@gmail.com>
 * Created on 11/27/21.
 */
public class Main {

    public static void main(String[] args) {
        Panzer pz4 = new Panzer("PzKpfw IV", 4, 0.75);
        Panzer pz4Late = new Panzer("PzKpfw IV Ausf D.", 4, 0.75);

        PanzerCompany company = new PanzerCompany("503", List.of(pz4, pz4Late));
        PanzerCompany cloned = company.clone();

        System.out.println("Original: " + company);
        System.out.println("Copy: " + cloned);
    }
}
