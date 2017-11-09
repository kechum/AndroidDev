package com.tutorials.hackro.androiddev.data.remote.mapper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hackro on 1/10/17.
 */

public abstract class Mapper<T1, T2> {

    public abstract T2 map(T1 value);

    public abstract T1 reverseMap(T2 value);

    public List<T2> map(List<T1> values) {

        List<T2> returnValue = new ArrayList<>(values.size());

        for (T1 value : values) {
            returnValue.add(map(value));
        }

        return returnValue;
    }


    public List<T1> reserverseMap(List<T2> values) {
        List<T1> returnValues = new ArrayList<>(values.size());
        for (T2 value : values) {
            returnValues.add(reverseMap(value));
        }
        return returnValues;
    }
}
