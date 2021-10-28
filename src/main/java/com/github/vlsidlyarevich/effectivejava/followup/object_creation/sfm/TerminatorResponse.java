package com.github.vlsidlyarevich.effectivejava.followup.object_creation.sfm;

/**
 * TerminatorResponse
 *
 * @author Vladislav Sidlyarevich <vlsidlyarevich@gmail.com>
 * Created on 10/28/21.
 */
public class TerminatorResponse {

    private final String name;
    private final String model;

    public TerminatorResponse(String name,
                              String model) {
        this.name = name;
        this.model = model;
    }

    public static TerminatorResponse fromDomain(Terminator terminator) {
        return new TerminatorResponse(terminator.getName(), terminator.getModel())
    }
}
