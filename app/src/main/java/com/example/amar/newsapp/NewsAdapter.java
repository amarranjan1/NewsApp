package com.example.amar.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter<News> {

    /**
     * Constructs a new {@link NewsAdapter}.
     *
     * @param context of the app
     * @param news    is the list of news, which is the data source of the adapter
     */
    public NewsAdapter(Context context, ArrayList<News> news) {
        super(context, 0, news);
    }

    /**
     * Returns a list item view that displays information about the news at the given position
     * in the list of news.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_item, parent, false);
        }

        // Find the news at the given position in the list of news
        News currentNews = getItem(position);

        // Find the TextView with view ID title_text_view
        TextView newsTitleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);
        String title = currentNews.getmTitle();
        newsTitleTextView.setText(title);

        // Find the TextView with view ID category_text_view
        TextView newsCategoryTextView = (TextView) listItemView.findViewById(R.id.category_text_view);
        String category = currentNews.getmCategory();
        newsCategoryTextView.setText(category);

        // Find the TextView with view ID date_text_view
        TextView newsDatetextView = (TextView) listItemView.findViewById(R.id.date_text_view);
        String date = currentNews.getmDate();
        newsDatetextView.setText(date);

        // Find the TextView with view ID author_text_view
        TextView newsAuthortextView = (TextView) listItemView.findViewById(R.id.author_text_view);
        String author = currentNews.getmAuthor();
        newsAuthortextView.setText(author);

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }
}
