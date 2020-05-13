package org.ms.module.supper.inter.utils;

public interface IResUtils {

          int getLayoutId( String paramString);
          int getStringId(String paramString);
          int getDrawableId(String paramString) ;
          int getStyleId(String paramString) ;
          int getId(String paramString);
          int getColorId( String paramString);
          int getArrayId( String paramString) ;

          String getString(int id);
}
