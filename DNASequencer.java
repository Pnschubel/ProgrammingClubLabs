/**
 * Will sequence an array list of nucleotides with overlapping ends.
 * 
 * @Payton Schubel
 * @Created on 9/25/2018
 */
public class DNASequencer
{
    /** Each TreeSet holds all nucleotide pieces, one for front, one for back */
    private Set<String> starts;
    private Set<String> end;
 
    /**ArrayList of all of the DNA to sequence**/
    private ArrayList<String> pieces;
    /**Final resequenced DNA**/
    private String resequencedDNA;
    
    int CUTTOFF = 25; //The max amount of overlap we care about -- can alter if not enough
    
    /**
     * Initializes the DNASequencer()
     * @param ArrayList<String> -- the array list of all of the elements to sequence
     */
    public DNASequencer(ArrayList<String> parts)
    {
        // initialise all of the Sets -- using treeSets for alphabet purposes
        start = new TreeSet();
        end = new TreeSet();     
        //Gets the DNA pieces
        pieces = parts;
    }

    /**
     * Method to put all of the relevant part of the nucleotide sequences into start - end trees.
     * @param none
     * @return none
     */
    private void sortPieces(){
        int index = 0; //The index of the part of
    }

}
