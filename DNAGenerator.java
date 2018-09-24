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
     * String[] pieces - pieces of the DNA sequence
     * int THRESHHOLD - the minimum size of a piece of overlap 
    */
    private String[] NUCLEOTIDES = {"A","T","C","G"};
    private String sequence;
    private String[] pieces;
    int THRESHHOLD = 10;

    /**
     * Default constructor for objects of class DNAGenerator
     */
    public DNAGenerator()
    {
        // initialise instance variables
        sequence = "";
        pieces = new String[];
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
        int size = (int)((Math.random() * 1000) + 1001);
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
     * @return none
     */
    private void breakDNA(){
        int start = 0; //Location along the sequence where chunk starts.
        int end = (int)(Math.random() * 39 + 51); // end location of chunk: gives it size from 51-90
        
        while (end != sequence.length() -1 ){
        //FINSIH LATER.
        }
        
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
