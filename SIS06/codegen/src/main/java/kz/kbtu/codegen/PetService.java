package kz.kbtu.codegen;

import com.baeldung.petstore.client.api.PetApi;
import com.baeldung.petstore.client.model.Pet;
import org.springframework.stereotype.Service;
import java.util.Collections;
import java.util.List;

@Service
public class PetService {

    private final PetApi petApi;

    public PetService(PetApi petApi) {
        this.petApi = petApi;
    }

    public List<Pet> getAvailablePets() {
        return petApi.findPetsByStatus(Collections.singletonList("available"));
    }
}
