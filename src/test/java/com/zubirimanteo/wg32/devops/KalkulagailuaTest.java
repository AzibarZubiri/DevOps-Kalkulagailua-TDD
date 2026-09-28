package com.zubirimanteo.wg32.devops;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class KalkulagailuaTest {
 @Test
 void oinarrizkoBatuketaTest() {
 // 1. Prestaketa (Arrange)
 Kalkulagailua kalk = new Kalkulagailua();

 // 2. Exekuzioa (Act)
 int emaitza = kalk.batu(2, 3);

 // 3. Egiaztapena (Assert)
 assertEquals(5, emaitza, "2 + 3 batuketak 5 izan beharko luke");
 }
 @Test 
 void oinarrizkoKenketaTest(){
    Kalkulagailua kalk = new Kalkulagailua();

    int emaitza = kalk.kendu(10,4);

    assertEquals(6, emaitza, "3 + 2 kenketak 1 izan beharko luke");
 }
 @Test 
 void oinarrizkoBiderketaTest(){
    Kalkulagailua kalk = new Kalkulagailua();

    int emaitza = kalk.biderkatu(5, 5);

    assertEquals(25, emaitza, "5 * 5 biderketak 25 izan beharko luke");
 }
}

