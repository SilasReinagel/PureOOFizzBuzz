package oo.pure.core.function;

import java.util.function.Function;
import java.util.function.Predicate;

public final class Conditional<T, R> implements Function<T, R>
{
    private final Predicate<T> _predicate;
    private final Function<T, R> _trueValue;
    private final Function<T, R> _falseValue;

    public Conditional(final Predicate<T> predicate, final Function<T, R> trueValue, final Function<T, R> falseValue)
    {
        _predicate = predicate;
        _trueValue = trueValue;
        _falseValue = falseValue;
    }

    @Override
    public R apply(final T obj)
    {
        return _predicate.test(obj) ? _trueValue.apply(obj) : _falseValue.apply(obj);
    }
}
