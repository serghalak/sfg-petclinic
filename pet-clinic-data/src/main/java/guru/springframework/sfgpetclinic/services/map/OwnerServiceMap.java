package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.services.CrudService;
import guru.springframework.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

/**
 * Created by jt on 7/21/18.
 */
@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long>
        implements OwnerService {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
//        Stream<Map.Entry<Long, Owner>> entryStream = map
//                .entrySet().stream()
//                .filter(longOwnerEntry ->
//                        longOwnerEntry.getValue().getLastName().equals(lastName));
        return null;
    }
}
