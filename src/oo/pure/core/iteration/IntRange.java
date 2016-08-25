package oo.pure.core.iteration;

import oo.pure.core.number.Int;
import oo.pure.core.number.IntValue;

import java.util.Iterator;
import java.util.stream.IntStream;

public final class IntRange implements Iterable<IntValue>
{
    private final IntValue _firstValue;
    private final IntValue _lastValue;

    public IntRange(final IntValue firstValue, IntValue lastValue)
    {
        _firstValue = firstValue;
        _lastValue = lastValue;
    }

    @Override
    public Iterator<IntValue> iterator()
    {
        return IntStream.rangeClosed(_firstValue.intValue(), _lastValue.intValue()).mapToObj(x -> (IntValue)new Int(x)).iterator();
    }
}
