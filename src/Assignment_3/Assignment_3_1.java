/**
 * 
 */
package Assignment_3;																												// package declaration

/**
 * 
 * All the comments in the program are placed on the Right-Hand-Side.
 * I have tried to explain the difference between Between Static Variables and Instance Variables 
 * by creating objects inside the Assignment_3 class and by creating two other classes InstanceVariable & StaticVariable
 * @author Sahil Khurana <sahilkhurana369@gmail.com>
 */

public class Assignment_3_1 {																										// Proper naming conventions is used for Class Declaration
	static int mainClassStaticVariable = methodStaticVariables();																	// Static Integer (Variable) mainClassStaticVariable is Declared and assigned a value equal to method methodStaticVariables
    static int methodStaticVariables() {																							// Static Method methodStaticVariables Declared  
        System.out.println("Below Results will show you the Difference Between Static Variables and Instance Variables :-\n" +		// This will print out the argument in the next line
                            "\nStatic Variable are Initialized when the program starts."+
                            "\nThey are automatically assigned the Memory. This means that, They are independent of object." +
                            "\nStatic Variable are Destroyed when the program stops.\n ");
        return 0;																													// if condition is not true then it will print the argument otherwise the method will return zero
    }																																// Method methodStaticVariables closed 
    int mainClassInstanceVariable = methodInstantVariable();																		// Integer (Variable) mainClassInstanceVariable is Declared and assigned a value equal to method methodInstantVariable
    int methodInstantVariable() {																									// Integer Method methodStaticVariables Declared  
        System.out.println("\nInstance Variable are Initialized when an instance of class is created with new."+					// This will print out the argument in the next line
                           "\nThey are not assigned any Memory until an object is created in the Main Method "+
                           "\nInstance Variables are Destroyed when there are no more references to enclosing object "+
                            "(made available for garbage collection).");
        return 0;																													// if condition is not true then it will print the argument otherwise the method will return zero
    }																																// Method mainClassInstanceVariable closed
    public static void main(String[] args) {																						// Main methods Starts
    	StaticVariable object1=new StaticVariable();																				// object is created to call variables from StaticVariable class
        object1.displayMyStaticVariable();																							// Method displayMyStaticVariable is invoked by assigning the object to the method
        System.out.println("Reason for above output - Static Variable Original Value of 100 remains same when object is simply displayed\n"); // This will print out the argument in the next line

        StaticVariable object2=new StaticVariable();																				// object is created to call variables from StaticVariable class
        ++object2.myStaticVariable;																									// object is assigned a increment operator 
        object1.displayMyStaticVariable();																							// Method displayMyStaticVariable is invoked by assigning the object to the method
        System.out.println("Reason for above output - Static Variable Original Value of 100 is incremented by 1, when increment operator is assigned to object\n"); // This will print out the argument in the next line

        StaticVariable object3=new StaticVariable();																				// object is created to call variables from StaticVariable class
        object3.displayMyStaticVariable();																							// Method displayMyStaticVariable is invoked by assigning the object to the method
        System.out.println("Reason for above output - Static Variable Original Value of 100 is increment by 1, Even when object is simply displayed without any increment operator"+  // This will print out the argument in the next line
                           "\nThis is because Static variable has a single copy is the memory and the same value is shared by all objects");

        Assignment_3_1 Object4=new Assignment_3_1();																				// a constructor is created to invoke the Instance Variable stored in the memory 

        InstanceVariable object5=new InstanceVariable();																			// object is created to call variables from InstanceVariable class
        object5.displayMyInstanceVariable();																						// Method displayMyInstanceVariable is invoked by assigning the object to the method
        System.out.println("Reason for above output - Instance Variable Original Value of 100 remains same when object is simply displayed"); // This will print out the argument in the next line

        InstanceVariable object6=new InstanceVariable();																			// object is created to call variables from InstanceVariable class
        ++object6.myInstanceVariable;																								// object is assigned a increment operator
        object6.displayMyInstanceVariable();																						// Method displayMyInstanceVariable is invoked by assigning the object to the method
        System.out.println("Reason for above output - Instance Variable Original Value of 100 is incremented by 1, when increment operator is assigned to object");	// This will print out the argument in the next line
    }																																// Main methods closed
}																																	// Assignment_3_1 class closed
