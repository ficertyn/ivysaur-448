/*
 * Copyright (c) 2016. Daniel Millen
 */

package com.ficertyn.ivysaur448;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelpersUnitTests
{
    @Test
    public void testGet90PercentWeight50() throws Exception
    {
        assertEquals(45, Helpers.get_90PercentWeight(50));
    }

    @Test
    public void testGet90PercentWeight75() throws Exception
    {
        assertEquals(70, Helpers.get_90PercentWeight(75));
    }

    @Test
    public void testGet90PercentWeight70() throws Exception
    {
        assertEquals(65, Helpers.get_90PercentWeight(70));
    }
}
