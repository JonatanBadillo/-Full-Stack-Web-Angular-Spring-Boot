package jb.inventories.service;

import jb.inventories.model.Product;
import jb.inventories.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService implements IProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> listProducts() {
        this.productRepository.findAll();
    }

    @Override
    public Product searchProductById(Integer IdProduct) {
        Product product = this.productRepository.findById(IdProduct).orElse(null);
        return product;
    }

    @Override
    public void saveProduct(Product product) {
        this.productRepository.save(product);
    }

    @Override
    public void deleteProductById(Integer idProduct) {
        this.productRepository.deleteById(idProduct);
    }
}
