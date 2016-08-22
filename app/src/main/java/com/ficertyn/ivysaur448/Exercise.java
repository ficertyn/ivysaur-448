package com.ficertyn.ivysaur448;

/**
 * Created by Daniel Millen on 8/4/16.
 */
public class Exercise
{
    private int _weight;
    private String _exerciseName;

    /**
     * Constructor fo the Exercise class
     *
     * @param exerciseName The name of the exercise that this instance is managing
     * @param currentWeight The current weight being used for this exercise
     * @throws IllegalArgumentException
     */
    public Exercise(String exerciseName, int currentWeight) throws IllegalArgumentException
    {
        if (exerciseName == null || exerciseName.isEmpty())
        {
            throw new IllegalArgumentException("exerciseName can not be empty");
        }

        _exerciseName = exerciseName;
        _weight = currentWeight >= 50 ? currentWeight : 50;
    }

    /**
     * Gets the current weight of this exercise
     *
     * @return The weight of this exercise
     */
    public int get_Weight() {
        return _weight;
    }

    /**
     * Gets the 90% weight of this exercise
     *
     * @return The 90% weight of this exercise
     */
    public int get_90PercentWeight()
    {
        double ninetyPercent = (double)_weight * .9;

        double remainder = ninetyPercent % 5;
        if (remainder >= 2.5)
        {
            double change = 5 - remainder;
            ninetyPercent += change;
        }
        else if (remainder < 2.5)
        {
            ninetyPercent -= remainder;
        }

        return (int)ninetyPercent;
    }

    /**
     * Gets the name of this exercise
     *
     * @return The name of this exercise
     */
    public String get_ExerciseName()
    {
        return _exerciseName;
    }
}
