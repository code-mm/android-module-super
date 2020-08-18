package com.ms.module.supers.inter.module;


import com.ms.module.supers.inter.supper.ISupper;

public interface Module extends ISupper {

    ISupper get();

    String name();

}
