/*
 * Copyright (c) 2016. Daniel Millen
 */

package com.ficertyn.ivysaur448;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeightCalculatorUnitTests {
    @Test
    public void testGetWeight50() throws Exception
    {
        WeightCalculator weightCalculator = new WeightCalculator(50);

        assertEquals(50, weightCalculator.get_Weight());
    }

    @Test
    public void testGetWeightOver50() throws Exception
    {
        WeightCalculator weightCalculator = new WeightCalculator(90);

        assertEquals(90, weightCalculator.get_Weight());
    }

    @Test
    public void testGetWeightUnder50() throws Exception
    {
        WeightCalculator weightCalculator = new WeightCalculator(10);

        assertEquals(50, weightCalculator.get_Weight());
    }

    @Test
    public void testGet90PercentWeight50() throws Exception
    {
        WeightCalculator weightCalculator = new WeightCalculator(50);

        assertEquals(45, weightCalculator.get_90PercentWeight());
    }

    @Test
    public void testGet90PercentWeight75() throws Exception
    {
        WeightCalculator weightCalculator = new WeightCalculator(75);

        assertEquals(70, weightCalculator.get_90PercentWeight());
    }

    @Test
    public void testGet90PercentWeight70() throws Exception
    {
        WeightCalculator weightCalculator = new WeightCalculator(70);

        assertEquals(65, weightCalculator.get_90PercentWeight());
    }
}
