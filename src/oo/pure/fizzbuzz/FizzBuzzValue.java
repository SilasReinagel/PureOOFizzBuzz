package oo.pure.fizzbuzz;

import oo.pure.core.number.IntValue;
import oo.pure.core.text.Media;
import oo.pure.core.text.Text;

public interface FizzBuzzValue extends IntValue, Text
{
    final class Raw implements FizzBuzzValue
    {
        private final IntValue _Whole_numberValue;
        private final Text _stringValue;

        public Raw(final IntValue wholeNumberValue)
        {
            this(wholeNumberValue, () -> wholeNumberValue.intValue().toString());
        }

        public Raw(final IntValue wholeNumberValue, final Text stringValue)
        {
            _Whole_numberValue = wholeNumberValue;
            _stringValue = stringValue;
        }

        @Override
        public Integer intValue()
        {
            return _Whole_numberValue.intValue();
        }

        @Override
        public String text()
        {
            return _stringValue.text();
        }

        @Override
        public void print(final Media media)
        {
            media.print(_stringValue);
        }
    }
}
