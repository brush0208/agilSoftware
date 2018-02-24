package org.brush.monoState;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import sun.net.www.protocol.http.HttpURLConnection;


public class TurnstuleTest {


    @Before
    public void setUp()
    {
        Turnstile t =new Turnstile();
        t.reset();
    }
    @Test
    public void testInit()
    {
        Turnstile turnstile = new Turnstile();
        assert(turnstile.locked());
        assert (!turnstile.alarm());
    }

    @Test
    public void testCoin()
    {
        Turnstile t = new Turnstile();
        t.coin();
        Turnstile t1 =new Turnstile();
        assert (!t1.locked());
        assert(!t1.alarm());
        assertEquals(1,t1.conins());
    }

    @Test
    public void testCoinAndPass()
    {
        Turnstile t = new Turnstile();
        t.coin();
        t.pass();
        Turnstile t1 = new Turnstile();
        assert (t1.locked());
        assert (!t1.alarm());
        assertEquals("coins",1,t1.conins());
    }
}
