package com.github.vlsidlyarevich.effectivejava.followup.object_methods.clone;

import java.util.List;
import java.util.stream.Collectors;

public class PanzerCompany implements Cloneable {

    private String name;
    private List<Panzer> panzers;

    public PanzerCompany(final String name, final List<Panzer> panzers) {
        this.name = name;
        this.panzers = panzers;
    }

    public String getName() {
        return name;
    }

    public List<Panzer> getPanzers() {
        return panzers;
    }

    @Override
    public PanzerCompany clone() {
        try {
            var result = (PanzerCompany) super.clone();
            result.panzers = panzers.stream()
                    .map(Panzer::clone)
                    .collect(Collectors.toList());
            return result;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("This can't happen");
        }
    }

    @Override
    public String toString() {
        return "PanzerCompany{" +
                "name='" + name + '\'' +
                ", panzers=" + panzers +
                '}';
    }
}
