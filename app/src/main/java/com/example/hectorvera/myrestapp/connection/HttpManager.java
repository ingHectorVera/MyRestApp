package com.example.hectorvera.myrestapp.connection;

import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by User on 10/10/2016.
 */

public class HttpManager {

    public static BufferedReader reader = null;
    public static OutputStream os = null;
    public static final String DEBUG = "DEBUG";
    public static final int POST = 0;
    public static final int GET = 1;
    public static final int PUT = 2;
    public static final int PATCH = 3;
    public static final int DELETE = 4;

    public static String getData(String uri, int requestType){
        try {
            URL url;
            HttpURLConnection conn;
            StringBuilder sb = new StringBuilder();

            switch (requestType){
                case POST:
                    url = new URL("https://jsonplaceholder.typicode.com/users");
                    conn = ((HttpURLConnection) url.openConnection());
                    conn.setRequestProperty("Content-Type", "application/json");

                    break;
                case GET:
                    break;
                case PUT:
                    break;
                case PATCH:
                    break;
                case DELETE:
                    break;
                default:
                    break;
            }

        }catch (Exception e){
            Log.d(DEBUG, e.getMessage());
        }finally {

        }
        return null;
    }
}
