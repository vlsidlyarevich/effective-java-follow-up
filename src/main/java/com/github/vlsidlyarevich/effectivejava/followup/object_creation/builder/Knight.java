package com.github.vlsidlyarevich.effectivejava.followup.object_creation.builder;

/**
 * DieHard
 *
 * @author Vladislav Sidlyarevich <vlsidlyarevich@gmail.com>
 * Created on 10/28/21.
 */
public class Knight {

    private String name;
    private String surname;
    private String title;
    private Boolean isMounted;
    private String horseName;

    public Knight(final String name,
                  final String surname,
                  final String title,
                  final Boolean isMounted,
                  final String horseName) {
        this.name = name;
        this.surname = surname;
        this.title = title;
        this.isMounted = isMounted;
        this.horseName = horseName;
    }
}
