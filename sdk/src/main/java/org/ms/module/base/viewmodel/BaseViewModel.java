package org.ms.module.base.viewmodel;

import androidx.lifecycle.ViewModel;

import org.ms.module.base.inter.IRepository;
import org.ms.module.base.inter.IViewModel;

public abstract class BaseViewModel<R extends IRepository> extends ViewModel implements IViewModel {

    protected R repository = initRepository();

    protected abstract R initRepository();

}
