package org.ms.module.base.module;


import org.ms.module.base.inter.IModel;
import org.ms.module.base.inter.IPresenter;
import org.ms.module.base.inter.IView;

public abstract class BaseModel<P extends IPresenter> implements IModel, IView {

    protected P presenter;

    public BaseModel(P presenter) {
        this.presenter = presenter;
    }

    @Override
    public void showToast(String text) {
        presenter.showToast(text);
    }

    @Override
    public void showDialog() {
        presenter.showDialog();
    }

    @Override
    public void hideDialog() {
        presenter.hideDialog();
    }
}
