import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookieStore;
import java.net.HttpCookie;
public class pro10 {
 public static void main(String[] args) {
 // Create a new CookieManager
 CookieManager cookieManager = new CookieManager();
 CookieHandler.setDefault(cookieManager);
 // Create a cookie
 HttpCookie cookie = new HttpCookie("EMPID", "AN2356");
 // Get the default cookie store
 CookieStore cookieStore = cookieManager.getCookieStore();
 // Add the cookie to the store
 cookieStore.add(null, cookie);
 // Read and display the value of the cookie
 String empId = null;

 for (HttpCookie storedCookie : cookieStore.getCookies()) {
 if (storedCookie.getName().equals("EMPID")) {
 empId = storedCookie.getValue();
 break;
 }
 }
 // Display the value of the EMPID cookie
 if (empId != null) {
 System.out.println("Value of EMPID cookie: " + empId);
 } else {
 System.out.println("EMPID cookie not found");
 }
 }
}
