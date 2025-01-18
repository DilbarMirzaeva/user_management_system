import model.Order;
import model.Product;
import model.User;
import repository.OrderRepository;
import repository.ProductRepository;
import repository.UserRepository;

public class main {
    public static void main(String[] args) {
        UserRepository repo1=new UserRepository();
        User user1=new User(1L,"Revan");
        User user2=new User(1L,"Ruslan");
        User user3=new User(1L,"Dilbar");

        repo1.save(user1);
        repo1.save(user2);
        repo1.save(user3);

        System.out.println(repo1.findAll());

        ProductRepository repo2=new ProductRepository();
        Product product1=new Product(1L,"Car",234567);
        Product product2=new Product(2L,"computer",2000);
        repo2.save(product1);
        repo2.save(product2);
        repo2.findAll();
        repo2.delete(2L);
        repo2.findAll();

        OrderRepository repo3=new OrderRepository();
        Order order1=new Order(1L,3L,6L);
        repo3.save(new Order(4L,5L,1L));
        repo3.update(4L,order1);


    }
}
