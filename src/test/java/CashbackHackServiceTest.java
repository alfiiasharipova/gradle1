import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void testJunit4RemainIfLess1000() {
        int amount = 900;
        int expected = 100;
        CashbackHackService cashbackHackService = new CashbackHackService();
        org.junit.Assert.assertEquals(expected, cashbackHackService.remain(amount));
    }

    @org.junit.Test
    public void testJunit4RemainIfEqual1000() {
        int amount = 1000;
        int expected = 0;
        CashbackHackService cashbackHackService = new CashbackHackService();
        org.junit.Assert.assertEquals(expected, cashbackHackService.remain(amount));
    }

    @org.junit.Test
    public void testJunit4RemainIfMore1000() {
        int amount = 1200;
        int expected = 800;
        CashbackHackService cashbackHackService = new CashbackHackService();
        org.junit.Assert.assertEquals(expected, cashbackHackService.remain(amount));
    }

    @org.junit.jupiter.api.Test
    public void testJunit5RemainIfLess1000() {
        int amount = 900;
        int expected = 100;
        CashbackHackService cashbackHackService = new CashbackHackService();
        org.junit.jupiter.api.Assertions.assertEquals(expected, cashbackHackService.remain(amount));
    }

    @org.junit.jupiter.api.Test
    public void testJunit5RemainIfEqual1000() {
        int amount = 1000;
        int expected = 0;
        CashbackHackService cashbackHackService = new CashbackHackService();
        org.junit.jupiter.api.Assertions.assertEquals(expected, cashbackHackService.remain(amount));
    }

    @org.junit.jupiter.api.Test
    public void testJunit5RemainIfMore1000() {
        int amount = 1200;
        int expected = 800;
        CashbackHackService cashbackHackService = new CashbackHackService();
        org.junit.jupiter.api.Assertions.assertEquals(expected, cashbackHackService.remain(amount));
    }
}