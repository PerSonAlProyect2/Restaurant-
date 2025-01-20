package pe.edu.upc.resta.serviceinterfaces;

import pe.edu.upc.resta.entities.Users;

import java.util.List;

public interface IUserService {

    List<Users> list();

    public void insert(Users user);

    public void update(Users user);

    public void delete(int id);
}
