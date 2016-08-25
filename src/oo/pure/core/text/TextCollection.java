package oo.pure.core.text;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.stream.Collectors;

public final class TextCollection implements Media, Iterable<Text>
{
    private final Collection<Text> _collection;

    public TextCollection()
    {
        this(new ArrayList<>());
    }

    public TextCollection(final Collection<Text> collection)
    {
        _collection = collection;
    }

    @Override
    public void print(final Text text)
    {
        _collection.add(text);
    }

    @Override
    public Iterator<Text> iterator()
    {
        return texts().iterator();
    }

    public Collection<Text> texts()
    {
        return Collections.unmodifiableCollection(_collection);
    }

    public Collection<String> strings()
    {
        return Collections.unmodifiableCollection(_collection.stream().map(x -> x.text()).collect(Collectors.toList()));
    }
}
