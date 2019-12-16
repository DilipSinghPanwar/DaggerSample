package com.e.draggersample;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Dilip-MavenCluster on 16-12-2019 17:35.
 */
@Module
public class MyDagger {

    MyDataClass myDataClass;

    @Inject
    public MyDagger(){
    }

    @Provides
    @Singleton
    public MyDataClass MyDaggerFunction(){
        myDataClass = new MyDataClass();
        return myDataClass;
    }
}