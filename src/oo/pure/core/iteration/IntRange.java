package oo.pure.core.iteration;

import oo.pure.core.number.Int;
import oo.pure.core.number.IntValue;

import java.util.Iterator;
import java.util.function.Function;
import java.util.stream.IntStream;

public final class IntRange implements Iterable<IntValue>
{
    private final IntValue _firstValue;
    private final IntValue _lastValue;
    private final Function<Integer, IntValue> _toIntValue;

    public IntRange(final IntValue firstValue, final IntValue lastValue)
    {
        this(firstValue, lastValue, x -> new Int(x));
    }

    public IntRange(final IntValue firstValue, final IntValue lastValue, final Function<Integer, IntValue> toIntValue)
    {
        _firstValue = firstValue;
        _lastValue = lastValue;
        _toIntValue = toIntValue;
    }

    @Override
    public Iterator<IntValue> iterator()
    {
        return IntStream.rangeClosed(_firstValue.intValue(), _lastValue.intValue())
                .mapToObj(x -> _toIntValue.apply(x)).iterator();
    }
}
