package repository;

import model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class UserRepository implements GenericRepository<User> {

    List<User> users = new ArrayList<>();

    @Override
    public Optional<User> findById(Long Id) {
        for (User user:users){
            if(Objects.equals(user.getId(),Id)){
                return Optional.of(user);
            }
        }return Optional.empty();
    }


    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public void save(User entity) {
        users.add(entity);
    }

    @Override
    public void update(Long Id, User entity) {
        for (User user : users) {
            if (Objects.equals(user.getId(), Id)) {
                user.setId(Id);
                users.add(entity);
                break;
            }
        }
    }

    @Override
    public void delete(Long Id) {
        for (User user : users) {
            if (Objects.equals(user.getId(), Id)) {
                users.remove(user);
                break;
            }
        }
    }
}
