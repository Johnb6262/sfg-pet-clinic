package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

/**
 * @author John Bickerstaff
 * 28/08/2020
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
