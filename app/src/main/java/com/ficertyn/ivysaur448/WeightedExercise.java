/*
 * Copyright (c) 2016. Daniel Millen
 */

package com.ficertyn.ivysaur448;

/**
 * Created by ficertyn on 8/23/16.
 *
 * Class representing exercises where a specific weight should be used
 */
public class WeightedExercise extends Exercise
{
    private int _increaseAmount;

    /**
     * Constructor for the WeightedExercise class
     *
     * @param type The ExerciseType for this exercise
     * @param name The name of this exercise
     * @param fullWeight The full weight to use for this exercise
     * @param increaseAmount The amount to increase this exercise weight by
     */
    public WeightedExercise(ExerciseType type, String name, int fullWeight, int increaseAmount)
    {
        if (name == null || name.isEmpty())
        {
            throw new IllegalArgumentException("Name may not be null");
        }

        if (increaseAmount < 5)
        {
            throw new IllegalArgumentException("IncreaseAmount must be greater than 5");
        }

        _type = type;
        _name = name;
        _fullWeight = fullWeight >= 50 ? fullWeight : 50;
        _increaseAmount = increaseAmount;
    }

    @Override
    public void increaseWeight()
    {
        _fullWeight += _increaseAmount;
    }

    @Override
    public int get_90PercentWeight()
    {
        return Helpers.get_90PercentWeight(_fullWeight);
    }
}
