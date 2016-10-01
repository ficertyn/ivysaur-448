/*
 * Copyright (c) 2016. Daniel Millen
 */

package com.ficertyn.ivysaur448;

/**
 * Created by ficertyn on 8/23/16.
 *
 * Class representing exercises where no specific weight should be used. Typically body-weight
 * exercise, such as Chinups.
 */
public class UnweightedExercise extends Exercise
{
    /**
     * Constructor for the UnweightedExercise class
     *
     * @param type The ExerciseType for this exercise
     * @param name The name of this exercise
     */
    public UnweightedExercise(ExerciseType type, String name)
    {
        if (name == null || name.isEmpty())
        {
            throw new IllegalArgumentException("Name may not be null");
        }

        _type = type;
        _name = name;
        _fullWeight = -1;
    }

    @Override
    public void increaseWeight()
    {
        // Nothing to increase for Unweighted Exercises
        return;
    }

    @Override
    public int get90PercentWeight()
    {
        return _fullWeight;
    }
}
