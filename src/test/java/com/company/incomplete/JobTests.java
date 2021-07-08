package com.company.incomplete;

import com.company.*;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JobTests {

    Job job1;
    Job job2;
    Job job3;


    @BeforeEach
    public void createJobObject() {
        job1 = new Job();
        job2 = new Job();
        job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    }

    // you can rename the tests, or delete them and rewrite them from scratch, but I went ahead and provided you the names of tests I created -- I followed the writeup pretty honestly
    @Test
    public void testSettingJobId() {
        System.out.println(job1.getId());
        System.out.println(job2.getId());
        //Assertions.assertNotEquals(job1, job2);
        Assertions.assertEquals(job2.getId(), job1.getId() + 1);

    }

    @Test
    public void testJobConstructorSetsAllFields() {
        System.out.println(job3.getEmployer().getValue());
        Assertions.assertEquals(job3.getName(), "Product tester");
        Assertions.assertEquals(job3.getEmployer().getValue(), "ACME");
        Assertions.assertEquals(job3.getLocation().getValue(), "Desert");
        Assertions.assertEquals(job3.getPositionType().getValue(), "Quality control");
        Assertions.assertEquals(job3.getCoreCompetency().getValue(), "Persistence");

    }

    @Test
    public void testJobsForEquality() {
        Assertions.assertNotEquals(job1, job2);
    }

    // I found the instructions around the three toString() tests a little confusing, so I created three tests following the three bullet points:
    // you can follow TDD if you want, or you can write the implementation first and then get the tests to pass, either is a fine approach
    @Test
    public void testToStringContainsBlankLines() {

    }

    @Test
    public void testToStringHasLabelsForEachField() {
        Assertions.assertEquals(job3.getName(), "Product tester");
        Assertions.assertEquals(job3.getEmployer().getValue(), "ACME");
        Assertions.assertEquals(job3.getLocation().getValue(), "Desert");
        Assertions.assertEquals(job3.getPositionType().getValue(), "Quality control");
        Assertions.assertEquals(job3.getCoreCompetency().getValue(), "Persistence");
    }

    @Test
    public void testToStringDataNotAvailable() {
        Job testJob = new Job("Software Eng. 1", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        String expectedToStringOutput =
                "ID: 0\n" +
                        "Name: Software Eng. 1\n" +
                        "Employer: Data not available\n" +
                        "Location: Data not available\n" +
                        "Position Type: Data not available\n" +
                        "Core Competency: Data not available\n";
        Assertions.assertEquals(expectedToStringOutput, testJob.toString());

    }}
