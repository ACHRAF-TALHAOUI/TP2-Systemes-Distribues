package ma.mat.tp23talhaouimohamedachrafjpa.service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import ma.mat.tp23talhaouimohamedachrafjpa.entities.Role;
import ma.mat.tp23talhaouimohamedachrafjpa.entities.User;
import ma.mat.tp23talhaouimohamedachrafjpa.repositories.RoleRepository;
import ma.mat.tp23talhaouimohamedachrafjpa.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Transactional
@AllArgsConstructor //autre meth d'injection
public class UserServiceImpl implements UserService {
    //@Autowired pour Injection ou bien utiliser les constructeurs

    private UserRepository userRepository;
    private RoleRepository roleRepository;

    /*
    //Injection via le constructer
    public UserServiceImpl(UserRepository userRepository,RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }
   */

    @Override
    public User addNewUser(User user) {
        user.setUserId(UUID.randomUUID().toString()); //generer random Id String,Unique
        return userRepository.save(user);
    }

    @Override
    public Role addNewRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public User findUserByUserName(String userName) {
        return userRepository.findByUsername(userName);
    }

    @Override
    public Role findRoleByRoleName(String roleName) {
        return roleRepository.findByRoleName(roleName);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        User user =findUserByUserName(username);
        Role role = findRoleByRoleName(roleName);
        if(user.getRoles()!=null){
            user.getRoles().add(role);
            role.getUsers().add(user);
        }
        // userRepository.save(user);   pas obli
    }

    @Override
    public User authenticate(String userName, String password) {
        User user = userRepository.findByUsername(userName);
        if(user==null) throw new RuntimeException("bad credentials");
        if(user.getPassword().equals(password)) {
            return user;
        }
        throw new RuntimeException("bad credentials");
    }
}
