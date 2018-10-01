package com.example.amar.newsapp;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

public class NewsLoader extends AsyncTaskLoader<List<News>> {

    /**
     * URL for news data from the guardianapis
     */
    private static String REQUEST_URL =
            "http://content.guardianapis.com/search?show-tags=contributor&api-key=test";

    public NewsLoader(Context context) {
        super(context);
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    /**
     * This is on a background thread.
     */
    @Override
    public List<News> loadInBackground() {
        if (REQUEST_URL == null) {
            return null;
        }

        // Perform the network request, parse the response, and extract a list of news.
        List<News> newsList = QueryUtils.fetchNewsData(REQUEST_URL);
        return newsList;
    }
}