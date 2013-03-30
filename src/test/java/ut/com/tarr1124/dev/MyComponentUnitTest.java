package ut.com.tarr1124.dev;

import org.junit.Test;
import com.tarr1124.dev.MyPluginComponent;
import com.tarr1124.dev.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}