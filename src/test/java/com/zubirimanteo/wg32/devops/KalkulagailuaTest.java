
package com.zubirimanteo.wg32.devops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Kalkulagailua klasearen eragiketa aritmetikoak probatzen ditu.
 */
class KalkulagailuaTest {

    /**
     * Batuketa eragiketa zuzen egiten dela egiaztatzen du.
     */
    @Test
    void oinarrizkoBatuketaTest() {
        // 1. Prestaketa (Arrange)
        Kalkulagailua kalk = new Kalkulagailua();

        // 2. Exekuzioa (Act)
        int emaitza = kalk.batu(2, 3);

        // 3. Egiaztapena (Assert)
        assertEquals(
                5,
                emaitza,
                "2 + 3 batuketak 5 izan beharko luke");
    }

    /**
     * Kenketa eragiketa zuzen egiten dela egiaztatzen du.
     */
    @Test
    void oinarrizkoKenketaTest() {
        Kalkulagailua kalk = new Kalkulagailua();

        int emaitza = kalk.kendu(10, 4);

        assertEquals(
                6,
                emaitza,
                "10 - 4 kenketak 6 izan beharko luke");
    }

    /**
     * Biderketa eragiketa zuzen egiten dela egiaztatzen du.
     */
    @Test
    void oinarrizkoBiderketaTest() {
        Kalkulagailua kalk = new Kalkulagailua();

        int emaitza = kalk.biderkatu(5, 5);

        assertEquals(
                25,
                emaitza,
                "5 * 5 biderketak 25 izan beharko luke");
    }
}
