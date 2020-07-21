package org.ms.module.supper.internal;

import org.ms.module.supper.inter.controll.IControlSwitch;
import org.ms.module.supper.inter.controll.IControllSwitchAdapter;
import org.ms.module.supper.inter.module.ModuleAdapter;
import org.ms.module.supper.inter.supper.ISupper;

public class ControllSwitchModule extends ModuleAdapter {


    private static final String CLASSPATH = "org.ms.module.impl.controllswitch.ControllSwitchImpl";

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
