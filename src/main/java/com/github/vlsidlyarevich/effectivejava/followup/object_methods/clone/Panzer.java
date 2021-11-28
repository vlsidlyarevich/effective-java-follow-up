package com.github.vlsidlyarevich.effectivejava.followup.object_methods.clone;

/**
 * Panzer
 *
 * @author Vladislav Sidlyarevich <vlsidlyarevich@gmail.com>
 * Created on 11/27/21.
 */
public class Panzer implements Cloneable {

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
    public Panzer clone() {
        try {
            return (Panzer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("This can't happen");
        }
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
    public int hashCode() {
        // initialize result with first property hash
        int result = model.hashCode();
        // apply following expression with each property
        result = 31 * result + crew.hashCode();
        result = 31 * result + cannon.hashCode();
        return result;
    }
}
