package oo.pure.core.system;

import oo.pure.core.text.Media;
import oo.pure.core.text.Text;

public final class SystemConsole implements Media
{
    @Override
    public void print(Text text)
    {
        System.out.println(text.text());
    }
}
