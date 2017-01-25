package com.example.android.quakereport;

/**
 * Created by vraun on 23-01-2017.
 */

public class Earthquake {

    // Number of earthquake rating
    private String mMagnitude;

    // name of the city .
    private String mPlace;

    //Date of happening .
    private String mDate ;

    /*Create a new quake oobject .
    *@param
    * @param
    * @param
     */

    public Earthquake(String Rating , String City , String Date){

        mMagnitude = Rating ;
        mPlace = City ;
        mDate = Date;
    }

    /**
     * Get the rating of the earthquake
     */
    public String getRating() {
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
    public String getDate() {return mDate;}


}
