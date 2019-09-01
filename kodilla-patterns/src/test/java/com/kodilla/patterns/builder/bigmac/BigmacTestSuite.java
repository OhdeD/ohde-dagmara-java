package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigmacBuilder(){
        //Given //When
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("regular")
                .burgers(2)
                .sauce("1000 wysp")
                .ingredient("cheese")
                .ingredient("onion")
                .ingredient("bekon")
                .builder();
        //Then
        Assert.assertEquals("regular", bigmac.getBun());
        Assert.assertEquals(2, bigmac.getBurgers());
        Assert.assertEquals("1000 wysp", bigmac.getSauce());
        Assert.assertEquals(3, bigmac.getIngredients().size());
    }
}
