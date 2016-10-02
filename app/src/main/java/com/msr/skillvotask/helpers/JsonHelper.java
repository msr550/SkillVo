package com.msr.skillvotask.helpers;

import com.google.gson.Gson;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;

/**
 * Created by Sandeep Maram on 28-09-2016.
 */
public class JsonHelper {
    /**
     * Used convert Json object to required java object
     *
     * @param jsonObject JsonObject which you want to parse
     * @param modelClass model class in which format you want to parse
     * @param <T>        Required Class Type as result
     * @return returns Object of input class type with binding json data
     */
    public static <T extends Object> T parseJson(Object jsonObject, Class<T> modelClass) {
        Gson gson = new Gson();
        Reader reader = null;
        try {
            reader = getInputStream(jsonObject.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (reader == null) {
            return null;
        }
        try {
            return gson.fromJson(reader, modelClass);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * to convert jsonobject to inputstream
     *
     * @param response json object of service
     * @return returns the input stream through reader
     */
    private static Reader getInputStream(String response) {
        InputStream result = null;
        try {
            result = new ByteArrayInputStream(response.toString().getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        Reader reader = null;
        if (result != null) {
            reader = new InputStreamReader(result);
        }
        return reader;
    }
}
