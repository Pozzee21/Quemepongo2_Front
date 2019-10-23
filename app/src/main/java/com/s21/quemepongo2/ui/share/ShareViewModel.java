package com.s21.quemepongo2.ui.share;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ShareViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ShareViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("ESta es la pantalla de objetos personales");
    }

    public LiveData<String> getText() {
        return mText;
    }
}