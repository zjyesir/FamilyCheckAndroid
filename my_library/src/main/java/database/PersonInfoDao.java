package database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import model.Person;

import static android.arch.persistence.room.OnConflictStrategy.REPLACE;

/**
 *  I want to show the family tree
 */
@Dao
public interface PersonInfoDao  {

    @Query( "select * from RelationShip")
    List<Person> getAllPersons();

    @Query( "select * from RelationShip where yearOfBirth between :minYear and :maxYear ")
    List<Person> getPersonsBornBetween(int minYear, int maxYear);

    @Query("select * from RelationShip where familyName =:familyName")
    List<Person> getPersonByFamilyName(String familyName);

    @Insert(onConflict =  REPLACE)
    void insertPerson(Person person);

    @Query("delete from RelationShip where familyName = :familyName and givenName =:givenName  ")
    void deletePerson(String familyName,String givenName);

    @Query("delete  from RelationShip")
    void deleteAll();

    @Delete
    void deletePerson(Person person);
}
