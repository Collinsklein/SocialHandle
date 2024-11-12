import handle.SocialHandle;
import org.junit.jupiter.api.Test;
/*
Imports the JUnit library to enable testing. Test is an annotation to mark methods as tests,
while Assertions provides assertion methods to validate test results.
 */

import static org.junit.jupiter.api.Assertions.*;

public class SocialHandleTest {
    //Defines a test class named SocialHandleTest that will contain test methods for the SocialHandle class.


        @Test
        public void createHandleTest() {
            //Marks createHandleTest as a test method and creates an instance of SocialHandle to test.


            SocialHandle sh = new SocialHandle();
            String handle = sh.createHandle("@collins");
            assertNotNull(handle);
            assertTrue(sh.getHandles().contains("@collins"));
            //Calls createHandle with the handle "@collins" and
            // checks that the result isn’t null (indicating the handle was added successfully) and that listOfHandles contains "user123".

        }

        @Test
        public void checkHandleLessThan9CharactersTest() {
            SocialHandle sh = new SocialHandle();
            String handle = sh.createHandle("@collins7"); // Exactly 9 characters
            assertNotNull(handle);
            handle = sh.createHandle("@collins37"); // More than 9 characters
            assertNull(handle);
            //Checks that a handle with exactly 9 characters is allowed and
            // a handle with more than 9 characters is rejected.
            // The first assertion expects the handle to be added, while the second expects null because the handle is too long.

        }

        @Test
        public void checkEmptyOrBlankCharactersTest() {
            SocialHandle sh = new SocialHandle();
            assertNull(sh.createHandle("")); // Empty string
            assertNull(sh.createHandle("   ")); // Blank string
            //Tests if createHandle rejects empty and blank handles by checking that it returns null for both cases.
        }


        @Test
        public void addHandleTest() {
            SocialHandle sh = new SocialHandle();
            sh.addHandle("@collins");
            sh.addHandle("@collins"); // Attempting to add again
            assertEquals(1, sh.getHandles().size()); // Should only add once
            //Ensures that adding the same handle multiple times results in only one entry by checking the size of listOfHandles.
        }


        @Test
        public void removeHandleTest() {
            SocialHandle sh = new SocialHandle();
            sh.addHandle("@collins");
            sh.removeHandle("@collins");
            assertFalse(sh.getHandles().contains("@collins"));
        }
        //Verifies that removeHandle successfully removes a handle by asserting that listOfHandles no longer contains it after removal.

}
