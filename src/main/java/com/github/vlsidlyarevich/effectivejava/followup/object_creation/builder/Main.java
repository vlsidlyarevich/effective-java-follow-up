package com.github.vlsidlyarevich.effectivejava.followup.object_creation.builder;

/**
 * Main
 *
 * @author Vladislav Sidlyarevich <vlsidlyarevich@gmail.com>
 * Created on 10/28/21.
 */
public class Main {

    public static void main(String[] args) {
        Knight sirRichard = new KnightBuilder()
                .setName("Richard")
                .setSurname("LionHeart")
                .setTitle("The king")
                .setIsMounted(true)
                .setHorseName("Marie")
                .createKnight();
    }
}
