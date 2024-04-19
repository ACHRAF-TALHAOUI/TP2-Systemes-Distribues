package ma.mat.tp23talhaouimohamedachrafjpa;

import ma.mat.tp23talhaouimohamedachrafjpa.entities.Role;
import ma.mat.tp23talhaouimohamedachrafjpa.entities.User;
import ma.mat.tp23talhaouimohamedachrafjpa.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class Tp23TalhaouiMohamedAchrafJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(Tp23TalhaouiMohamedAchrafJpaApplication.class, args);
    }
    @Bean
    CommandLineRunner start(UserService userService){
        return args -> {
           User user = new User();
           user.setUsername("User1");
           user.setPassword("aa11bb22");
           userService.addNewUser(user);

           User user1 = new User();
           user1.setUsername("admin");
           user1.setPassword("@dm1n");
           userService.addNewUser(user1);

           Stream.of("STUDENT","USER","ADMIN").forEach(r->{
               Role role = new Role();
               role.setRoleName(r);
               userService.addNewRole(role);
           });

           userService.addRoleToUser("User1","ADMIN");
           userService.addRoleToUser("admin","USER");
           userService.addRoleToUser("User1","STUDENT");
           userService.addRoleToUser("admin","ADMIN");

           //authen
            try {
                User user2 = userService.authenticate("User1","aa11bb22" );
                System.out.println("name of user :"+user2.getUserId());
                System.out.println("password of user :"+user2.getUsername());
                System.out.println("Roles of the User :");
                user2.getRoles().forEach(r->{
                    //System.out.println(r.getRoleName());
                    System.out.println(r.toString());
                });

            }catch (Exception e){
                e.printStackTrace();
            }




        };

    }
}
