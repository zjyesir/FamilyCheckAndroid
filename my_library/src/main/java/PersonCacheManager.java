import android.content.Context;

import java.util.List;

import database.PersonInfoDao;
import database.PersonInfoDataBase;
import model.Person;

public class PersonCacheManager {

//    code here is to get different Dao in DataBase
    public static PersonInfoDao getPersonInfoDao(Context context,String familyTAG){
        return  PersonInfoDataBase.getInstance(context,familyTAG).personInfoDao();
    }


//    code here is to use the above Dao to crud(create ,read,update and delete)

    public static List<Person> getAllFamilyMembers(Context context, String familyTAG){
        return getPersonInfoDao(context,familyTAG).getAllPersons();
    }

    public static List<Person> getPersonsBornBetween(Context context,String familyTAG,int minYear,int maxYear){
        return getPersonInfoDao(context,familyTAG).getPersonsBornBetween(minYear,maxYear);
    }

    public static List<Person> getPersonByFamilyName(Context context,String familyTAG,String familyName){
        return getPersonInfoDao(context,familyTAG).getPersonByFamilyName(familyName);
    }

    public static void deletePerson(Context context,String familyTAG,String familyName,String givenName){
        getPersonInfoDao(context,familyTAG).deletePerson(familyName,givenName);
    }

    public static  void  addFamilyMembers(Context context,String familyTAG,Person person){
        getPersonInfoDao(context,familyTAG).insertPerson(person);
    }

    public static void deleteAll(Context context,String familyTAG){
        getPersonInfoDao(context,familyTAG).deleteAll();
    }

    public static void deletePerson(Context context,String familyTAG,Person person){
        getPersonInfoDao(context,familyTAG).deletePerson(person);
    }

}
