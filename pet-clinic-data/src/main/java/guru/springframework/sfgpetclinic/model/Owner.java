package guru.springframework.sfgpetclinic.model;

import java.util.Set;

/**
 * @author John Bickerstaff
 * 23/07/2020
 */
public class Owner extends Person {

    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
