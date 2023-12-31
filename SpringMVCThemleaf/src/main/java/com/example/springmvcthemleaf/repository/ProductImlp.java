package com.example.springmvcthemleaf.repository;
import com.example.springmvcthemleaf.model.Product;
import org.springframework.stereotype.Repository;
import java.util.*;



@Repository
public class ProductImlp implements IProduct{


    private  static Map<Integer,Product> productMap = new HashMap<>();

    static {
         productMap.put(1,new Product(1,"SamSungZflip",23000000,"In stock","SamSung Group",new ArrayList<>()));
         productMap.put(2,new Product(2,"IPhone 13",30000000,"In stock","Steve",new ArrayList<>()));
         productMap.put(3,new Product(3,"IPhone 14",15000000,"In stock"," Steve",new ArrayList<>()));
         productMap.put(4,new Product(4,"Nokia",230000,"In stock","Fredrik Idestam",new ArrayList<>()));
         productMap.put(5,new Product(5,"Nokia",230000,"In stock","Fredrik Idestam\n",new ArrayList<>()));
    }


    @Override
    public void add(Product product) {
        productMap.put(product.getId(),product);
    }

    @Override
    public void update(Product product) {
        productMap.put(product.getId(),product);

    }

    @Override
    public Product findById(int id) {
         return  productMap.get(id);
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void delete(int id) {
        productMap.remove(id);
    }
    @Override
    public List<Product> findByName(String nameProduct) {
        List<Product> productListOne = new ArrayList<>(productMap.values());
        List<Product> productListTwo = new ArrayList<>();
        for (Product p:productListOne) {
            if(p.getNameProduct().equalsIgnoreCase(nameProduct)){
                 productListTwo.add(p);
            }
        }
        return  productListTwo;
    }
}
