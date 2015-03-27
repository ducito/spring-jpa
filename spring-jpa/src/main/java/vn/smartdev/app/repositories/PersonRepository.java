package vn.smartdev.app.repositories;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import vn.smartdev.app.entities.Person;


public interface PersonRepository extends JpaRepository<Person, Integer> {
    
    public final static String FIND_BY_ADDRESS_QUERY = "SELECT p " + 
                                                       "FROM Person p LEFT JOIN p.addresses a " +
                                                       "WHERE a.address = :address";

    /**
     * Find person like first name.
     */
    public List<Person> findByFirstNameLike(String firstName);

    /**
     * Find person by last name.
     */
    public List<Person> findByLastName(String lastName);

    /**
     * Find person by address.
     */
    @Query(FIND_BY_ADDRESS_QUERY)
    public List<Person> findByAddress(@Param("address") String address);

    /**
     * Find person by address.
     */
    @Query(FIND_BY_ADDRESS_QUERY)
    public Page<Person> findByAddress(@Param("address") String address, Pageable page);

    /**
     * Find person by first and last name.
     */
    public List<Person> findByName(@Param("firstName") String firstName, @Param("lastName") String lastName);
    
}
