package com.github.vlsidlyarevich.effectivejava.followup.enumerations.enummap;

import java.time.Month;

/**
 * Kitten
 *
 * @author Vladislav Sidlyarevich <vlsidlyarevich@gmail.com>
 * Created on 2/10/22.
 */
public class Kitten {

    private final String name;
    private final Month birthdayMonth;

    public Kitten(final String name,
                  final Month birthdayMonth) {
        this.name = name;
        this.birthdayMonth = birthdayMonth;
    }

    public Month getBirthdayMonth() {
        return birthdayMonth;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Kitten{" +
                "name='" + name + '\'' +
                ", birthdayMonth=" + birthdayMonth +
                '}';
    }
}
