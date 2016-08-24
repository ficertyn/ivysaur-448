package com.ficertyn.ivysaur448;

/**
 * Created by ficertyn on 8/4/16.
 *
 * General static helper methods
 */
public class Helpers
{
    /**
     * Gets the 90% weight
     *
     * @param weight The current 100% weight
     * @return The 90% weight
     */
    public static int get_90PercentWeight(int weight)
    {
        double ninetyPercent = weight * .9;

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
