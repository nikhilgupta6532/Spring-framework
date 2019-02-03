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

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerServiceMap ownerService, VetServiceMap vetService){
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Nikhil");
        owner1.setLastName("Gupta");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Ankit");
        owner2.setLastName("Ranga");

        ownerService.save(owner2);

        System.out.println("Loaded owners......");

        Vet vet1 = new Vet();
        vet1.setFirstName("Rajan");
        vet1.setLastName("Goel");

        vetService.save(vet1);


        Vet vet2 = new Vet();
        vet2.setFirstName("Richa");
        vet2.setLastName("Goel");

        vetService.save(vet2);

        System.out.println("Loaded vets.....");
    }
}






