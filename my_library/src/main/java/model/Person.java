package model;

import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.graphics.Bitmap;

@Entity(tableName = "RelationShip")
public class Person {



    @PrimaryKey
    String familyName;

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

    @Ignore
    private Bitmap image;

    @PrimaryKey
    String givenName;
    Person father;
    Person mother;
    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }
    class BirthDay{
        private int yearOfBirth;
        private int monthOfBirth;
        private int dayOfBirth;

        public int getYearOfBirth() {
            return yearOfBirth;
        }

        public int getMonthOfBirth() {
            return monthOfBirth;
        }

        public int getDayOfBirth() {
            return dayOfBirth;
        }

        public BirthDay(int year, int month, int day){
            this.yearOfBirth = year;
            this.monthOfBirth = month;
            this.dayOfBirth = day;
        }
    }
    @Embedded
    BirthDay birthDay;

    public BirthDay getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(BirthDay birthDay) {
        this.birthDay = birthDay;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public String getFullName(){
        return new StringBuffer().append(familyName).append(" ").append(givenName).toString();
    }
}
