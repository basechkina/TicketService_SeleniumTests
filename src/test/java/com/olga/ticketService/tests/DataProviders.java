package com.olga.ticketService.tests;

import com.olga.ticketService.model.User;
import org.testng.annotations.DataProvider;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProviders {

    @DataProvider
    public Iterator<Object[]> requiredFieldsCSV() throws IOException {
        List<Object[]> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(
                new File("src/test/resources/requiredFieldsCSV.csv")));
        String line = reader.readLine();
        while (line != null) {
            String[] split = line.split(",");
            list.add(new Object[]{
                    new User()
                            .withUserName(split[0])
                            .withUserSurname(split[1])
                            .withEmail(split[2])
                            .withPassword(split[3])
                            .withPassword(split[4])
                            .withPhoneNumber(split[5])});

            line = reader.readLine();
        }
        return list.iterator();
    }

}

