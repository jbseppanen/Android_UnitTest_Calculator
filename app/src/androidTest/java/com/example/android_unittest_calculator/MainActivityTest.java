package com.example.android_unittest_calculator;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.rule.ActivityTestRule;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class, false, true);

    @Before
    public void setUp() {
    }

    @Test
    public void shouldAdd1toUI() {
        //setup

        //execute
        onView(withId(R.id.button_1)).perform(click());
        //check

        onView(withId(R.id.text_display)).check(matches(withText("1")));
    }

}