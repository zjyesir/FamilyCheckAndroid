package database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import java.util.HashMap;
import java.util.Map;

import model.Person;

@Database( entities = {Person.class},version = 1)
public abstract class PersonInfoDataBase extends RoomDatabase {


    public static String DB_NAME = "PersonsInfos";
    static PersonInfoDataBase instance;
    private Map<String, PersonInfoDataBase> instancesMap = new HashMap<>(1);

    /**
     *
     * @param context
     * @param prefix different family  for extend purpose
     * @return
     */
    public synchronized static  PersonInfoDataBase getInstance(Context context,String prefix){
        if(instance == null){
            instance = Room.databaseBuilder(context,PersonInfoDataBase.class,prefix+"_"+DB_NAME).fallbackToDestructiveMigration().build();
        }
        return instance;
    }

    public abstract PersonInfoDao personInfoDao();

}
