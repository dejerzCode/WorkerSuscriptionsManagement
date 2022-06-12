package com.dejerz.workersuscriptionsmanagement;

import com.dejerz.workersuscriptionsmanagement.core.entity.Applicant;
import com.dejerz.workersuscriptionsmanagement.core.entity.Person;
import com.dejerz.workersuscriptionsmanagement.core.entity.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Date;

@SpringBootApplication
public class WorkerSubscriptionsManagementApplication implements CommandLineRunner {

    //Careful with the version
    private final Logger logger = LoggerFactory.getLogger(WorkerSubscriptionsManagementApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(WorkerSubscriptionsManagementApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        ArrayList<Applicant> listApplicants = new ArrayList<Applicant>();
        ArrayList<Student> listStudents = new ArrayList<Student>();
        ArrayList<Person> listPeople = new ArrayList<Person>();

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
        studentLuis.setId("F-2022002");
        studentLuis.setLastName("Garcia");
        studentLuis.setFirstName("Luis");
        studentLuis.setAddress("Guatemala, Guatemala");
        studentLuis.setPhoneNumber("25252525");
        studentLuis.setPicture("default.jpg");
        studentLuis.setEducation("High School");

        //Polymorphism
        Person personPedro = new Student();
        ((Student)personPedro).setId("F-2022003");
        personPedro.setLastName("Rodriguez");
        personPedro.setFirstName("Pedro");
        personPedro.setAddress("Guatemala, Guatemala");
        personPedro.setPhoneNumber("25252525");
        ((Student)personPedro).setPicture("default.jpg");
        ((Student)personPedro).setEducation("High School");

        listApplicants.add(applicantJuan);
        listStudents.add(studentLuis);
        listPeople.add(applicantJuan);
        listPeople.add(studentLuis);
        listPeople.add(personPedro);

        for(Person p : listPeople){
            if(p instanceof Student){
                logger.debug("ID: "+((Student) p).getId() + " Name: "+ p.getFirstName() + " " + p.getLastName());
            } else if (p instanceof Applicant){
                logger.debug("File number: "+((Applicant) p).getFileNumber() + " Name: "+ p.getFirstName() + " " + p.getLastName());
            }
            p.takeAttendance();
        }

    }
}
