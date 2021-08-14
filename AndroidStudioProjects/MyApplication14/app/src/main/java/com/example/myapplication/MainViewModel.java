package com.example.myapplication;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    private int mCount = 0;
    public MutableLiveData<Integer> count = new MutableLiveData<>();
    public  void plus(){
        mCount++;
        count.setValue(mCount);
    }
    public  void minus(){
        mCount--;
        count.setValue(mCount );
    }

}
