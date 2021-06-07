package Exc4;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TransferObject {

    /** Transfers content from one stream to another.
     * @param in is Input Stream object.
     * @param out is Output Stream object.
     * @param offset is the displacement we want to do.
     * @param size is the  size of the Stream we want to transfer.*/
    public static void transfer(InputStream in, OutputStream out, int offset, int size) throws IOException
    {
        // Read bytes and write to destination until eof
        byte[] buf = new byte[size];
        System.out.println("What is it here?\n"+buf);
        int lengthBuff = in.read(buf);
        System.out.println("The length is: "+lengthBuff);
        while (lengthBuff != 0)
        {
            out.write(buf, 0, lengthBuff);
        }
        System.out.println("End!");
    }
}
