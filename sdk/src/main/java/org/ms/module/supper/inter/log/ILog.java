package org.ms.module.supper.inter.log;



import org.ms.module.supper.inter.supper.ISupper;

public interface ILog extends ISupper {


    void i(String tag, String log);

    void d(String tag, String log);

    void e(String tag, String log);

    void xml(String tag, String log);

    void json(String tag, String log);

}
