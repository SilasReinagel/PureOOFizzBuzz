package oo.pure.fizzbuzz;

import oo.pure.core.text.Concatenated;
import oo.pure.core.function.Conditional;
import oo.pure.core.number.Remainder;
import oo.pure.core.text.WithoutNumbers;

public final class Fizz extends AlteredFizzBuzzValue
{
    public Fizz(final FizzBuzzValue value)
    {
        super(value, new Conditional<>(
                        x -> new Remainder(x, 3).equals(0),
                        x -> new AlteredFizzBuzzString(x, y -> new WithoutNumbers(new Concatenated("fizz", y))),
                        x -> x));
    }
}
