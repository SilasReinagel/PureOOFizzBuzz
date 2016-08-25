package oo.pure.fizzbuzz;

import oo.pure.core.number.IntValue;
import oo.pure.core.number.Int;
import oo.pure.core.iteration.Mapped;
import oo.pure.core.iteration.IntRange;
import oo.pure.core.text.Expression;
import oo.pure.core.text.Media;

public final class FizzBuzz implements Expression
{
    private final Mapped<IntValue, FizzBuzzValue> _mapped;

    public FizzBuzz(final Integer numElements)
    {
        this(new IntRange(new Int(1), new Int(numElements)));
    }

    public FizzBuzz(final Integer firstValue, final Integer lastValue)
    {
        this(new IntRange(new Int(firstValue), new Int(lastValue)));
    }

    public FizzBuzz(final IntRange range)
    {
        this(new Mapped<>(range, x -> new Fizz(new Buzz(new FizzBuzzValue.Raw(x)))));
    }

    private FizzBuzz(final Mapped<IntValue, FizzBuzzValue> fizzBuzzFunction)
    {
        _mapped = fizzBuzzFunction;
    }

    @Override
    public void print(final Media media)
    {
        _mapped.forEach(x -> x.print(media));
    }
}
