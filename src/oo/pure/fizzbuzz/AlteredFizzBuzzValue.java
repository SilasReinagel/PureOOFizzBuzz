package oo.pure.fizzbuzz;

import oo.pure.core.function.Transformed;
import oo.pure.core.text.Media;

import java.util.function.Function;

public abstract class AlteredFizzBuzzValue implements FizzBuzzValue
{
    private final Transformed<FizzBuzzValue> _transformation;
    private final FizzBuzzValue _value;

    public AlteredFizzBuzzValue(final FizzBuzzValue value, final Function<FizzBuzzValue, FizzBuzzValue> transformation)
    {
        this(value, new Transformed<>(transformation));
    }

    private AlteredFizzBuzzValue(final FizzBuzzValue value, final Transformed<FizzBuzzValue> transformation)
    {
        _value = value;
        _transformation = transformation;
    }

    @Override
    public final Integer intValue()
    {
        return transform().intValue();
    }

    @Override
    public final String text()
    {
        return transform().text();
    }

    @Override
    public final void print(final Media media)
    {
        transform().print(media);
    }

    private FizzBuzzValue transform()
    {
        return _transformation.apply(_value);
    }
}
