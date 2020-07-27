/*
 * Copyright 2018, Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.SimpleCalc;

import android.test.suitebuilder.annotation.SmallTest;
import android.widget.EditText;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static java.lang.Double.POSITIVE_INFINITY;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

/**
 * JUnit4 unit tests for the calculator logic. These are local unit tests; no device needed
 */

@SmallTest
public class CalculatorTest {


    private Calculator mCalculator;


    /**
     * Set up the environment for testing
     */
    @Before
    public void setUp() {
        mCalculator = new Calculator();
    }


    /**
     * A test with positive integer operands.
     */
    @Test
    public void powTwoPositive() {
//        fail("powTwoPositive() hasn't been implemented.");
        mCalculator.pow(5,6);
    }

    /**
     * A test with a negative integer as the first operand.
     */
    @Test
    public void powFirstNegative() {
//        fail("powFirstNegative() hasn't been implemented.");
        mCalculator.pow(-1,2);
    }

    /**
     * A test with a negative integer as the second operand.
     */
    @Test
    public void powSecondNegative() {
//        fail("powSecondNegative() hasn't been implemented.");
        mCalculator.pow(2,-1);
    }

    /**
     * A test with 0 as the first operand and a positive integer as the second operand.
     */
    @Test
    public void powFirstZeroSecondPositive() {
//        fail("powFirstZeroSecondPositive() hasn't been implemented.");
        mCalculator.pow(0,5);
    }

    /**
     * A test with 0 as the second operand.
     */
    @Test
    public void powSecondZero() {
//        fail("powSecondZero() hasn't been implemented.");
        mCalculator.pow(3,0);
    }

    /**
     * A test with 0 as the first operand and -1 as the second operand. (Hint: consult the documentation for Double.POSITIVE_INFINITY.)
     */
    @Test
    public void powFirstZeroSecondMinus1() {
//        fail("powFirstZeroSecondMinus1() hasn't been implemented.");
        mCalculator.pow(0,-1);
    }

    /**
     * A test with -0 as the first operand and any negative number as the second operand.
     */
    @Test
    public void powFirstMinusZeroSecondNegative() {
//        fail("powFirstMinusZeroSecondNegative() hasn't been implemented.");
        mCalculator.pow(-0,-5);
    }

}