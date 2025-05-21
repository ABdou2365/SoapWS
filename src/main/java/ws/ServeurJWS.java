package ws;

import jakarta.xml.ws.Endpoint;

public class ServeurJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:2727/JWS", new BanqueService());
    }
}