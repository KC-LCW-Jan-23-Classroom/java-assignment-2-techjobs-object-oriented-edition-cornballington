package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import javax.naming.Name;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    @Test
    public void testSettingJobId() {
        Job jobOne = new Job();
        Job jobTwo = new Job();
        assertNotEquals(jobOne.getId(), jobTwo.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields () {
        Job jobThree = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(jobThree instanceof Job);
        assertTrue(jobThree.getEmployer() instanceof Employer);
        assertTrue(jobThree.getLocation() instanceof Location);
        assertTrue(jobThree.getPositionType() instanceof PositionType);
        assertTrue(jobThree.getCoreCompetency() instanceof CoreCompetency);

        assertEquals("Product tester", jobThree.getName());
        assertEquals("ACME", jobThree.getEmployer().getValue());
        assertEquals("Desert", jobThree.getLocation().getValue());
        assertEquals("Quality control", jobThree.getPositionType().getValue());
        assertEquals("Persistence", jobThree.getCoreCompetency().getValue());


    }

    @Test
    public void testJobsForEquality() {
    Job jobOne = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    Job jobTwo = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(jobOne.getId() == jobTwo.getId());
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job jobOne = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String jobOneStr = jobOne.toString();
        assertEquals(jobOneStr.charAt(0), '\n');
        assertEquals(jobOneStr.charAt(jobOneStr.length()-1), '\n');
        }
        @Test
    public void testToStringContainsCorrectLabelsAndData() {
            Job jobOne = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
            String jobOneStr = jobOne.toString();
            String expectedStr = '\n' +
                    "ID: " + jobOne.getId() + '\n' +
                    "Name: " + "Product tester" + '\n' +
                    "Employer: " + "ACME" + '\n' +
                    "Location: " + "Desert" + '\n' +
                    "Position Type: " + "Quality control" + '\n' +
                    "Core Competency: " + "Persistence" + '\n';
            assertEquals(expectedStr, jobOneStr);
        }
        @Test
    public void testToStringHandlesEmptyField() {
            Job jobOne = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
            String jobOneStr = jobOne.toString();
            String expectedStr = '\n' +
                    "ID: " + jobOne.getId() + '\n' +
                    "Name: " + "Data not available" + '\n' +
                    "Employer: " + "Data not available" + '\n' +
                    "Location: " + "Data not available" + '\n' +
                    "Position Type: " + "Data not available" + '\n' +
                    "Core Competency: " + "Data not available" + '\n';
            assertEquals(expectedStr, jobOneStr);
        }
    }



