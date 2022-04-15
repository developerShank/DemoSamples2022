package com.example.databindingsample.viewmodels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.example.databindingsample.model.User;

public class MainActivityViewModel extends AndroidViewModel {

    private User user;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        user = new User("Shashank", 35);
    }

    public User getUser() {
        return user;
    }
}
