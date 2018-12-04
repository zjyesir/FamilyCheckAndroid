package model;

import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;

@Entity( primaryKeys = {"familyName","givenName"},tableName = "RelationShip")
public class Person {

    public Person(String familyName,String givenName){
        this.familyName = familyName;
        this.givenName = givenName;
    }

@NonNull
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

    @NonNull
    String givenName;
    @Ignore
    Person father;
    @Ignore
    Person mother;

    String fatherFullName;
    String motherFullName;

    public String getFatherFullName() {
        return fatherFullName;
    }

    public void setFatherFullName(String fatherFullName) {
        this.fatherFullName = fatherFullName;
    }

    public String getMotherFullName() {
        return motherFullName;
    }

    public void setMotherFullName(String motherFullName) {
        this.motherFullName = motherFullName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

//    @Embedded
//    Birthday birthDay;
    private int yearOfBirth;
    private int monthOfBirth;

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    private int dayOfBirth;

//    public Birthday getBirthDay() {
//        return birthDay;
//    }
//
//    public void setBirthDay(Birthday birthDay) {
//        this.birthDay = birthDay;
//    }

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
