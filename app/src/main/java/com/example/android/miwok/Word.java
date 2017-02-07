package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains resource IDs for the default translation, Miwok translation, audio file, and
 * optional image file for that word.
 */
public class Word {

    /** String resource ID for the default translation of the word */
    private int mDetailId;

    /** String resource ID for the Miwok translation of the word */
    private int mNameId;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Word object.
     *
     * @param detailId is the string resource ID for the word in a language that the
     *                             user is already familiar with (such as English)
     * @param nameId is the string resource Id for the word in the Miwok language
     */
    public Word(int detailId, int nameId) {
        mDetailId = detailId;
        mNameId = nameId;
    }

    /**
     * Create a new Word object.
     *
     * @param detailId is the string resource ID for the word in a language that the
     *                             user is already familiar with (such as English)
     * @param nameId is the string resource Id for the word in the Miwok language
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     */
    public Word(int detailId, int nameId, int imageResourceId) {
        mDetailId = detailId;
        mNameId = nameId;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the string resource ID for the detail of the place.
     */
    public int getmDetailId() {
        return mDetailId;
    }

    /**
     * Get the string resource ID for the name of the place.
     */
    public int getmNameId() {
        return mNameId;
    }

    /**
     * Return the image resource ID of the place.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this place.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}