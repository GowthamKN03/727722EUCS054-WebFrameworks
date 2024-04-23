package com.example.one.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.one.model.GowthamProduct;
import com.example.one.service.GowthamProductService;

@RestController
@RequestMapping("/api")
public class GowthamProductController {
    @Autowired
    public GowthamProductService productService;
    
    @PostMapping("/product")
    public ResponseEntity<GowthamProduct> getName(@RequestBody GowthamProduct product) 
    {
        GowthamProduct p = productService.saveCollege(product);
        if(p!=null)
        {
            return ResponseEntity.status(HttpStatus.CREATED).body(p);
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
    
    @GetMapping("/product/{productId}")
    public GowthamProduct getMethodName(@PathVariable("productId") int a) {
        return productService.getCollege(a);
    }
    
    @PutMapping("/product/{productId}")
    public GowthamProduct putMethodName(@PathVariable("productId") int id, @RequestBody GowthamProduct updateCollege) 
    {
        GowthamProduct exsistProduct = productService.getCollege(id);
        if(exsistProduct != null)
        {
            exsistProduct.setProductName(updateCollege.getProductName());
            exsistProduct.setProductDescription(updateCollege.getProductDescription());
            productService.saveCollege(exsistProduct);
        }
        else
        {
            return new GowthamProduct();
        }
        return productService.saveCollege(exsistProduct);
    }

    @DeleteMapping("/product/{productId}")
    public ResponseEntity<GowthamProduct> deleteMapping(@PathVariable("productId") int id)
    {
        GowthamProduct exProduct=productService.getCollege(id);
        if(exProduct != null)
        {
            productService.DeleteStudent(id);
            return ResponseEntity.ok(exProduct);
        }
        else{
        return ResponseEntity.notFound().build();
        }
    }
   
}