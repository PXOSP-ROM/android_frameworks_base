package com.pxosp.android.systemui.dagger;

import android.content.Context;

import com.android.systemui.dagger.GlobalModule;
import com.android.systemui.dagger.GlobalRootComponent;
import com.android.systemui.dagger.WMModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = {
        GlobalModule.class,
        PxospSysUISubcomponentModule.class,
        WMModule.class})
public interface PxospGlobalRootComponent extends GlobalRootComponent {

    @Component.Builder
    interface Builder extends GlobalRootComponent.Builder {
        PxospGlobalRootComponent build();
    }

    @Override
    PxospSysUIComponent.Builder getSysUIComponent();
}
