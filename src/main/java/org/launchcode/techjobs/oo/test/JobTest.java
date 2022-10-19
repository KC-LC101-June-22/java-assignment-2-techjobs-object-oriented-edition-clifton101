package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import org.launchcode.techjobs.oo.*;
// took corecompetency off and added *

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertEquals;
//had to added import static for all assert declared above.

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    public JobTest(){
        return JobTest;
    }

    @Test
    public void testSettingJobId(){
        Job Job1 = new Job();
        Job Job2 = new Job();
        assertNotEquals(Job1.getId(), Job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job Job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(Job3.getString() instanceof String);
        assertTrue(Job3.getEmployer() instanceof Employer);
        assertTrue(Job3.getLocation() instanceof Location);
        assertTrue(Job3.getPositionType() instanceof PositionType);
        assertTrue(Job3.getCoreCompetency() instanceof CoreCompetency);

        assertEquals()
    }




}
