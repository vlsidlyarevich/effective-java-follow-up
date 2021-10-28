package com.github.vlsidlyarevich.effectivejava.followup.object_creation.sfm;

import static com.github.vlsidlyarevich.effectivejava.followup.object_creation.sfm.Terminator.t1000;
import static com.github.vlsidlyarevich.effectivejava.followup.object_creation.sfm.Terminator.t800;
import static com.github.vlsidlyarevich.effectivejava.followup.object_creation.sfm.TerminatorResponse.fromDomain;

/**
 * Main
 *
 * @author Vladislav Sidlyarevich <vlsidlyarevich@gmail.com>
 * Created on 10/28/21.
 */
public class Main {

    public static void main(String[] args) {
        Terminator arnold = t800("Arnold", "T800");
        Terminator enemy = t1000("Enemy", "T1000");

        TerminatorResponse response = fromDomain(arnold);
    }
}
