package dev.draxano.SpringBootJPAHibernate.service;

import dev.draxano.SpringBootJPAHibernate.entity.Product;
import dev.draxano.SpringBootJPAHibernate.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;


    // This is a post method
    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

    // This is a post method
    public List<Product> saveProducts(List<Product> products){
        return productRepository.saveAll(products);
    }

    // This is a get method
    public List<Product> getProducts(){
        return productRepository.findAll();
    }

    // This is a get method
    public Product getProductById(int id){
        return productRepository.findById(id).orElse(null);
    }

    // This is a get method
    public Product getProductByName(String name){
        return productRepository.findByName(name);
    }

    public String deleteProduct(int id){
        productRepository.deleteById(id);
        return "product removed!! "+ id;
    }

    public Product updateProduct(Product product){
        Product existingProduct = productRepository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setPrice(product.getPrice());
        return productRepository.save(existingProduct);

    }

}
