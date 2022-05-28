package com.dejerz.workersuscriptionsmanagement;

import com.dejerz.workersuscriptionsmanagement.core.entity.Applicant;
import com.dejerz.workersuscriptionsmanagement.core.entity.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class WorkerSubscriptionsManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorkerSubscriptionsManagementApplication.class, args);

        Applicant applicantJuan = new Applicant();

        applicantJuan.setFileNumber("F-2022001");
        applicantJuan.setCui("202020202020");
        applicantJuan.setLastName("Perez");
        applicantJuan.setFirstName("Juan");
        applicantJuan.setAddress("Guatemala, Guatemala");
        applicantJuan.setStatus("Not Assigned");
        applicantJuan.setPhoneNumber("20202020");
        applicantJuan.setTestDate(new Date());
        applicantJuan.sendPersonalInformationByEmail("Your classes have been assigned " + applicantJuan.getFileNumber());

        Student studentLuis = new Student();
        studentLuis.setId("2022001");
        studentLuis.setLastName("Garcia");
        studentLuis.setFirstName("Luis");
        studentLuis.setAddress("Guatemala, Guatemala");
        studentLuis.setPhoneNumber("25252525");
        studentLuis.setPicture("default.jpg");
        studentLuis.setEducation("High School");

    }

}
