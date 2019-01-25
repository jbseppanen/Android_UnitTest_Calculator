package com.example.android_unittest_calculator;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import androidx.test.rule.ActivityTestRule;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class, false, true);

    @Before
    public void setUp() {
    }

    @Test
    public void shouldAdd1toUI() {
        //setup
        onView(withId(R.id.button_clear)).perform(click());

        //execute
        onView(withId(R.id.button_1)).perform(click());

        //check
        onView(withId(R.id.text_display)).check(matches(withText("1")));
    }

    @Test
    public void shouldClearDisplay() {
        //setup

        //execute
        onView(withId(R.id.button_1)).perform(click());
        onView(withId(R.id.button_1)).perform(click());
        onView(withId(R.id.button_clear)).perform(click());

        //check
        onView(withId(R.id.text_display)).check(matches(withText("")));
    }

    @Test
    public void shouldAdd2toUI() {
        //setup
        onView(withId(R.id.button_clear)).perform(click());

        //execute
        onView(withId(R.id.button_2)).perform(click());

        //check
        onView(withId(R.id.text_display)).check(matches(withText("2")));
    }

    @Test
    public void shouldAdd3toUI() {
        //setup
        onView(withId(R.id.button_clear)).perform(click());

        //execute
        onView(withId(R.id.button_3)).perform(click());

        //check
        onView(withId(R.id.text_display)).check(matches(withText("3")));
    }

    @Test
    public void shouldAdd4toUI() {
        //setup
        onView(withId(R.id.button_clear)).perform(click());

        //execute
        onView(withId(R.id.button_4)).perform(click());

        //check
        onView(withId(R.id.text_display)).check(matches(withText("4")));
    }

    @Test
    public void shouldAdd5toUI() {
        //setup
        onView(withId(R.id.button_clear)).perform(click());

        //execute
        onView(withId(R.id.button_5)).perform(click());

        //check
        onView(withId(R.id.text_display)).check(matches(withText("5")));
    }

    @Test
    public void shouldAdd6toUI() {
        //setup
        onView(withId(R.id.button_clear)).perform(click());

        //execute
        onView(withId(R.id.button_6)).perform(click());

        //check
        onView(withId(R.id.text_display)).check(matches(withText("6")));
    }

    @Test
    public void shouldAdd7toUI() {
        //setup
        onView(withId(R.id.button_clear)).perform(click());

        //execute
        onView(withId(R.id.button_7)).perform(click());

        //check
        onView(withId(R.id.text_display)).check(matches(withText("7")));
    }

    @Test
    public void shouldAdd8toUI() {
        //setup
        onView(withId(R.id.button_clear)).perform(click());

        //execute
        onView(withId(R.id.button_8)).perform(click());

        //check
        onView(withId(R.id.text_display)).check(matches(withText("8")));
    }

    @Test
    public void shouldAdd9toUI() {
        //setup
        onView(withId(R.id.button_clear)).perform(click());

        //execute
        onView(withId(R.id.button_9)).perform(click());

        //check
        onView(withId(R.id.text_display)).check(matches(withText("9")));
    }

    @Test
    public void shouldAdd0toUI() {
        //setup
        onView(withId(R.id.button_clear)).perform(click());

        //execute
        onView(withId(R.id.button_0)).perform(click());

        //check
        onView(withId(R.id.text_display)).check(matches(withText("0")));
    }

    @Test
    public void shouldAdd1plus2ToUI() {
        //setup
        onView(withId(R.id.button_clear)).perform(click());

        //execute
        onView(withId(R.id.button_1)).perform(click());
        onView(withId(R.id.button_add)).perform(click());
        onView(withId(R.id.button_2)).perform(click());

        //check
        onView(withId(R.id.text_display)).check(matches(withText("1+2")));
    }

    @Test
    public void shouldAdd1Minus2ToUI() {
        //setup
        onView(withId(R.id.button_clear)).perform(click());

        //execute
        onView(withId(R.id.button_1)).perform(click());
        onView(withId(R.id.button_subtract)).perform(click());
        onView(withId(R.id.button_2)).perform(click());

        //check
        onView(withId(R.id.text_display)).check(matches(withText("1-2")));
    }

    @Test
    public void shouldAdd1Times2ToUI() {
        //setup
        onView(withId(R.id.button_clear)).perform(click());

        //execute
        onView(withId(R.id.button_1)).perform(click());
        onView(withId(R.id.button_multiply)).perform(click());
        onView(withId(R.id.button_2)).perform(click());

        //check
        onView(withId(R.id.text_display)).check(matches(withText("1*2")));
    }

    @Test
    public void shouldAdd1DividedBy2ToUI() {
        //setup
        onView(withId(R.id.button_clear)).perform(click());

        //execute
        onView(withId(R.id.button_1)).perform(click());
        onView(withId(R.id.button_divide)).perform(click());
        onView(withId(R.id.button_2)).perform(click());

        //check
        onView(withId(R.id.text_display)).check(matches(withText("1/2")));
    }

    @Test
    public void shouldAddDecimalToUI() {
        //setup
        onView(withId(R.id.button_clear)).perform(click());

        //execute
        onView(withId(R.id.button_1)).perform(click());
        onView(withId(R.id.button_decimal)).perform(click());
        onView(withId(R.id.button_2)).perform(click());

        //check
        onView(withId(R.id.text_display)).check(matches(withText("1.2")));
    }

    @Test
    public void shouldReturnCorrectResultToUIOnCaclulation() {
        //setup
        onView(withId(R.id.button_clear)).perform(click());

        //execute
        onView(withId(R.id.button_1)).perform(click());
        onView(withId(R.id.button_add)).perform(click());
        onView(withId(R.id.button_2)).perform(click());
        onView(withId(R.id.button_equals)).perform(click());

        //check
        onView(withId(R.id.text_display)).check(matches(withText("3")));
    }

    @Test
    public void shouldReturnErrorMessageIfDividingBy0() {
        //setup
        onView(withId(R.id.button_clear)).perform(click());

        //execute
        onView(withId(R.id.button_5)).perform(click());
        onView(withId(R.id.button_divide)).perform(click());
        onView(withId(R.id.button_0)).perform(click());
        onView(withId(R.id.button_equals)).perform(click());

        //check
        onView(withId(R.id.text_display)).check(matches(withText(Calculator.ERROR_DIVIDE_BY_0)));
    }

    @Test
    public void shouldReturnCorrectCalculationToUIWithMultipleEqualsPress() {
        //setup
        onView(withId(R.id.button_clear)).perform(click());

        //execute
        onView(withId(R.id.button_1)).perform(click());
        onView(withId(R.id.button_add)).perform(click());
        onView(withId(R.id.button_2)).perform(click());
        onView(withId(R.id.button_equals)).perform(click());
        onView(withId(R.id.button_equals)).perform(click());
        onView(withId(R.id.button_equals)).perform(click());

        //check
        onView(withId(R.id.text_display)).check(matches(withText("7")));
    }

    @Test
    public void shouldRemoveLastItemInUI() {
        //setup
        onView(withId(R.id.button_clear)).perform(click());

        //execute
        onView(withId(R.id.button_1)).perform(click());
        onView(withId(R.id.button_add)).perform(click());
        onView(withId(R.id.button_2)).perform(click());
        onView(withId(R.id.button_decimal)).perform(click());
        onView(withId(R.id.button_2)).perform(click());
        onView(withId(R.id.button_backspace)).perform(click());

        //check
        onView(withId(R.id.text_display)).check(matches(withText("1+2.")));
    }

}