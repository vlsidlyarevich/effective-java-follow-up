package com.github.vlsidlyarevich.effectivejava.followup.object_methods.to_string;

/**
 * Informative panzer.
 *
 * @author Vladislav Sidlyarevich <vlsidlyarevich@gmail.com>
 * Created on 11/26/21.
 */
public class InformativePanzer {

    String model;
    Integer crew;
    Double cannon;

    public InformativePanzer(final String model, final Integer crew, final Double cannon) {
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
    public int hashCode() {
        // initialize result with first property hash
        int result = model.hashCode();
        // apply following expression with each property
        result = 31 * result + crew.hashCode();
        result = 31 * result + cannon.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "InformativePanzer{" +
                "model='" + model + '\'' +
                ", crew=" + crew +
                ", cannon=" + cannon +
                '}';
    }
}
