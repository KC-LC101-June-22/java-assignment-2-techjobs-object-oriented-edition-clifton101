package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import org.launchcode.techjobs.oo.*;
// took corecompetency off and added *
import static org.junit.Assert.*;

//had to added import static for all assert declared above.

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    public JobTest(){
  //      return JobTest;
    }

    @Test
    public void testSettingJobId(){
        Job Job1 = new Job();
        Job Job2 = new Job();
        assertNotEquals(Job1.getId(), Job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job3.getName() instanceof String);
        assertTrue(job3.getEmployer() instanceof Employer);
        assertTrue(job3.getLocation() instanceof Location);
        assertTrue(job3.getPositionType() instanceof PositionType);
        assertTrue(job3.getCoreCompetency() instanceof CoreCompetency);

        assertEquals("Product tester", job3.getName());
        assertEquals("ACME", job3.getEmployer().getValue());
        assertEquals("Desert", job3.getLocation().getValue());
        assertEquals("Quality control", job3.getPositionType().getValue());
        assertEquals("Persistence", job3.getCoreCompetency().getValue());

    }

    @Test
    public void testJobsForEquality() {
        Job job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(job4.equals(job5));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job6 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String jobString = job6.toString();
        char nTest = '\n';
        assertEquals(nTest, jobString.charAt(0));
        //System.out.println(jobString.charAt(jobString.length()-1));
        assertEquals(nTest, jobString.charAt(jobString.length()-1));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job7 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String list7 = "\n" + "ID: " + job7.getId() + "\n" +
                "Name: " + job7.getName() + "\n" +
                "Employer: " + job7.getEmployer() + "\n" +
                "Location: " + job7.getLocation() + "\n" +
                "PositionType: " + job7.getPositionType() + "\n" +
                "CoreCompetency: " + job7.getCoreCompetency() + "\n";
        assertEquals(list7, job7.toString());
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job job8 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String list8 = "\n" + "ID: " + job8.getId() + "\n" +
                "Name: " + job8.getName() + "\n" +
                "Employer: " + job8.getEmployer() + "\n" +
                "Location: " + job8.getLocation() + "\n" +
                "PositionType: " + job8.getPositionType() + "\n" +
                "CoreCompetency: " + job8.getCoreCompetency() + "\n";
        assertEquals(list8, job8.toString());
    }

}
