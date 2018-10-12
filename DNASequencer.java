import java.util.Set;
import java.util.TreeSet;
import java.util.LinkedList;
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
    
    /**A place to keep all the indexes of the pieces to be added in order**/
    private LinkedList indexes;
    
    
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
        
        //Creates the string for the resequenced DNA
        resequencedDNA = "";
        
        //Creates the LinkedList for the indexes of the DNA in order.
        indexes = new LinkedList();
    }
    
    /**
     * Method to reverse a string
     * @param String the string you want to reverse
     * @return String the reversed String
     */
    private String reverse(String rightways){
        String backwards = "";//String to put in backwards characters.
    }
    
    /**
     * Method to create set of the first part of the pieces as well as the index
     * @param none
     * @return none
     */
    private void starts(){
        //i is the index of the piece in pieces
        for (int i = 0; i < pieces.size; i++){
            //Takes the first three nucleotides and the index, put them in the set.
            start.add(pieces[i].substring(0,3) + " " + i);
        }
    }
    
    /**
     * Method to create the set of the last part of the array in reverse order and index
     * @param none
     * @return none
     */
    private void ends(){
        //i is index of the piece in pieces
        for (int i = 0; i < pieces.size; i++){
            end.add(pieces[i].charAt(
        }
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
