package com.salwa.androidelearning.models;

import android.os.Parcel;
import android.os.Parcelable;

public class TeacherModel implements Parcelable {

    private String name;
    private String email;
    private String age;
    private String gender;
    private String role;
    private String id;
    private String contactNumber;

    public TeacherModel() {
    }

    public TeacherModel(String name, String email, String age, String gender, String role, String id, String contactNumber) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.role = role;
        this.id = id;
        this.contactNumber = contactNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.email);
        dest.writeString(this.age);
        dest.writeString(this.gender);
        dest.writeString(this.role);
        dest.writeString(this.id);
        dest.writeString(this.contactNumber);
    }

    protected TeacherModel(Parcel in) {
        this.name = in.readString();
        this.email = in.readString();
        this.age = in.readString();
        this.gender = in.readString();
        this.role = in.readString();
        this.id = in.readString();
        this.contactNumber = in.readString();
    }

    public static final Parcelable.Creator<TeacherModel> CREATOR = new Parcelable.Creator<TeacherModel>() {
        @Override
        public TeacherModel createFromParcel(Parcel source) {
            return new TeacherModel(source);
        }

        @Override
        public TeacherModel[] newArray(int size) {
            return new TeacherModel[size];
        }
    };
}
