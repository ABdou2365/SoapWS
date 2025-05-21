package ws;


import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebService(serviceName = "bankWS")
public class BanqueService {

    @WebMethod(operationName = "ConvertFromDhToEuro")
    public double convert(@WebParam(name = "amount") double amount) {
        return amount * 10;
    }

    @WebMethod
    public Compte getAccount(@WebParam(name = "code")int code) {
        return new Compte(code,Math.random()*1000,new Date());
    }

    @WebMethod
    public List<Compte> getAccounts() {
        List<Compte> accounts = new ArrayList<Compte>();
        accounts.add(new Compte(1,Math.random()*1000,new Date()));
        accounts.add(new Compte(2,Math.random()*1000,new Date()));
        accounts.add(new Compte(3,Math.random()*1000,new Date()));
        return accounts;
    }


}
