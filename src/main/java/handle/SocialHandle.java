package handle;

import java.util.HashSet;
/*
Imports the HashSet class from the Java Collection Framework,
which allows us to store a unique set of items, ensuring there are no duplicates.
 */

public class SocialHandle { //Defines a public class called SocialHandle.
    // This class will contain methods to manage social media handles.

    private HashSet<String> listOfHandles = new HashSet<>();
    //Declares a private variable, listOfHandles, of type HashSet<String>,
    // which stores unique strings representing social media handles.
    // We use a HashSet to ensure each handle is unique (duplicates aren’t allowed).

   //Default Constructor
    public SocialHandle() {
        //This is my default constructor
    }

    //Cnstructor
    public SocialHandle(HashSet<String> listOfHandles) {
        this.listOfHandles = listOfHandles;
    }

    // Method to create a social media handle
        public String createHandle(String yourSocialHandle) {
        //Declares a method called createHandle that takes a string parameter, yourSocialHandle.
            // This method is meant to add a handle to listOfHandles with certain constraints and return it if successfully added.
            // Check if handle is empty or blank



            //Checks if yourSocialHandle is null or only whitespace.
            // If so, it returns null, indicating the handle was invalid and wasn’t added.
            if (yourSocialHandle == null || yourSocialHandle.trim().isEmpty()) {
                return null;
            }



            //Checks if the handle is longer than 9 characters or less.
            // If it is, the method returns null, enforcing the character limit.
            if (yourSocialHandle.length() > 9) {
                return null;
            }


            // Add the handle and return it if it was added
            //Attempts to add the handle to listOfHandles.
            // The add method in HashSet returns true if the handle was added successfully
            // (i.e., it wasn’t already in the set). If successful, it returns yourSocialHandle.
            if (listOfHandles.add(yourSocialHandle)) {
                return yourSocialHandle;
            }
            return null;
            //If the handle couldn’t be added (e.g., it was a duplicate), the method returns null
        }



        // Method to add a handle
    //Defines the addHandle method, which adds yourSocialHandle to listOfHandles without any conditions or return value.
        // If it’s a duplicate, it won’t be added due to HashSet’s unique element constraint.
        public void addHandle(String yourSocialHandle) {
            listOfHandles.add(yourSocialHandle);
        }


        // Method to remove a handle
    //Defines the removeHandle method, which removes yourSocialHandle from listOfHandles if it exists.
        public void removeHandle(String yourSocialHandle) {
            listOfHandles.remove(yourSocialHandle);
        }

    public HashSet<String> getListOfHandles() {
        //Getter for list of handles - Shows the current listOfHandles that are in the set
        return listOfHandles;
    }

    public void setListOfHandles(HashSet<String> listOfHandles) {
        //Setter for ListOfHandles
        this.listOfHandles = listOfHandles;
    }



    // Method to get the set of handles
        public HashSet<String> getHandles() {
            return listOfHandles;
            //Defines the getHandles method, which returns the current set of handles in listOfHandles.
        }

}
