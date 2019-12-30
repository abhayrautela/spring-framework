package com.guitar.db.repository;

import com.guitar.db.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository("locationJpaRepository")
public interface LocationJpaRepository extends JpaRepository<Location, Long> {
    /*
    This method replaces LocationRepository.getLocationByStateName method which was using JPQL
    (Java Persistent Query Language).
    How does this method performs the same query as in getLocationByStateName. This is because of the name of the
    method. findByStateLike. It is like "findBy<property name>Like". state is a property in entity Location.
    The spring jpa will automatically call a find query with fuzzy logic for the property.
    This is called DSL (Domain specific language).
    Query parser will match the following :
    find, findFirst query, read, count, get followed by 'By' .
     */
    List<Location> findByStateLike(String stateName);

    List<Location> findByStateIgnoreCase(String statename);

    // not of findByStateLike
    List<Location> findByStateNotLike(String stateName);

    // Does not require % to be passed in parameter string
    List<Location> findByStateStartingWith(String stateName);
    List<Location> findByStateStartingWithIgnoreCase(String stateName);
    // Does not require % to be passed in parameter string
    List<Location> findByStateEndingWith(String stateName);
    // Does not require % to be passed in parameter string
    List<Location> findByStateContaining(String stateName);

    List<Location> findByStateContainingOrderByCountryAsc(String stateName);
    List<Location> findByStateContainingOrderByCountryDsc(String stateName);

    List<Location> findByStateOrCountry (String state, String country);

    /*
    Same as above findByStateOrCountry
     */
    List<Location> findByStateIsOrCountryEquals (String state, String country);

    List<Location> findByStateAndCountry (String state, String country);

    /*
        find location where state <> param
     */
    List<Location> findByStateNot (String state);

    /*
        findByPriceLessThan(20);
        findByPriceLessThanEqual(20);
        findByPriceGreaterThan(20);
        findByPriceGreaterThanEqual(20);
        findByPriceGreaterThanAndPriceLessThan(10, 20);
     */

    List<Location> findByStateNull(); // or findByStateIsNull
    List<Location> findByStateNotNull(); // or findByStateIsNotNull

    List<Location> findByStateIn(Collection<String> states);
    List<Location> findByStateNotIn(Collection<String> states);

    Location findFirstByStateLike(String stateName);
    Location findTop5ByStateLike(String stateName);
    Location findDistinctManufacturerByStateLike(String stateName);

}
