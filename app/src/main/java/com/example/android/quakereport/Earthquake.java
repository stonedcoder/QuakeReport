package com.example.android.quakereport;

/**
 * Created by vraun on 23-01-2017.
 */

public class Earthquake {

    // Number of earthquake rating
    private Double mMagnitude;

    // name of the city .
    private String mPlace;

    //Time of happening.
    private long mTime ;

    /*Create a new quake oobject .
    *@param
    * @param
    * @param
     */

    public Earthquake(Double magnitude , String City , long Time){

        mMagnitude = magnitude ;
        mPlace = City ;
        mTime = Time;
    }

    /**
     * Get the rating of the earthquake
     */
    public Double getMagnitude() {
        return mMagnitude;
    }

    /**
     * Get the name of the city
     */
    public String getCity() {
        return mPlace;
    }

    /**
     * Get the date
     */
    public long getTime() {return mTime;}


}
