package day30_WrapperClass_ArrayList;

public class Notes {
	
	/*
	        // MuhtarMahmut - Git-Hub account:
	 

          Topics: Wrapper class,  
        ArrayList class,  
        Array vs ArrayList 
        
        
Package: day30_WrapperClass_ArrayList


WarmUp:  
    1. write a return method that accepts a String and removes duplicate values from the String
    Ex:
        RemoveDuplicate("aaabbbccc") ==> "abc"
        
        
    2. write a return method that accepts String and returns the unique values from the String
    Ex: 
            Unique("AABBCDEEE")  ==> "CD"
            
            
wrapper classes: 
        every primitives in java has a class that's designed to it
        
        primitives: byte, short, int, long, float, double, boolean, char
        
        wrapper classes: Byte, Short, Integer, Long, Float, Double, Boolean, Character

        all wrapper class presented in "java.lang" package
        
        String class is also presented in "java.lang" package
        
        All classes in package "java.lang" Imported by default
        
        
    Auto-boxing: converting primitive values to Wrapper class
    
    Un-boxing: converting wrapper class value to primitives
    
    
    default values of primitives:  
                    byte, short, int, long ==>0;
                    double, float ==> 0.0
                    boolean ==> false
                    char ==> space
                    
                    
    default value of wrapper class:  null
            
     if we do not give any objects to class (reference) null will be given by defualt
            
        String's default value is also null
        
        
useful methods of Wrapper class: 
                Max_Value:    returns the Maximum value
                
                Min_Value:    returns the Minimum value
                
                parse methods: converts string value to primitive values, 
                and its case sensitive
                
                ValueOfmethods: converts String values to Wrapper class values,
                 and its case sensitive

ArrayList class:
            1. presented in "java.uti" package 
            import java.util.ArrayList;
            
            2. Arraylist does not support primitives
            
            3. in ArrayList we store Objects ONLY, all the 
            values in ArrayList are objects (none primitives)
            
            4. ArrayList' size is automatically adjusted (dynamic)
            
            5. ArrayList is ordered (index numbers)
            
    Decleration of ArrayList:
           ArrayList<ClassType> variableName = new ArrayList<>();        
            
            
     methods of ArrayList:
         add(values):    adds value to ArrayList. if the value is primitive, 
                               will converts to wrapper class    
            
         get(IndexNum):  gets the specific values from 
                              ArrayList and returns it
         
         size():         returns the length (total number of
                              values) from the ArrayList
         
         clear():        Clears the array, removes all the values 
                               out from the ArrayList   
                     
 Sorting Array:
           Array.sort(variableName);                  
                     
                     
 Sorting the ArrayList:                              
           Collection.sort(variableName);                     
                               
 Collection class is presented in "Java.util" package                              
                               
                               
                               
  ArrayList vs Array: 
            1. Array's size is fixed, ArrayList's size is dynamic
            2. Array supports primitives and non-primitives,
                 ArrayList does not support primitives(accepts only non-primitives)                                 


    */
}
