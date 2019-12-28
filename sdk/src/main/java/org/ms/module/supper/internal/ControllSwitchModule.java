package org.ms.module.supper.internal;

import org.ms.module.supper.inter.controll.IControlSwitch;
import org.ms.module.supper.inter.controll.IControllSwitchAdapter;
import org.ms.module.supper.inter.module.ModuleAdapter;
import org.ms.module.supper.inter.supper.ISupper;

public class ControllSwitchModule extends ModuleAdapter {


    private static final String CLASSPATH = "org.ms.module.controllswitch.impl.ControllSwitchImpl";

    IControlSwitch iControlSwitch;

    @Override
    public IControlSwitch get() {
        if (iControlSwitch == null) {
            Object o = loaderClass(CLASSPATH);
            if (o != null) {
                if (o instanceof IControlSwitch) {
                    iControlSwitch = (IControlSwitch) o;

                    if (iControlSwitch != null) {
                        return iControlSwitch;
                    } else {
                        return new IControllSwitchAdapter();
                    }
                }
            }
        }
        return iControlSwitch;
    }


    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}
