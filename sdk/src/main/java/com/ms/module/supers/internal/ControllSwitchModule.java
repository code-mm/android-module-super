package com.ms.module.supers.internal;

import com.ms.module.supers.inter.controll.IControlSwitch;
import com.ms.module.supers.inter.controll.IControllSwitchAdapter;
import com.ms.module.supers.inter.module.ModuleAdapter;

public class ControllSwitchModule extends ModuleAdapter {


    private static final String CLASSPATH = "com.ms.module.impl.controllswitch.ControllSwitchImpl";

    IControlSwitch controlSwitch;

    @Override
    public IControlSwitch get() {
        if (controlSwitch == null) {
            Object o = loaderClass(CLASSPATH);
            if (o != null) {
                if (o instanceof IControlSwitch) {
                    controlSwitch = (IControlSwitch) o;
                    if (controlSwitch != null) {
                        return controlSwitch;
                    } else {
                        controlSwitch = new IControllSwitchAdapter();
                        return controlSwitch;
                    }
                }
            } else {
                controlSwitch = new IControllSwitchAdapter();
                return controlSwitch;
            }
        }
        return controlSwitch;
    }


    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}
