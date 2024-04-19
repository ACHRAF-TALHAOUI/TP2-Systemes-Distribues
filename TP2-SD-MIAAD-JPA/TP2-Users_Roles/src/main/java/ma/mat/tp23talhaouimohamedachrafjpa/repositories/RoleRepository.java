package ma.mat.tp23talhaouimohamedachrafjpa.repositories;

import ma.mat.tp23talhaouimohamedachrafjpa.entities.Role;
import ma.mat.tp23talhaouimohamedachrafjpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
    Role findByRoleName(String roleName);
}
