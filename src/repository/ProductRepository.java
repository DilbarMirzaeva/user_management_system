package repository;

import model.Product;
import model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class ProductRepository implements GenericRepository<Product> {

    private List<Product> listProduct = new ArrayList<>();

    @Override
    public Optional<Product> findById(Long Id) {
        for (Product product : listProduct) {
            if (Objects.equals(product.getId(), Id)) {
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Product> findAll() {
        return listProduct;
    }

    @Override
    public void save(Product entity) {
        listProduct.add(entity);
    }

    @Override
    public void update(Long Id, Product entity) {

        for (Product product : listProduct) {
            if (Objects.equals(product.getId(), Id)) {
                product.setId(Id);
                listProduct.add(entity);
                break;
            }
        }
    }

    @Override
    public void delete(Long Id) {

        for(Product product:listProduct){
            if(Objects.equals(product.getId(),Id)){
                listProduct.remove(product);
                break;
            }
        }
    }

}
