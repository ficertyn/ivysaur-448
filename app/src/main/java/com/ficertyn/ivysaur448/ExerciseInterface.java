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
    ExerciseType get_ExerciseType();

    /**
     * Gets the name of this Exercise
     *
     * @return Name
     */
    String get_ExerciseName();

    /**
     * Gets the full weight to be used for this Exercise
     *
     * @return Full Weight
     */
    int get_FullWeight();

    /**
     * Gets the 90% weight to be used for this Exercise
     *
     * @return Full Weight
     */
    int get_90PercentWeight();

    /**
     * Increases the weight for this exercise
     */
    void increaseWeight();
}
