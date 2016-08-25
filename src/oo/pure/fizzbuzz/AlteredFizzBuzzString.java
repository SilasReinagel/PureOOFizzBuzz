package oo.pure.fizzbuzz;

import oo.pure.core.text.Text;

import java.util.function.Function;

public final class AlteredFizzBuzzString extends AlteredFizzBuzzValue
{
    public AlteredFizzBuzzString(final FizzBuzzValue baseValue, final Function<Text, Text> stringTransform)
    {
        super(baseValue, x -> new FizzBuzzValue.Raw(x, stringTransform.apply(x)));
    }
}
