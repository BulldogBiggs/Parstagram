package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("9M8yGjCCsRQ0VESEEmL3MX8oHr9o0YVINVVYFPnJ")
                .clientKey("heGtFET7YcYndMLf6K9VKeIOwXGSD80Cc2TP6Yy1")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
