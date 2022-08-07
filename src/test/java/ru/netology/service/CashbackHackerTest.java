package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackerTest {
    CashbackHackerService service = new CashbackHackerService();
    @Test
    public void AmountMoreBoundary() {
        int actual = service.remain(2500);
        int expected = 500;
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void AmountLessBoundary() {
        int actual = service.remain(640);
        int expected = 360;
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void AmountEqualsBoundary() {
        int actual = service.remain(1000);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }
}
