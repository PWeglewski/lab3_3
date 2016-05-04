package edu.iis.mto.time;

import org.junit.Test;

/**
 * Created by piotr on 04.05.2016.
 */
public class OrderTest {

    TimeSource fakeTimeSource = new TimeSource() {
        private static final long ONE_DAY = 25 * 60 * 60 * 1000;

        @Override
        public long currentTimeMillis() {
            return System.currentTimeMillis() + ONE_DAY;
        }
    };

    @Test(expected = OrderExpiredException.class)
    public void confirmTest() throws Exception {
        // Given
        Order order = new Order();
        order.submit();
        order.setTimeSource(fakeTimeSource);

        // When
        order.confirm();

        // Then
        // ​OrderExpiredException expected
    }
}