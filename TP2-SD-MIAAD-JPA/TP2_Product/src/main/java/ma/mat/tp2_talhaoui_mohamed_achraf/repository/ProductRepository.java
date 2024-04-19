package ma.mat.tp2_talhaoui_mohamed_achraf.repository;
import ma.mat.tp2_talhaoui_mohamed_achraf.entities.Product;
import org.hibernate.query.criteria.JpaParameterExpression;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

//JpaRepository
public interface ProductRepository extends JpaRepository<Product, Long> {

    //1er sol , pour chercher des proudits avec des mots Cle
    List<Product> findByNameContains(String mc);
    List<Product> findByPriceGreaterThan(double Price);


    /*
    //2e sol , pour chercher des proudits avec des mots Cle
    @Query("select p from  Product where p.name like :x")
    List<Product> search(@Param("x") String mc);

    @Query("select p from Product where p.price >:x")
    List<Product> searchByPrice(@Param("x") double price);
*/
}
