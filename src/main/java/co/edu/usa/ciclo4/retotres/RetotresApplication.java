package co.edu.usa.ciclo4.retotres;

import co.edu.usa.ciclo4.retotres.repository.crud.GadgetCrudRepository;
import co.edu.usa.ciclo4.retotres.repository.crud.OrderCrudRepository;
import co.edu.usa.ciclo4.retotres.repository.crud.UserCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class RetotresApplication implements CommandLineRunner{
    
    @Autowired
    private UserCrudRepository userCrudRepository;
    @Autowired
    private GadgetCrudRepository gadgetCrudRepository;
    @Autowired
    private OrderCrudRepository orderCrudRepository;
            
	public static void main(String[] args) {
		SpringApplication.run(RetotresApplication.class, args);
	}

        @Override
        public void run(String... args) throws Exception{
        gadgetCrudRepository.deleteAll();
        userCrudRepository.deleteAll();
        orderCrudRepository.deleteAll();  
        }
}
