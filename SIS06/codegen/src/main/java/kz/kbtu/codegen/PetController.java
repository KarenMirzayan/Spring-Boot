package kz.kbtu.codegen;

import com.baeldung.petstore.client.model.Pet;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    @GetMapping("/pets")
    public List<Pet> getAvailablePets() {
        return petService.getAvailablePets();
    }
}

