package main.learningjava.oop.encapsulation;

public class Browser {
    public void navigate(String address) {
        var ip = findIpAddress(address);
        var html = sendHttpRequest(ip);
        System.out.println(html);
    }
    private String findIpAddress(String address) {
        return "127.01.01";
    }
    private String sendHttpRequest(String ip) {
        return "<html></html>";
    }
}
