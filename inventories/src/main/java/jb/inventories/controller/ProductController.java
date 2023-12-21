package jb.inventories.controller;

import jb.inventories.model.Product;
import jb.inventories.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
// localhost:8080/inventorie-app
@RequestMapping("inventorie-app")
@CrossOrigin(value = "http://localhost:4200")

public class ProductController {
    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private ProductService productService;

    //http://localhost:8080/inventorie-app/products
    @GetMapping("/products")
    public List<Product> getProducts(){
        List<Product> products = this.productService.listProducts();
        logger.info("Obtained Products:");
        products.forEach(product -> logger.info(product.toString()));
        return products;
    }
}
