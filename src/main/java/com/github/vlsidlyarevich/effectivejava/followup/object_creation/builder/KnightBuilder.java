package com.github.vlsidlyarevich.effectivejava.followup.object_creation.builder;

public class KnightBuilder {
    private String name;
    private String surname;
    private String title;
    private Boolean isMounted;
    private String horseName;

    public KnightBuilder setName(final String name) {
        this.name = name;
        return this;
    }

    public KnightBuilder setSurname(final String surname) {
        this.surname = surname;
        return this;
    }

    public KnightBuilder setTitle(final String title) {
        this.title = title;
        return this;
    }

    public KnightBuilder setIsMounted(final Boolean isMounted) {
        this.isMounted = isMounted;
        return this;
    }

    public KnightBuilder setHorseName(final String horseName) {
        this.horseName = horseName;
        return this;
    }

    public Knight createKnight() {
        return new Knight(name, surname, title, isMounted, horseName);
    }
}