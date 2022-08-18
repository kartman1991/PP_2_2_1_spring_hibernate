package hiber.dao;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface UserDao {
   void add(User user);
   User getUserOwner(String model, String series);
   void add(Car car);
   List<User> listUsers();
}
