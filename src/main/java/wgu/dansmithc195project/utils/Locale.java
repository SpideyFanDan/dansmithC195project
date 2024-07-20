package wgu.dansmithc195project.utils;
import java.time.ZoneId;

/**This is the class with methods for getting and setting user system default locale information.*/
public class Locale {
    public static java.util.Locale locale;
    public static ZoneId zoneId = ZoneId.systemDefault();

    /**This is the setter for the user's locale*/
    public static void setLocale() { locale = java.util.Locale.getDefault(); }

    /**This is the setter for the user's zoneId
     * @param zoneId
     */
    public static void setZoneId(ZoneId zoneId) { Locale.zoneId = zoneId; }

    /**This is the getter for the user's locale
     * @return locale
     */
    public static java.util.Locale getLocale() { return locale; }

    /**This is the getter for the user's zoneId
     * @return zoneId
     */
    public static ZoneId getZoneId() { return zoneId; }
}
