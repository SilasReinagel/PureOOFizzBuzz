package oo.pure.core.number;

import oo.pure.core.text.Media;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

public final class Int implements IntValue
{
    private final Supplier<Integer> _value;

    public Int(final AtomicInteger atomicInteger)
    {
        this(() -> atomicInteger.intValue());
    }

    public Int(final Integer value)
    {
        this(() -> value);
    }

    public Int(final Supplier<Integer> supplier)
    {
        _value = supplier;
    }

    @Override
    public Integer intValue()
    {
        return _value.get();
    }

    @Override
    public void print(final Media media)
    {
        media.print(() -> intValue().toString());
    }
}
