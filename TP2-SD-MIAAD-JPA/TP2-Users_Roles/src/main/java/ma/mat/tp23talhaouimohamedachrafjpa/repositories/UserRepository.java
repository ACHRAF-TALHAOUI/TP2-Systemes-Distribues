package ma.mat.tp23talhaouimohamedachrafjpa.repositories;

import ma.mat.tp23talhaouimohamedachrafjpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,String> {
    User findByUsername(String userName);
}
