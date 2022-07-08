package com.leetcode;

import static org.assertj.core.api.Assertions.*;


import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class MovingAverageFromDataStreamTest 
{
    /**
     * Rigorous Test :-)
     */

    


    @Test
    public void OneShouldReturnOne() {
        MovingAverageFromDataStream346 movingAverage = new MovingAverageFromDataStream346(3);
        assertThat(movingAverage.next(1)).isEqualTo(1.0);
        assertThat(movingAverage.next(3)).isEqualTo(2.0);
        assertThat(movingAverage.next(10)).isEqualTo(14.0 / 3.0);
        assertThat(movingAverage.next(2)).isEqualTo(5.0);
        assertThat(movingAverage.next(6)).isEqualTo(6.0);

        MovingAverageFromDataStreamA movingAveragea = new MovingAverageFromDataStreamA(3);
        assertThat(movingAveragea.next(1)).isEqualTo(1.0);
        assertThat(movingAveragea.next(3)).isEqualTo(2.0);
        assertThat(movingAveragea.next(10)).isEqualTo(14.0 / 3.0);
        assertThat(movingAveragea.next(2)).isEqualTo(5.0);
        assertThat(movingAveragea.next(6)).isEqualTo(6.0);
    }
}
