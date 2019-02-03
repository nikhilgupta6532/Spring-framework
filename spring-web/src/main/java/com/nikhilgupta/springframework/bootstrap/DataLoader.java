package com.nikhilgupta.springframework.bootstrap;

import com.nikhilgupta.springframework.models.Owner;
import com.nikhilgupta.springframework.models.Pet;
import com.nikhilgupta.springframework.models.PetType;
import com.nikhilgupta.springframework.models.Vet;
import com.nikhilgupta.springframework.services.OwnerService;
import com.nikhilgupta.springframework.services.PetTypeService;
import com.nikhilgupta.springframework.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService){
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("cat");
        PetType savedCatPetType = petTypeService.save(cat);


        Owner owner1 = new Owner();
        owner1.setFirstName("Nikhil");
        owner1.setLastName("Gupta");
        owner1.setAddress("241 Bakers Street");
        owner1.setCity("New York");
        owner1.setTelephone("123456");

        Pet mikesPet =new Pet();
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Rosco");
        owner1.getPets().add(mikesPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Ankit");
        owner2.setLastName("Ranga");
        owner2.setAddress("241 Bakers Street");
        owner2.setCity("New York");
        owner2.setTelephone("123456");

        Pet fionasCat = new Pet();
        fionasCat.setPetType(savedCatPetType);
        fionasCat.setOwner(owner2);
        fionasCat.setBirthDate(LocalDate.now());
        fionasCat.setName("Rosy");
        owner2.getPets().add(fionasCat);

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






