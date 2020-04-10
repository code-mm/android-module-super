package org.ms.module.base.inter;


import org.ms.module.supper.inter.supper.ISupper;

public interface IPresenter extends ISupper {


    void showToast(String text);

    void showDialog();

    void hideDialog();


}
