package oo.pure.core.iteration;

import java.util.Iterator;
import java.util.function.Function;

public final class Mapped<T, R> implements Iterable<R>
{
    private final Iterator<R> _iterator;

    public Mapped(final Iterable<T> iterable, final Function<T, R> mapping)
    {
        this(new MappingIterator<>(iterable.iterator(), mapping));
    }

    public Mapped(final Iterator<T> iterator, final Function<T, R> mapping)
    {
        this(new MappingIterator<>(iterator, mapping));
    }

    private Mapped(final Iterator<R> iterator)
    {
        _iterator = iterator;
    }

    @Override
    public Iterator<R> iterator()
    {
        return _iterator;
    }

    private final static class MappingIterator<T, R> implements Iterator<R>
    {
        private final Iterator<T> _base;
        private final Function<T, R> _mapping;

        public MappingIterator(final Iterator<T> baseIterator, final Function<T, R> mapping)
        {
            _base = baseIterator;
            _mapping = mapping;
        }

        public boolean hasNext()
        {
            return _base.hasNext();
        }

        public R next()
        {
            return _mapping.apply(_base.next());
        }

        public void remove()
        {
            throw new UnsupportedOperationException();
        }
    }
}
