package ma.mat.tp2_talhaoui_mohamed_achraf;

import ma.mat.tp2_talhaoui_mohamed_achraf.entities.Product;
import ma.mat.tp2_talhaoui_mohamed_achraf.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Tp2TalhaouiMohamedAchrafApplication implements CommandLineRunner {
    @Autowired
    private ProductRepository productRepository;
    public static void main(String[] args) {

        SpringApplication.run(Tp2TalhaouiMohamedAchrafApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //productRepository.save(new Product(null, "Computer",22000,3));
        //productRepository.save(new Product(null, "Samsung S22",8000,17));
        //productRepository.save(new Product(null, "Iphone 15",12000,7));
        List<Product> products = productRepository.findAll();
        products.forEach(p->{
            System.out.println(p.toString());
        });
        Product product = productRepository.findById(Long.valueOf(1)).get();
        System.out.println("***************");
        System.out.println(product.getId());
        System.out.println(product.getName());
        System.out.println(product.getPrice());
        System.out.println(product.getQuantity());
        System.out.println("***************");
        System.out.println("-------------------------------------");

        //1er solution pour chercher des proudits avec des mots Cle
        List<Product> productList =productRepository.findByNameContains("S");
        productList.forEach(p->{
            System.out.println(p);
        });

     /*   System.out.println("-------------------------------------");
        //2er solution pour chercher des proudits avec des mots Cle
        List<Product> productList2 =productRepository.search("%S%");
        productList2.forEach(p->{
            System.out.println(p);

        });
        List<Product> productList4 =productRepository.searchByPrice(7000);
        productList4.forEach(p->{
            System.out.println(p);
        });
        */

        //1er solution pour chercher des proudits avec des prix sup a ..
        List<Product> productList3 =productRepository.findByPriceGreaterThan(1000);
        productList3.forEach(p->{
            System.out.println(p);
        });

    }
}
