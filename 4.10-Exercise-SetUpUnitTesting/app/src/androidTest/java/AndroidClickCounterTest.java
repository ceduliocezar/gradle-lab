import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.example.android.clickcounter.ClickActivity;
import com.example.android.clickcounter.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by TECBMCCS on 30/09/16.
 */

@RunWith(AndroidJUnit4.class)
public class AndroidClickCounterTest {

    @Rule
    public ActivityTestRule<ClickActivity> menuActivityTestRule = new ActivityTestRule<>(ClickActivity
            .class);

    @Test
    public void test_increment_text() throws Exception {

        onView(withId(R.id.click_button)).perform(click());

        onView(withId(R.id.click_count_text_view)).check(matches(withText("1")));
    }
}

