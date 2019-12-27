package org.ms.module.supper.inter.module;


import org.ms.module.supper.inter.supper.ISupper;

public class ModuleAdapter implements Module {
    @Override
    public String name() {
        return null;
    }

    @Override
    public ISupper get() {
        return null;
    }

    protected Object loaderClass(String classpath) {

        Class<?> aClass = null;
        try {
            aClass = Class.forName(classpath);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Object o = null;
        try {
            o = aClass.newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return o;
    }


}
