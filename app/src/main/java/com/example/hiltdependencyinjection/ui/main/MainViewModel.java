package com.example.hiltdependencyinjection.ui.main;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;

import com.example.hiltdependencyinjection.domain.services.datasource.IDataSource;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class MainViewModel extends ViewModel {
    private IMainViewable viewable;
    private IDataSource dataSource;

    @Inject
    public MainViewModel(SavedStateHandle handle,IDataSource _dataSource){
        this.dataSource = _dataSource;
    }

    public void setViewable(IMainViewable _viewable){
        this.viewable = _viewable;
    }

    public void onMainViewStart(){
        //get content somehow
        this.viewable.displayMainContent(dataSource.getNumbers());
    }
}