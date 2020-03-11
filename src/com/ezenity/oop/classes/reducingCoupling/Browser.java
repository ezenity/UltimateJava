package com.ezenity.oop.classes.reducingCoupling;

/**
 * Reducing Coupling
 * <p>
 * Since both "sendHttpRequest" & "findIpAddress" are detailed methods pertaining to this class we
 * went ahead and made the methods private. This makes the usage for this class cleaner and easier to utilize
 * with the interface.
 */
public class Browser {
    public void navigate(String address){
        String ip = findIpAddress(address);
        String html = sendHttpRequest(ip);
        System.out.println(html);
    }

    private String sendHttpRequest(String ip) {
        return "<html><body></body></html>";
    }

    private String findIpAddress(String address) {
        return "127.0.0.1";
    }
}
