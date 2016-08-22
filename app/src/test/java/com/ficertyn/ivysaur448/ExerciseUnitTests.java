<<<<<<< fd90eda6d6e211d60bfbe7d0356482d399f43d09
package com.ficertyn.ivysaur448;

/**
 * Created by ficertyn on 8/21/16.
 */
public class ExerciseUnitTests {
=======
/*
 * Copyright (c) 2016. Daniel Millen
 */

package com.ficertyn.ivysaur448;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExerciseUnitTests {
    @Test
    public void testGetWeight50() throws Exception
    {
        Exercise exercise = new Exercise("Testing", 50);

        assertEquals(50, exercise.get_Weight());
    }

    @Test
    public void testGetWeightOver50() throws Exception
    {
        Exercise exercise = new Exercise("Testing", 90);

        assertEquals(90, exercise.get_Weight());
    }

    @Test
    public void testGetWeightUnder50() throws Exception
    {
        Exercise exercise = new Exercise("Testing", 10);

        assertEquals(50, exercise.get_Weight());
    }

    @Test
    public void testGet90PercentWeight50() throws Exception
    {
        Exercise exercise = new Exercise("Testing", 50);

        assertEquals(45, exercise.get_90PercentWeight());
    }

    @Test
    public void testGet90PercentWeight90() throws Exception
    {
        Exercise exercise = new Exercise("Testing", 90);

        assertEquals(80, exercise.get_90PercentWeight());
    }

    @Test
    public void testGet90PercentWeight70() throws Exception
    {
        Exercise exercise = new Exercise("Testing", 70);

        assertEquals(65, exercise.get_90PercentWeight());
    }

    @Test
    public void testGetExerciseName() throws Exception
    {
        Exercise exercise = new Exercise("MyExercise", 50);

        assertEquals("MyExercise", exercise.get_ExerciseName());
    }

    @Test(expected=IllegalArgumentException.class)
    public void testGetExerciseNameEmptyString() throws Exception
    {
        Exercise exercise = new Exercise("", 50);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testGetExerciseNameNull() throws Exception
    {
        Exercise exercise = new Exercise(null, 50);
    }
>>>>>>> Creating project and adding Exercice class and Unit Tests
}
