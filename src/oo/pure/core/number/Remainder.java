package oo.pure.core.number;

import oo.pure.core.text.Media;

public final class Remainder implements IntValue
{
    private final IntValue _dividend;
    private final IntValue _divisor;

    public Remainder(final Integer value, final Integer divisor)
    {
        this(new Int(value), new Int(divisor));
    }

    public Remainder(final Integer value, final IntValue divisor)
    {
        this(new Int(value), divisor);
    }

    public Remainder(final IntValue value, final Integer divisor)
    {
        this(value, new Int(divisor));
    }

    public Remainder(final IntValue dividend, final IntValue divisor)
    {
        _dividend = dividend;
        _divisor = divisor;
    }

    @Override
    public Integer intValue()
    {
        return _dividend.intValue() % _divisor.intValue();
    }

    @Override
    public void print(final Media media)
    {
        media.print(() -> intValue().toString());
    }
}
