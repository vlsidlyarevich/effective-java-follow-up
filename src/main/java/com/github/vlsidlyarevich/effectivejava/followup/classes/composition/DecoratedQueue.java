package com.github.vlsidlyarevich.effectivejava.followup.classes.composition;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

/**
 * DecoratedQueue
 *
 * @author Vladislav Sidlyarevich <vlsidlyarevich@gmail.com>
 * Created on 1/17/22.
 */
public class DecoratedQueue<E> implements Queue<E> {

    private final Queue<E> delegate;

    public DecoratedQueue(final Queue<E> delegate) {
        this.delegate = delegate;
    }

    @Override
    public int size() {
        return delegate.size();
    }

    @Override
    public boolean isEmpty() {
        return delegate.isEmpty();
    }

    @Override
    public boolean contains(final Object o) {
        return delegate.contains(o);
    }

    @Override
    public Iterator<E> iterator() {
        return delegate.iterator();
    }

    @Override
    public Object[] toArray() {
        return delegate.toArray();
    }

    @Override
    public <T> T[] toArray(final T[] a) {
        return delegate.toArray(a);
    }

    @Override
    public boolean add(final E e) {
        return delegate.add(e);
    }

    @Override
    public boolean remove(final Object o) {
        return delegate.remove(o);
    }

    @Override
    public boolean containsAll(final Collection<?> c) {
        return delegate.containsAll(c);
    }

    @Override
    public boolean addAll(final Collection<? extends E> c) {
        return delegate.addAll(c);
    }

    @Override
    public boolean removeAll(final Collection<?> c) {
        return delegate.removeAll(c);
    }

    @Override
    public boolean retainAll(final Collection<?> c) {
        return delegate.retainAll(c);
    }

    @Override
    public void clear() {
        delegate.clear();
    }

    @Override
    public boolean offer(final E e) {
        return delegate.offer(e);
    }

    @Override
    public E remove() {
        return delegate.remove();
    }

    @Override
    public E poll() {
        return delegate.poll();
    }

    @Override
    public E element() {
        return delegate.element();
    }

    @Override
    public E peek() {
        return delegate.peek();
    }
}
