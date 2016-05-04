package edu.iis.mto.time;

/**
 * Created by piotr on 04.05.2016.
 */
public interface TimeSource {

    /**
     * Return the system time.
     */
    long currentTimeMillis();

}