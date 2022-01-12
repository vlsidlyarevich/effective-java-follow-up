package com.github.vlsidlyarevich.effectivejava.followup.classes.immutability;

import java.util.ArrayList;
import java.util.List;

/**
 * ImmutableCat
 *
 * @author Vladislav Sidlyarevich <vlsidlyarevich@gmail.com>
 * Created on 1/12/22.
 */
public class ImmutableCat {

    private final String name;
    private final boolean isLazy;
    private final int age;
    private final List<String> skills;

    private ImmutableCat(final String name,
                         final boolean isLazy,
                         final int age,
                         final List<String> skills) {
        this.name = name;
        this.isLazy = isLazy;
        this.age = age;
        this.skills = skills;
    }

    public static ImmutableCat createCat(final String name,
                                         final boolean isLazy,
                                         final int age,
                                         final List<String> skills) {
        return new ImmutableCat(name, isLazy, age, new ArrayList<>(skills));
    }

    public String getName() {
        return name;
    }

    public boolean isLazy() {
        return isLazy;
    }

    public int getAge() {
        return age;
    }

    public List<String> getSkills() {
        return new ArrayList<>(skills);
    }
}
