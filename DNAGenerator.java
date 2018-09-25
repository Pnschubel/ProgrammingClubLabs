import java.util.Collections;
import java.util.ArrayList;
/**
 * Will Generate a DNA sequence, split the sequence into pieces, and shuffle the resulting pieces
 * (Setup for the shotgun sequencing)
 * 
 * @Payton
 * @9/24/2018
 * @Programming Club: Lab 1
 */
public class DNAGenerator
{
    /**String[] NUCLEOTIDES - the possible nucleotides in DNA sequence
     * String sequence - the sequence of DNA nucleotides 
     * int THRESHHOLD - the minimum size of a piece of overlap 
     * int MINSIZE - the minimum size of the sequence
     * int MAXSIZE - the maximum size of the sequence
    */
    private String[] NUCLEOTIDES = {"A","T","C","G"};
    private String sequence;
    int THRESHHOLD = 10;
    int MINSIZE = 1500;
    int MAXSIZE = 3000;

    /**
     * Default constructor for objects of class DNAGenerator
     */
    public DNAGenerator()
    {
        // initialise instance variables
        sequence = "";
        this.getDNA();
    }

    /**
     * A method to create the new DNA sequence
     * @post    sequence will be string from 1000-2000 base pairs of only A, G, T, C
     * @param   none
     * @return  none
     */
    private void getDNA()
    {
        /*
         * int size = the overall size of the DNA sequence (between 
         * int pickBase = index of chosen nucleotide (0-3);
         */
        int size = (int)((Math.random() * MINSIZE) + (MAXSIZE - MINSIZE));
        int pickBase;
        
        //Fills up the sequence with nucleotides
        for (int i = 0; i < size; i++){
            //For every element desired, gets element into sequence
            pickBase = (int)(Math.random() * 4);
            sequence += NUCLEOTIDES[pickBase];
        }
    }

    /**
     * A method to break up the DNA sequence into the pieces array
     *      Subsequently shuffles the array into chunks ~70 long.
     *      Will be somewhere between 10 and 25 pieces overlap per side.
     * @pre String[] pieces is empty
     * @param none
     * @return ArrayList<String> the pieces of the DNA
     */
    public ArrayList<String> breakDNA(){
        int start = 0; //Location along the sequence where chunk starts.
        int end = (int)(Math.random() * 51 + 39); // end location of chunk: gives it size from 51-90
        ArrayList<String> pieces = new ArrayList(); // what we hold pieces of DNA in
        
        //Goes through sequence
        //Means that the end segment of DNA will have at least THRESHHOLD unique
        //nucleotides at its end.
        while (end < sequence.length() - THRESHHOLD){
            //Adds the new piece of DNA to the pieces.
            pieces.add(sequence.substring(start, end));
            
            //Updates the start and end coordinates
            //The bit at the end guarentees at least THRESSHOLD bit overlap
            start = end - (int)(Math.random() * 15 + THRESHHOLD);
            //Little bit less variable than original end due to overlap
            //So we made it a bit shorter.
            end += (int)(Math.random() * 26 + 39);
        }
        //Gets the remaining nucleotides into the pieces array
        pieces.add(sequence.substring(start, sequence.length()));
        
        //shuffles the array
        Collections.shuffle(pieces);
        System.out.println(pieces);
        System.out.println(sequence);
        System.out.println(pieces.size());
        System.out.println(sequence.length());
        
        //Returns the pieces array
        return pieces;
    }
    
    /**
     * Checks to see if the given nucleotide sequence is the same at the true sequence
     * @param String a sequence of nucleotides to compare to the true sequence
     * @return boolean whether or not the strings match
     */
    public boolean isSequence(String falseSequence){
        return sequence.equals(falseSequence);
    }
    
    /**
     * Gives the size of the Threshhold of overlap
     * @param none
     * @return int the minimum amount of overlap of the sequence
     */
    public int getThreshhold(){
        return THRESHHOLD;
    }
}
/*
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
*/
