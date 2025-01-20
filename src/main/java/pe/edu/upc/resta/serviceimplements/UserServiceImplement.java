package pe.edu.upc.resta.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.resta.entities.Users;
import pe.edu.upc.resta.repositories.IUserRepository;
import pe.edu.upc.resta.serviceinterfaces.IUserService;

import java.util.List;

@Service
public class UserServiceImplement implements IUserService {


    @Autowired
    private IUserRepository iU;

    @Override
    public List<Users> list() {
        return iU.findAll();
    }

    @Override
    public void insert(Users user) {
        iU.save(user);
    }

    @Override
    public void update(Users user) {
        iU.save(user);
    }

    @Override
    public void delete(int id) {
        iU.deleteById(id);
    }
}
