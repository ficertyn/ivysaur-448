/*
 * Copyright (c) 2016. Daniel Millen
 */

package com.ficertyn.ivysaur448;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ficertyn on 8/23/16.
 */
public class UnweightedExerciseUnitTests
{
    @Test
    public void testConstructor()
    {
        ExerciseType type = ExerciseType.Chinup;
        String name = "Chinup";

        UnweightedExercise exercise = new UnweightedExercise(type, name);

        assertEquals(type, exercise.getExerciseType());
        assertEquals(name, exercise.getExerciseName());
        assertEquals(-1, exercise.getFullWeight());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNameNull()
    {
        ExerciseType type = ExerciseType.Chinup;
        String name = null;

        new UnweightedExercise(type, name);
    }

    @Test
    public void testIncreaseAmount()
    {
        ExerciseType type = ExerciseType.Chinup;
        String name = "Chinup";

        UnweightedExercise exercise = new UnweightedExercise(type, name);

        exercise.increaseWeight();

        assertEquals(-1, exercise.getFullWeight());
    }

    @Test
    public void testGet90PercentWeight()
    {
        ExerciseType type = ExerciseType.Chinup;
        String name = "Chinup";

        UnweightedExercise exercise = new UnweightedExercise(type, name);

        assertEquals(-1, exercise.get90PercentWeight());
    }
}
