package com.github.vlsidlyarevich.effectivejava.followup.object_methods.comparable;

import java.util.Comparator;

/**
 * Panzer
 *
 * @author Vladislav Sidlyarevich <vlsidlyarevich@gmail.com>
 * Created on 11/17/21.
 */
public class Panzer implements Comparable<Panzer> {

    private static final Comparator<Panzer> COMPARATOR =
            Comparator.comparing(Panzer::getModel)
                    .thenComparingInt(Panzer::getCrew)
                    .thenComparingDouble(Panzer::getCannon);

    String model;
    Integer crew;
    Double cannon;

    public Panzer(final String model, final Integer crew, final Double cannon) {
        this.model = model;
        this.crew = crew;
        this.cannon = cannon;
    }

    public String getModel() {
        return model;
    }

    public Integer getCrew() {
        return crew;
    }

    public Double getCannon() {
        return cannon;
    }

    @Override
    public boolean equals(final Object obj) {
        // Performance improvement
        if (obj == this) return true;
        // Null check, object type check
        if (!(obj instanceof Panzer)) return false;
        Panzer compareWith = (Panzer) obj;

        // Compare fields one by one
        if (!this.model.equals(compareWith.model)) return false;
        if (!this.crew.equals(compareWith.crew)) return false;
        return this.cannon.equals(compareWith.cannon);
    }

    @Override
    public int compareTo(final Panzer o) {
        return COMPARATOR.compare(this, o);
    }
}
