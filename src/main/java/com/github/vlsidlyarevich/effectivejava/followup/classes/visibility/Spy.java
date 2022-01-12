package com.github.vlsidlyarevich.effectivejava.followup.classes.visibility;

import java.util.List;

/**
 * Spy
 *
 * @author Vladislav Sidlyarevich <vlsidlyarevich@gmail.com>
 * Created on 1/12/22.
 */
public class Spy {

    private static final List<String> SKILLS = List.of("kill", "eat", "sleep");

    public static final String PUBLIC_JOB = "doctor";
    public static final List<String> PUBLIC_SKILLS = List.copyOf(SKILLS);

    private final String name;
    private final int age;

    public Spy(final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
