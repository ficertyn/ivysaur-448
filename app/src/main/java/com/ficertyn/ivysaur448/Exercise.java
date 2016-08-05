package com.ficertyn.ivysaur448;

/**
 * Created by Daniel Millen on 8/4/16.
 */
public class Exercise
{
    private int _weight;
    private int _sets;
    private int _reps;
    private String _name;

    public Exercise(int weight, int sets, int reps, String name)
    {
        if (name == null || name.isEmpty())
        {
            throw new NullPointerException("name");
        }

        _weight = weight;
        _sets = sets;
        _reps = reps;
        _name = name;
    }

    public int get_weight()
    {
        return _weight;
    }

    public int get_sets()
    {
        return _sets;
    }

    public int get_reps()
    {
        return _reps;
    }

    public String get_name()
    {
        return _name;
    }
}
