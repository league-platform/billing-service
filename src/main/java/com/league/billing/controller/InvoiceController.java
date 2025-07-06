package com.league.billing.controller;

import com.league.billing.model.Invoice;
import com.league.billing.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/invoices")
public class InvoiceController {

    @Autowired
    private InvoiceRepository repo;

    @PostMapping
    public Invoice create(@RequestBody Invoice invoice) {
        System.out.println("EVENT: invoice.created -> " + invoice.getCustomer());
        return repo.save(invoice);
    }

    @GetMapping
    public List<Invoice> getAll() {
        return repo.findAll();
    }
}
