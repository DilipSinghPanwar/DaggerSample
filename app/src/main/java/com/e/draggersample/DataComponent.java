package com.e.draggersample;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Dilip-MavenCluster on 16-12-2019 17:36.
 */
@Singleton
@Component(modules = {MyDagger.class})
public interface DataComponent {
    void inject(MainActivity activity);
}