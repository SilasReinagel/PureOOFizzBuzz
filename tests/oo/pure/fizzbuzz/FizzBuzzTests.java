package oo.pure.fizzbuzz;

import oo.pure.core.text.TextCollection;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;

public class FizzBuzzTests
{
    private TextCollection _collection;

    @Before
    public void init()
    {
        _collection = new TextCollection();
    }

    @Test
    public void FizzBuzz_Zero_NoElements()
    {
        new FizzBuzz(0).print(_collection);

        assertMatches(new ArrayList<>(), _collection.strings());
    }

    @Test
    public void FizzBuzz_One_IsCorrect()
    {
        new FizzBuzz(1).print(_collection);

        assertMatches(Collections.singletonList("1"), _collection.strings());
    }

    @Test
    public void FizzBuzz_Three_IsCorrect()
    {
        new FizzBuzz(3).print(_collection);

        assertMatches(Arrays.asList("1", "2", "fizz"), _collection.strings());
    }

    @Test
    public void FizzBuzz_Five_IsCorrect()
    {
        new FizzBuzz(5).print(_collection);

        assertMatches(Arrays.asList("1", "2", "fizz", "4", "buzz"), _collection.strings());
    }

    @Test
    public void FizzBuzz_Fifteen_IsCorrect()
    {
        new FizzBuzz(11, 15).print(_collection);

        assertMatches(Arrays.asList("11", "fizz", "13", "14", "fizzbuzz"), _collection.strings());
    }

    @Test
    public void FizzBuzz_Fifty_IsCorrect()
    {
        new FizzBuzz(50).print(_collection);

        assertMatches(Arrays.asList("1", "2", "fizz", "4", "buzz", "fizz", "7", "8", "fizz", "buzz",
            "11", "fizz", "13", "14", "fizzbuzz", "16", "17", "fizz", "19", "buzz",
            "fizz", "22", "23", "fizz", "buzz", "26", "fizz", "28", "29", "fizzbuzz",
            "31", "32", "fizz", "34", "buzz", "fizz", "37", "38", "fizz", "buzz",
            "41", "fizz", "43", "44", "fizzbuzz", "46", "47", "fizz", "49", "buzz"), _collection.strings());
    }

    @SuppressWarnings("unchecked")
    public static void assertMatches(final Collection expected, final Collection actual)
    {
        if (expected.size() != actual.size())
            throw new RuntimeException("Expected size: " + expected.size() + ", Actual size: " + actual.size());
        AtomicInteger i = new AtomicInteger(0);
        expected.forEach(x ->
        {
            i.incrementAndGet();
            if (!actual.contains(x))
                throw new RuntimeException("Missing expected element #" + i.toString() + ": '" + x.toString() + "'");
        });
    }
}
