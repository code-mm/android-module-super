package org.ms.module.supper.internal;

import org.ms.module.supper.inter.matrix.IMatrix;
import org.ms.module.supper.inter.module.ModuleAdapter;
import org.ms.module.supper.inter.supper.ISupper;

public class MatrixModule  extends ModuleAdapter {
    private static final String CLASSPATH = "org.ms.module.impl.matrix.MatrixImpl";
    IMatrix iMatrix;

    @Override
    public IMatrix get() {
        if (iMatrix == null) {
            Object o = loaderClass(CLASSPATH);
            if (o != null) {
                if (o instanceof IMatrix) {
                    iMatrix = (IMatrix) o;

                    if (iMatrix != null) {
                        return iMatrix;
                    } else {

                    }
                }
            }
        }
        return iMatrix;
    }

    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}