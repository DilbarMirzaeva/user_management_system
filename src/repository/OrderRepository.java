package repository;

import model.Order;
import model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class OrderRepository implements GenericRepository<Order> {
    List<Order> orders = new ArrayList<>();

    @Override
    public Optional<Order> findById(Long Id) {
        for (Order order : orders) {
            if (Objects.equals(order.getId(), Id)) {
                return Optional.of(order);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Order> findAll() {
        return orders;
    }

    @Override
    public void save(Order entity) {
        orders.add(entity);
    }

    @Override
    public void update(Long Id, Order entity) {
        for (Order order : orders) {
            if (Objects.equals(order.getId(), Id)) {
                order.setId(Id);
                orders.add(entity);
                break;
            }
        }
    }

    @Override
    public void delete(Long Id) {
        for (Order order : orders) {
            if (Objects.equals(order.getId(), Id)) {
                orders.remove(order);
                break;
            }
        }
    }
}

