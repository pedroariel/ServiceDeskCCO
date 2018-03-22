package br.usjt.deswebmob.servicedeskcco.model;

import android.content.Context;
import android.graphics.drawable.Drawable;

import java.lang.reflect.Field;

/**
 * Created by arqdsis on 22/03/2018.
 */

public class Util {
    public static Drawable getDrawableDinamic(Context contexto, String nomeImagem){
        Class<?> c = R.drawable.class;
        try {
            Field inField = c.getDeclaredField(nomeImage);
            int id = idField.getInt(idField);
            return contexto.getResources().getDrawable(id, theme: null);
        }catch (NoSuchFieldException e){
                e.printStackTrace();
        }catch (IllegalAccessException e){
            e.printStackTrace();
        }
        return null;
    }
}
