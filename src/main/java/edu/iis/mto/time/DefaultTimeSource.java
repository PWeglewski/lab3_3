package edu.iis.mto.time;

/**
 * Created by piotr on 04.05.2016.
 */
public final class DefaultTimeSource implements TimeSource {
    /**
     * One day in advance of the actual time.
     */
    @Override
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

}
