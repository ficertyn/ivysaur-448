/*
 * Copyright (c) 2016. Daniel Millen
 */

package com.ficertyn.ivysaur448;

/**
 * Created by ficertyn on 8/23/16.
 *
 * Abstract class for Exercise objects
 */
public abstract class Exercise implements ExerciseInterface
{
    protected ExerciseType _type;
    protected String _name;
    protected int _fullWeight;

    @Override
    public ExerciseType getExerciseType()
    {
        return _type;
    }

    @Override
    public String getExerciseName()
    {
        return _name;
    }

    @Override
    public int getFullWeight()
    {
        return _fullWeight;
    }
}
