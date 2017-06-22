package com.pluralsight.gettraining;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Patient {

        public String name;
        public String lastname;
        public Date birthdate;
        public String phone;
        public String city;
        public String email;
        public List<Patient> patientList = new ArrayList<Patient>();

        public void addPatient(Patient patient)
        {
            patientList.add(patient);
        }

        // SELECT (NOMBRE)
    // UPDATE (PAC)
    // DELETE (NOMBRE)


    }






