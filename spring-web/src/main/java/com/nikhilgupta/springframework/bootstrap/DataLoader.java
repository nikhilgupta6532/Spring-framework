package com.nikhilgupta.springframework.bootstrap;

import com.nikhilgupta.springframework.models.Owner;
import com.nikhilgupta.springframework.models.Vet;
import com.nikhilgupta.springframework.services.OwnerService;
import com.nikhilgupta.springframework.services.VetService;
import com.nikhilgupta.springframework.services.map.OwnerServiceMap;
import com.nikhilgupta.springframework.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
class DataLoader implements CommandLineRunner {

    private static final OwnerService ownerService = new OwnerServiceMap();
    private static final VetService vetService = new VetServiceMap();
//
//    public DataLoader(){
//        ownerService = new OwnerServiceMap();
//        vetService = new VetServiceMap();
//    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Nikhil");
        owner1.setLastName("Gupta");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner1.setId(2L);
        owner1.setFirstName("Ankit");
        owner1.setLastName("Ranga");

        ownerService.save(owner2);

        System.out.println("Loaded owners......");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFristName("Rajan");
        vet1.setLastName("Goel");

        vetService.save(vet1);


        Vet vet2 = new Vet();
        vet1.setId(2L);
        vet1.setFristName("Richa");
        vet1.setLastName("Goel");

        vetService.save(vet2);

        System.out.println("Loaded vets.....");
    }
}






