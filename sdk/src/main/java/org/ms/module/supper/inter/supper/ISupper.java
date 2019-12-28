package org.ms.module.supper.inter.supper;

public interface ISupper {


    default void warning(String text) {

        System.out.println(text);

    }


}