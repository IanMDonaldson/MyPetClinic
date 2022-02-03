package ian.donaldson.mypetclinic.services.map;

import ian.donaldson.mypetclinic.model.Vet;
import ian.donaldson.mypetclinic.model.Vet;
import ian.donaldson.mypetclinic.services.CrudService;
import ian.donaldson.mypetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet vet) {
        delete(vet);
    }

    @Override
    public Vet save(Vet vet) {
        return super.save(vet.getId(), vet);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
