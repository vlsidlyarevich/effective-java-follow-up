package com.github.vlsidlyarevich.effectivejava.followup.object_creation.sfm;

/**
 * Terminator
 *
 * @author Vladislav Sidlyarevich <vlsidlyarevich@gmail.com>
 * Created on 10/28/21.
 */
public class Terminator {

    private final String name;
    private final String model;
    private final Boolean isLiquid;

    private Terminator(final String name, final String model, final Boolean isLiquid) {
        this.name = name;
        this.model = model;
        this.isLiquid = isLiquid;
    }

    public static Terminator t800(final String name,
                                  final String model) {
        return new Terminator(name, model, false);
    }

    public static Terminator t1000(final String name,
                                   final String model) {
        return new Terminator(name, model, true);
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public Boolean isLiquid() {
        return isLiquid;
    }
}
