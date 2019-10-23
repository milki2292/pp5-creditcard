package pl.krakow.uek.pp5.creditcard.model;

import com.sun.org.apache.xalan.internal.utils.XMLSecurityManager;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class CreditCardTest {
    private static final int LIMIT = 2000;
    @Test
    public void ilAllowAssignCreditToCard()
    {
        //Arrange   /Giver
        CreditCard card = new CreditCard("1234-5678");
        //Act       /When
        card.assignLimit(BigDecimal.valueOf(LIMIT));
        //Assert    /then
        Assert.assertTrue(card.getlimit().equals(BigDecimal.valueOf(LIMIT)) );

    }
}
