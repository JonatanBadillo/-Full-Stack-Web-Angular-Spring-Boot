package jb.inventories.service;

import jb.inventories.model.Product;

import java.util.List;

public interface IProductService {
    public List<Product> listProducts();

    public Product searchProductById(Integer IdProduct);

    public void saveProduct(Product product);

    public void deleteProductById(Integer idProduct);
}
