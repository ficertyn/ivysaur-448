/*
 * Copyright (c) 2016. Daniel Millen
 */

package com.ficertyn.ivysaur448;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ficertyn on 8/23/16.
 */
public class WeightedExerciseUnitTests
{
    @Test
    public void testConstructor()
    {
        ExerciseType type = ExerciseType.BenchPress;
        String name = "Bench Press";
        int fullWeight = 50;
        int increaseAmount = 10;

        WeightedExercise exercise = new WeightedExercise(type, name, fullWeight, increaseAmount);

        assertEquals(type, exercise.get_ExerciseType());
        assertEquals(name, exercise.get_ExerciseName());
        assertEquals(fullWeight, exercise.get_FullWeight());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNameNull()
    {
        ExerciseType type = ExerciseType.BenchPress;
        String name = null;
        int fullWeight = 50;
        int increaseAmount = 10;

        new WeightedExercise(type, name, fullWeight, increaseAmount);
    }

    @Test
    public void testConstructorFullWeightLessThan50()
    {
        ExerciseType type = ExerciseType.BenchPress;
        String name = "Bench Press";
        int fullWeight = 10;
        int increaseAmount = 10;

        WeightedExercise exercise = new WeightedExercise(type, name, fullWeight, increaseAmount);

        assertEquals(50, exercise.get_FullWeight());
    }

    @Test
    public void testIncreaseAmount()
    {
        ExerciseType type = ExerciseType.BenchPress;
        String name = "Bench Press";
        int fullWeight = 50;
        int increaseAmount = 10;

        WeightedExercise exercise = new WeightedExercise(type, name, fullWeight, increaseAmount);

        exercise.increaseWeight();

        assertEquals(fullWeight + increaseAmount, exercise.get_FullWeight());
    }

    @Test
    public void testGet90PercentWeight()
    {
        ExerciseType type = ExerciseType.BenchPress;
        String name = "Bench Press";
        int fullWeight = 50;
        int increaseAmount = 10;

        WeightedExercise exercise = new WeightedExercise(type, name, fullWeight, increaseAmount);

        assertEquals(45, exercise.get_90PercentWeight());
    }
}
