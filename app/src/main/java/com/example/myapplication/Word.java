package com.example.myapplication;

public class Word {
    private String mSanskrit;
    private String mEnglish;
    private int mResourceId=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED=-1;

    /**
     *
     * @param sanskrit is the sanskrit word
     * @param english is the english word
     */
    public Word(String sanskrit,String english)
{
    mSanskrit = sanskrit;
    mEnglish = english;

}

    /**
     *
     * @param mSanskrit is the sanskrit translation of the word
     * @param mEnglish is the default translation of the word
     * @param mResourceId is the id of the image
     */
    public Word(String mSanskrit , String mEnglish,int mResourceId)
{
    this.mSanskrit = mSanskrit;
    this.mEnglish = mEnglish;
    this.mResourceId = mResourceId;
}

    /**
     * TO get the sanskrit translation of the word
      * @return String type sanskrit translation
     */
    public String getmSanskrit()
    {
        return mSanskrit;
    }

    /**
     * TO get English translation of the word
     *
     * @return String Type English translation
     */
    public String getmEnglish() {
        return mEnglish;
    }
    /**
     * TO get the resource id of the image
     *
     * @return int type resource id
     */

    public int getmResourceId() {
        return mResourceId;
    }

    /**
     * It tells wheteher or not the activity has an image
     * @return boolean type true if it has image otherwise false
     */
    public boolean hasImage()
    {return mResourceId!=NO_IMAGE_PROVIDED;}
}
