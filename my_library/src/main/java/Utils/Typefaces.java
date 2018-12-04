package Utils;

import android.content.Context;
import android.graphics.Typeface;

import java.util.Hashtable;

public class Typefaces {
    public static final Hashtable<String, Typeface> cache = new Hashtable<String, Typeface>();

    public static Typeface get(Context c, String name){
        synchronized(cache){
            if(!cache.containsKey(name)){
                Typeface t = Typeface.createFromAsset(c.getAssets(), name);
                cache.put(name, t);
            }

            return cache.get(name);
        }
    }

    /**
     * clear all the typefaces saved in cache
     */
    public static void clear() {
        cache.clear();
    }
}
