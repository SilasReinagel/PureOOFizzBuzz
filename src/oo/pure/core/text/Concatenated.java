package oo.pure.core.text;

public final class Concatenated implements Text
{
    private final Text _first;
    private final Text _second;

    public Concatenated(final String first, final String second)
    {
        this(() -> first, () -> second);
    }

    public Concatenated(final String first, final Text second)
    {
        this(() -> first, second);
    }

    public Concatenated(final Text first, final String second)
    {
        this(first, () -> second);
    }

    public Concatenated(final Text first, final Text second)
    {
        _first = first;
        _second = second;
    }

    @Override
    public String text()
    {
        return _first.text().concat(_second.text());
    }
}
