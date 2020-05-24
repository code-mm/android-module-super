package org.ms.module.supper.internal;

import org.ms.module.supper.inter.matrix.IMatrixApi;
import org.ms.module.supper.inter.module.ModuleAdapter;

public class MatrixApiModule extends ModuleAdapter {

    private static final String CLASSPATH = "org.ms.module.impl.matrix.sdk.MatrixApiImpl";

    private IMatrixApi matrixApi;
    @Override
    public IMatrixApi get() {
        if (matrixApi == null) {
            Object o = loaderClass(CLASSPATH);
            if (o != null) {
                if (o instanceof IMatrixApi) {
                    matrixApi = (IMatrixApi) o;

                    if (matrixApi != null) {
                        return matrixApi;
                    } else {

                    }
                }
            }
        }
        return matrixApi;
    }

    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}