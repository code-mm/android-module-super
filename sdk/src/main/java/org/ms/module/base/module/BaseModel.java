package org.ms.module.base.module;


import org.ms.module.base.inter.IModel;
import org.ms.module.base.inter.IPresenter;

public abstract class BaseModel<P extends IPresenter> implements IModel {

    protected P presenter;

    public BaseModel(P presenter) {
        this.presenter = presenter;
    }

}
