package com.jackleeentertainment.jackclock.object.util;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.jackleeentertainment.jackclock.object.AlarmOwner;
import com.jackleeentertainment.jackclock.object.AlarmOwnerMe;

import java.util.Iterator;
import java.util.Map;

/**
 * Created by Jacklee on 2016. 9. 11..
 */
public class AlarmOwnerMeUtil {


    public static AlarmOwnerMe getAlarmOwnerMeFromAlarmOwner(AlarmOwner alarmOwner){

        AlarmOwnerMe alarmOwnerMe = new AlarmOwnerMe();

        String TAG = "comparePOJO_getHashMapDelta";

        Map<String, Object> mapObjSrc = ObjectUtil
                .getHashMapFromPOJOWithGson(alarmOwner);

        Map<String, Object> mapObjTgt = ObjectUtil
                .getHashMapFromPOJOWithGson(alarmOwnerMe);


        Iterator itSrc = mapObjSrc.entrySet().iterator();

        while (itSrc.hasNext()) {

            Map.Entry<String, Object> mapSrcItem = (Map.Entry) itSrc.next();

            Iterator itTgt = mapObjTgt.entrySet().iterator();

            while (itTgt.hasNext()){

                Map.Entry<String, Object> mapTgtItem = (Map.Entry) itTgt.next();

                if (mapTgtItem.getKey().toString().equals(mapSrcItem.getKey().toString())){
                    mapObjTgt.put(mapSrcItem.getKey().toString(), mapSrcItem.getValue());
                }

            }

        }

        if (mapObjTgt.size() > 0) {
            Gson gson = new Gson();
            JsonElement jsonElement = gson.toJsonTree(mapObjTgt);
            AlarmOwnerMe pojo = gson.fromJson(jsonElement, AlarmOwnerMe.class);
            return pojo;
        } else {
            return null;
        }


    }


}
