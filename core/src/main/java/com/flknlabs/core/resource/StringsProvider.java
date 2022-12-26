package com.flknlabs.core.resource;

import android.app.Application;

import androidx.annotation.StringRes;

public class StringsProvider {

    private Application application;

    public StringsProvider(Application application) {
        this.application = application;
    }

    public String getCustomString(@StringRes Integer id) {
        return application.getString(id);
    }
}
