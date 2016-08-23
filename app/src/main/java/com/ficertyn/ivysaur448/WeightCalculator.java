package com.ficertyn.ivysaur448;

/**
 * Created by Daniel Millen on 8/4/16.
 */
public class WeightCalculator
{
    private int _weight;

    /**
     * Constructor of the WeightCalculator class. Values less than 50 will be increased to 50.
     *
     * @param weight The current 100% weight
     * @throws IllegalArgumentException
     */
    public WeightCalculator(int weight) throws IllegalArgumentException
    {
        _weight = weight >= 50 ? weight : 50;
    }

    /**
     * Gets the current 100% weight
     *
     * @return The 100% weight
     */
    public int get_Weight() {
        return _weight;
    }

    /**
     * Gets the 90% weight
     *
     * @return The 90% weight
     */
    public int get_90PercentWeight()
    {
        double ninetyPercent = _weight * .9;

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
}
