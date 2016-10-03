import com.example.android.clickcounter.ClickCounter;

import org.junit.Test;

/**
 * Created by TECBMCCS on 30/09/16.
 */

public class ClickCounterTest {


    @Test
    public void test_initialValue() {
        ClickCounter counter = new ClickCounter();

        assert (counter.getCount() == 0);
    }

    @Test
    public void test_increment() {
        ClickCounter counter = new ClickCounter();

        counter.increment();
        assert (counter.getCount() == 1);
    }
}
