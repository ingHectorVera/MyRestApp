package com.example.hectorvera.myrestapp.Util;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.Volley;

/**
 * Created by User on 10/10/2016.
 */

public class VolleySingleton {
    private static VolleySingleton volleySingleton;
    private RequestQueue volleyQueue;
    private ImageLoader volleyImageLoader;
    private static Context mContext;

    private VolleySingleton(Context mContext){
        this.mContext = mContext;
        volleyQueue = getRequestQueue();
        volleyImageLoader = new ImageLoader(volleyQueue, new ImageLoader.ImageCache() {
            private final LruCache<String, Bitmap> cache = new LruCache<String, Bitmap>(20);
            @Override
            public Bitmap getBitmap(String url) {
                return cache.get(url);
            }

            @Override
            public void putBitmap(String url, Bitmap bitmap) {
                cache.put(url, bitmap);
            }
        });
    }

    private RequestQueue getRequestQueue() {
        if(volleyQueue == null){
            volleyQueue = Volley.newRequestQueue(mContext.getApplicationContext());
        }
        return volleyQueue;
    }

    public static synchronized VolleySingleton getInstance(Context context){
        if(volleySingleton == null){
            volleySingleton = new VolleySingleton(context);
        }
        return volleySingleton;
    }

    public <T> void addToRequestQueue(Request <T> req){
        getRequestQueue().add(req);
    }

    public ImageLoader getImageLoader(){
        return  volleyImageLoader;
    }
}
