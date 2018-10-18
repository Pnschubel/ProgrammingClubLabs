import java.util.Set;
import java.util.TreeSet;
import java.util.LinkedList;
import java.util.ArrayList;
/**
 * Will sequence an array list of nucleotides with overlapping ends.
 * 
 * @Payton Schubel
 * @Created on 9/25/2018
 */
public class DNASequencer
{
    /** Each TreeSet holds all nucleotide pieces, one for front, one for back */
    private Set<String> start;
    private ArrayList<String> end; //This is an array list because I want to affect the order
 
    /**ArrayList of all of the DNA to sequence**/
    private ArrayList<String> pieces;
    /**Final resequenced DNA**/
    private String resequencedDNA;
    
    /**A place to keep all the indexes of the pieces to be added in order**/
    private LinkedList indexes;
    
    /**The Max amount of overlap we care about (in this case, I'm going to say 50, but that's large)*/
    private int CUTOFF = 50;
    
    
    /**
     * Initializes the DNASequencer()
     * @param ArrayList<String> -- the array list of all of the elements to sequence
     */
    public DNASequencer(ArrayList<String> parts)
    {
        // initialise all of the Sets -- using treeSets for alphabet purposes
        start = new TreeSet();
        end = new ArrayList();     
        //Gets the DNA pieces
        pieces = parts;
        
        //Creates the string for the resequenced DNA
        resequencedDNA = "";
        
        //Creates the LinkedList for the indexes of the DNA in order.
        indexes = new LinkedList();
    }
    
    /**
     * Method to create set of the first part of the pieces as well as the index
     * @param none
     * @return none
     */
    private void starts(){
        //i is the index of the piece in pieces
        for (int i = 0; i < pieces.size(); i++){
            //Takes the first three nucleotides and the index, put them in the set.
            start.add(pieces.get(i).substring(0,CUTOFF) + " " + i);
        }
    }
    
    /**
     * Method to create the set of the last part of the array in reverse order and index
     * @param none
     * @return none THIS IS USELESS IT IS THE END OF THE STRING.
     */
    private void ends(){
        int length; //length of the sequence
        //i is index of the piece in pieces
        for (int i = 0; i < pieces.size(); i++){
            length = pieces.get(i).length();
            //Takes the last three nucleotides and the index, put in set.
            end.add(pieces.get(i).substring(length-CUTOFF, length) + " " + i);
        }
    }

    /**
     * Method to put all of the relevant part of the nucleotide sequences into start - end trees.
     * @param none
     * @return none
     */
    private void sortPieces(){
        this.starts();
        this.ends();
    }
    
    /**Method to resequence all of the DNA nucleotides
       @param none
       @return String the resequenced DNA*/
    
    private String resequence(){
        String part; //A piece of overlap used to narrow down possibilites
        ArrayList<Integer> possibilities = new ArrayList(); //An array list of possibilty's integers
        this.sortPieces();
        
        for (String element : start){
            //Narrows down the possibilities by only focusing on a minor piece of overlap
            part = element.substring(0,5);
            
            //Goes through the entirety of the ends (I couldn't figure out better way)
            //Looks for the part of overlap
            for (int i  = 0; i < end.size(); i++){
                if (end.get(i).contains(part)){
                    //If does contain segment, adds the index of the string to possibilities
                    possibilities.add((int)end.get(i).charAt(end.get(i).length()));
                }
            }
            
        }
        
        return "";
    }

}
