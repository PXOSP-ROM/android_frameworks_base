package com.pxosp.android.systemui;

import android.content.Context;

import com.pxosp.android.systemui.dagger.PxospGlobalRootComponent;
import com.pxosp.android.systemui.dagger.DaggerPxospGlobalRootComponent;

import com.android.systemui.SystemUIFactory;
import com.android.systemui.dagger.GlobalRootComponent;

public class PxospSystemUIFactory extends SystemUIFactory {
    @Override
    protected GlobalRootComponent buildGlobalRootComponent(Context context) {
        return DaggerPxospGlobalRootComponent.builder()
                .context(context)
                .build();
    }
}
