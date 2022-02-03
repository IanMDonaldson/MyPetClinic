package ian.donaldson.mypetclinic.bootstrap;

import ian.donaldson.mypetclinic.model.Owner;
import ian.donaldson.mypetclinic.model.Vet;
import ian.donaldson.mypetclinic.services.OwnerService;
import ian.donaldson.mypetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    //@Autowired -- spring doesn't need this with this kind of constructor
    /*If it sees a constructor whose parameters are @Services or @Components it will
    * Automatically pick it up and DI to here */
    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }


    //making this a component makes spring run this as soon as it's initialized
    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("John");
        owner1.setLastName("Coffe");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Amy");
        owner2.setLastName("Eileen");
        ownerService.save(owner2);

        System.out.println("Loaded Owners...........");


        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Ian");
        vet1.setLastName("Donaldson");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Matthew");
        vet2.setLastName("Donaldson");
        vetService.save(vet2);

        System.out.println("Loaded Vets...........");
    }
}
