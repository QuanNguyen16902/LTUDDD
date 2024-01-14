package com.android3.myapplication.Tuan4;

import android.content.Context;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Tuan4VolleyFn {
    String strJSON = "";

    public void getJsonArrayOfObject(Context context, TextView textView){
        //Tao request
        RequestQueue queue = Volley.newRequestQueue(context);
        //url
        String url = "http://192.168.2.132:8080/api/tutorials";
        JsonArrayRequest request = new JsonArrayRequest(url,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        for(int i = 0; i < response.length(); i++){
                            try {
                                JSONObject person = response.getJSONObject(i);
//                                String id = person.getString("id");
//                                String name = person.getString("name");
//                                String email = person.getString("email");
//
//                                strJSON += "Id: " + id + "\n";
//                                strJSON += "Name: " + name + "\n";
//                                strJSON += "email: " + email + "\n";

                                String title = person.getString("title");
                                String description = person.getString("description");
                                strJSON += "Title: " + title + "\n";
                                strJSON += "Description: " + description + "\n";
                            } catch (JSONException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                textView.setText(error.getMessage());
            }
        });
        queue.add(request);
    }
}
