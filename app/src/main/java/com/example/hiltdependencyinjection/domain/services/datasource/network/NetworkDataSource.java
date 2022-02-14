package com.example.hiltdependencyinjection.domain.services.datasource.network;

import com.example.hiltdependencyinjection.domain.services.datasource.IDataSource;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NetworkDataSource implements IDataSource {
    @Override
    public List<Integer> getNumbers() {
        return Arrays.asList(1,2,3,4,5,6,7,8);
    }
}
