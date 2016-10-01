/*
 * Copyright (c) 2016. Daniel Millen
 */

package com.ficertyn.ivysaur448;

/**
 * Created by ficertyn on 8/23/16.
 *
 * Interface for the various Exercise Types
 */
interface ExerciseInterface
{
    /**
     * Gets the ExerciseType of this Exercise
     *
     * @return ExerciseType
     */
    ExerciseType getExerciseType();

    /**
     * Gets the name of this Exercise
     *
     * @return Name
     */
    String getExerciseName();

    /**
     * Gets the full weight to be used for this Exercise
     *
     * @return Full Weight
     */
    int getFullWeight();

    /**
     * Gets the 90% weight to be used for this Exercise
     *
     * @return Full Weight
     */
    int get90PercentWeight();

    /**
     * Increases the weight for this exercise
     */
    void increaseWeight();
}
