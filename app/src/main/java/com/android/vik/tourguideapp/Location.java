package com.android.vik.tourguideapp;

/**
 * Created by Vik on 7/3/2016.
 */
public class Location {

    private String mLocationName;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Location(String locationName) {
        mLocationName = locationName;
    }

    public Location(String locationName, int imageResourceId) {
        mLocationName = locationName;
        mImageResourceId = imageResourceId;
    }

    public String getLocationName() {
        return mLocationName;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
