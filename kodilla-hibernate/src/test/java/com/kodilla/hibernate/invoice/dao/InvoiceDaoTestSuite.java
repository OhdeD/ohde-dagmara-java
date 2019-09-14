package com.kodilla.hibernate.invoice.dao;


import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    @Transactional
    public void testInvoiceDaoSave() {
        //Given
        Invoice invoice = new Invoice();

        Product productAGD = new Product("AGD");
        Product productRTV  = new Product("RTV");
        Product book  = new Product("Book");

        Item blender = new Item(new BigDecimal(120),1,new BigDecimal(50));
        Item mixer = new Item(new BigDecimal(150),1,new BigDecimal(80));
        Item tv = new Item(new BigDecimal(5000),1,new BigDecimal(3500));
        Item book1 = new Item(new BigDecimal(20),1,new BigDecimal(10));
        Item book2 = new Item(new BigDecimal(70),1,new BigDecimal(65));

        invoice.getItems().add(blender);
        invoice.getItems().add(mixer);
        invoice.getItems().add(book1);
        invoice.getItems().add(book2);
        invoice.getItems().add(tv);

        blender.setInvoice(invoice);
        mixer.setInvoice(invoice);
        book1.setInvoice(invoice);
        book2.setInvoice(invoice);
        tv.setInvoice(invoice);

        productAGD.getItems().add(blender);
        productAGD.getItems().add(mixer);
        productRTV.getItems().add(tv);
        book.getItems().add(book1);
        book.getItems().add(book2);

        book1.setProduct(book);
        blender.setProduct(productAGD);
        mixer.setProduct(productAGD);
        tv.setProduct(productRTV);
        book2.setProduct(book);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0,id);

        //CleanUp
        invoiceDao.deleteById(id);

    }

}
