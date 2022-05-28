package com.dejerz.workersuscriptionsmanagement.core.entity;

import javax.swing.*;
import java.util.Date;

public class Applicant extends Person{
    private String fileNumber;
    private String cui;
    private String status;
    private Date testDate;

    public String getFileNumber() {
        return fileNumber;
    }

    public void setFileNumber(String fileNumber) {
        int position = fileNumber.indexOf("-");
        if(position > 0){
            if(fileNumber.substring(0,1).equals("F")){
                if(fileNumber.substring(2,6).equals("2022")){
                    this.fileNumber = fileNumber;
                } else {
                    this.fileNumber = "";
                }
            } else {
                this.fileNumber = "";
            }
        } else {
            this.fileNumber = "";
        }

    }

    public String getCui() {
        return cui;
    }

    public void setCui(String cui) {
        this.cui = cui;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getTestDate() {
        return testDate;
    }

    public void setTestDate(Date testDate) {
        this.testDate = testDate;
    }

    @Override
    public void sendPersonalInformationByEmail(String message) {
        System.out.println(message);
    }
}
