package oo.pure.core.text;

public interface Text
{
    String text();

    final class Simple implements Text
    {
        private final String _text;

        public Simple(final String text)
        {
            _text = text;
        }

        @Override
        public String text()
        {
            return text();
        }
    }
}
