package oo.pure.core.function;

import java.util.function.Function;

public final class Transformed<T> implements Function<T,T>
{
    private final Function<T, T> _transform;

    public Transformed(final Function<T, T> transform)
    {
        _transform = transform;
    }

    @Override
    public T apply(T obj)
    {
        return _transform.apply(obj);
    }
}
