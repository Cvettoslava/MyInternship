package Exc5;

import java.io.*;

public class DataClass {

    /**
     * Saves the provided object "o" in the output stream.
     * @param out is the Output stream where we want to save the data.
     * @param o is the provided object we want to save.
     */
    public void saveObject(OutputStream out, Object o) throws IOException {
        ObjectOutputStream objOut = new ObjectOutputStream(out);

        objOut.writeObject(o);
        objOut.close();
        System.out.printf("Serialized data is saved in 'ObjInformation.txt' ");
    }
    /**
     * Reads an object from the provided InputStreams and returns it as result.
     * @param in is the provided InputStreams where we get the data from.
     * @return the read object as result.
     */
    public Object getObject(InputStream in) throws IOException, ClassNotFoundException {
        ObjectInputStream objIn = new ObjectInputStream(in);
        Object obj = objIn.readObject();
        System.out.println("\nThe Object has been read from the file");
        return obj;
    }
}
