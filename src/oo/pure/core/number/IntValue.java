package oo.pure.core.number;

import oo.pure.core.text.Expression;

public interface IntValue extends Expression
{
    Integer intValue();

    default boolean equals(final Integer other)
    {
        return this.intValue().equals(other);
    }

    default boolean equals(final IntValue other)
    {
        return this.intValue().equals(other.intValue());
    }

    default boolean greaterThan(final Integer other) { return this.intValue() > other; }

    default boolean greaterThan(final IntValue other) { return this.intValue() > other.intValue(); }

    default boolean lessThan(final Integer other) { return this.intValue() < other; }

    default boolean lessThan(final IntValue other) { return this.intValue() < other.intValue(); }
}
