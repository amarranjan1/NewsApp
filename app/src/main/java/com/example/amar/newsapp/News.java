package com.example.amar.newsapp;

public class News {

    /**
     * Title of the news
     */
    private String mTitle;

    /**
     * Category of the news
     */
    private String mCategory;

    /**
     * Date of the news
     */
    private String mDate;

    /**
     * Website URL of the news
     */
    private String mUrl;

    /**
     * Author of the news
     */
    private String mAuthor;

    /**
     * Constructs a new {@link News} object.
     *
     * @param mTitle    is the heading of the news
     * @param mCategory is the category of the news
     * @param mDate     is the time date of news
     * @param mUrl      is the website URL to find news
     */
    public News(String mTitle, String mCategory, String mDate, String mUrl, String mAuthor) {
        this.mTitle = mTitle;
        this.mCategory = mCategory;
        this.mDate = mDate;
        this.mUrl = mUrl;
        this.mAuthor = mAuthor;
    }

    /**
     * Returns the title of the news.
     */
    public String getmTitle() {
        return mTitle;
    }

    /**
     * Returns the category of the news.
     */
    public String getmCategory() {
        return mCategory;
    }

    /**
     * Returns the Date of the news.
     */
    public String getmDate() {
        return mDate;
    }

    /**
     * Returns the website URL to find news.
     */
    public String getmUrl() {
        return mUrl;
    }

    /**
     * Returns the author of the news.
     */
    public String getmAuthor() {
        return mAuthor;
    }
}
