package oo.pure.core.text;

public final class WithoutNumbers implements Text
{
    private final Text _text;

    public WithoutNumbers(final String value)
    {
        this(() -> value);
    }

    public WithoutNumbers(final Text string)
    {
        _text = string;
    }

    @Override
    public String text()
    {
        return _text.text().replaceAll("[0-9]","");
    }
}
