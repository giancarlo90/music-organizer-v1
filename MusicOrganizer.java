import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<String>();
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(index >= 0 && index < files.size()) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(index >= 0 && index < files.size()) {
            files.remove(index);
        }
    }
    
    /**
     * Comprueba si se trata de un indice valido, teniendo en cuenta el tamaño
     * de la coleccion.
     */
    public void checkIndex(int checkNumber)
    {
        if(checkNumber < 0 || checkNumber > files.size() -1){
        System.out.println("Error, el rango valido de valores es entre 0 y " + (files.size() - 1));
        } 
    }
    
        /**
     * Version alternativa si se trata de un indice valido, teniendo en cuenta el tamaño
     * de la coleccion.
     */
    public boolean validIndex(int checkNumber)
    {
        boolean checked = false;
        if(checkNumber >= 0 && checkNumber <= files.size() -1 && files.size() != 0){
        checked = true;
        } 
        return checked;
    }
}
