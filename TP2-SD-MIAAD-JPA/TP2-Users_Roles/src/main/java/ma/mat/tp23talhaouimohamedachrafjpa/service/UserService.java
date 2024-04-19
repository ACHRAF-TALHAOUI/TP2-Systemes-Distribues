package ma.mat.tp23talhaouimohamedachrafjpa.service;

import ma.mat.tp23talhaouimohamedachrafjpa.entities.Role;
import ma.mat.tp23talhaouimohamedachrafjpa.entities.User;

public interface UserService {
    User addNewUser(User user);
    Role addNewRole(Role role);
    User findUserByUserName(String userName);
    Role findRoleByRoleName(String roleName);
    void addRoleToUser(String username, String roleName);
    User authenticate(String userName, String password);
}
