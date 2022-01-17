package com.github.vlsidlyarevich.effectivejava.followup.classes.composition;

import java.util.Queue;

/**
 * MeowableQueue
 *
 * @author Vladislav Sidlyarevich <vlsidlyarevich@gmail.com>
 * Created on 1/17/22.
 */
public class MeowableQueue<E> extends DecoratedQueue<E> {

    public MeowableQueue(final Queue<E> delegate) {
        super(delegate);
    }

    @Override
    public boolean add(final E e) {
        System.out.println("MEOW!");
        return add(e);
    }
}
