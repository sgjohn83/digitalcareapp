/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package serviceportal;
import java.io.*;
/**
 *
 * @author sgjohn
 */
public class BackupFile {
private String file;
private FileWriter fw;
public BackupFile(String f)
{
    file=f;
}

public void writeFile(String str)
{
    try
    {
        fw= new FileWriter(file);
        fw.write(str+";\n");
        fw.close();

    }
    catch(Exception e)
    {
        e.printStackTrace();
    }


}

}
