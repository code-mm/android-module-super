package com.ms.module.supers.inter.supper;

public interface ISupper {


    default void warning(String text) {

        System.out.println(text);

    }


}