package edu.iis.mto.time;

/**
 * Created by piotr on 04.05.2016.
 */
public final class DefaultTimeSource implements TimeSource {

    private static final long ONE_DAY = 24 * 60 * 60 * 1000;

    /**
     * One day in advance of the actual time.
     */
    @Override
    public long currentTimeMillis() {
        return System.currentTimeMillis() + ONE_DAY;
    }

}
