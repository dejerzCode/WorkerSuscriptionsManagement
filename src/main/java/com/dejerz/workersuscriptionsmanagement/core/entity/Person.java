package com.dejerz.workersuscriptionsmanagement.core.entity;

import com.dejerz.workersuscriptionsmanagement.WorkerSubscriptionsManagementApplication;
import com.dejerz.workersuscriptionsmanagement.interfaces.IAttendance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//Abstraction
public abstract class Person implements IAttendance {
    private final Logger logger = LoggerFactory.getLogger(Person.class);

    private String lastName;
    private String firstName;
    private String address;
    private String phoneNumber;
    private String email;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract void sendPersonalInformationByEmail (String message);

    @Override
    public void takeAttendance() {
        logger.debug("Attendance taken for: " + this.getFirstName() + " " + this.getLastName());
    }
}
