/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package serviceportal;

/**
 *
 * @author sgjohn
 */
public class StringTrim {
    public static String trim(StringBuilder s,char toTrim)
    {
        int orignalLen=s.length();
        int len = s.length();
        int st=0;
        while((st<len)&&(s.charAt(st)==toTrim))
        {
            st++;
        }
        while((st<len)&&(s.charAt(len-1)==toTrim))
        {
            len--;
        }
        return ((st>0) || (len<orignalLen)) ? s.substring(st,len) : s.toString();
    }

}
