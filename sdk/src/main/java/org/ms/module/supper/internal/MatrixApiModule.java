package org.ms.module.supper.internal;

import org.ms.module.supper.inter.matrix.IMatrixApi;
import org.ms.module.supper.inter.module.ModuleAdapter;

public class MatrixApiModule extends ModuleAdapter {

    private static final String CLASSPATH = "org.ms.module.matrix.sdk.impl.MatrixApiImpl";

    private IMatrixApi iMatrixApi;
    @Override
    public IMatrixApi get() {
        if (iMatrixApi == null) {
            Object o = loaderClass(CLASSPATH);
            if (o != null) {
                if (o instanceof IMatrixApi) {
                    iMatrixApi = (IMatrixApi) o;

                    if (iMatrixApi != null) {
                        return iMatrixApi;
                    } else {

                    }
                }
            }
        }
        return iMatrixApi;
    }

    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}