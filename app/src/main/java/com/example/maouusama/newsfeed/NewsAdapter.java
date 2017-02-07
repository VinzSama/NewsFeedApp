package com.example.maouusama.newsfeed;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.text.TextUtils;
import android.util.Log;
import android.util.MalformedJsonException;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import models.News;

/**
 * Created by Maouusama on 2/7/2017.
 */

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, List<News> news) {
        super(context, 0 , news);
    }

    /**
     * Returns a list item view that displays information about the earthquake at the given position
     * in the list of earthquakes.
     */

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_news, parent, false);
        }
        News currentNews = getItem(position);
        TextView mTvTitle = (TextView) listItemView.findViewById(R.id.tvTitle);
        TextView mTvDesc = (TextView) listItemView.findViewById(R.id.tvDesc);
        TextView mTvTime = (TextView) listItemView.findViewById(R.id.tvTime);
        mTvTitle.setText(currentNews.getTitle());
        mTvDesc.setText(currentNews.getDescription());
        mTvTime.setText(currentNews.getTime());

        return listItemView;
    }


}


