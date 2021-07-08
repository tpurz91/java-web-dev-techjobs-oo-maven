package com.company.incomplete;

import com.company.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class JobTests {

    Job job1;
    Job job2;
    Job job3;


    @BeforeAll
    public void createJobObject() {
        job1 = new Job();
        job2 = new Job();
        job3 = new Job("Product tester", new Employer("ACME"), new  Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    }

    // you can rename the tests, or delete them and rewrite them from scratch, but I went ahead and provided you the names of tests I created -- I followed the writeup pretty honestly
    @Test
    public void testSettingJobId() {
        Assertions.assertFalse(job1.equals(job2));
        Assertions.assertEquals(job1.getId(), job2.getId() + 1);

    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Assertions.assertEquals(job3.getName(), "Product tester");
        Assertions.assertEquals(job3.getEmployer(), "ACME");
        Assertions.assertEquals(job3.getLocation(), "Desert");
        Assertions.assertEquals(job3.getPositionType(), "Quality control");
        Assertions.assertEquals(job3.getCoreCompetency(), "Persistence");

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

    }

    @Test
    public void testToStringDataNotAvailable() {

    }
}
