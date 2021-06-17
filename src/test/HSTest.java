package test;

import com.caucho.hessian.client.HessianProxyFactory;
import xinchen.service.IService;

import java.net.MalformedURLException;

public class HSTest {
    public static void main(String[] args) throws MalformedURLException {
//        String url = "http://localhost:8080/HessianServer/api/service";
        String url = "http://127.0.0.1:8080/web/api/service";

        HessianProxyFactory factory = new HessianProxyFactory();
        IService api = (IService) factory.create(IService.class, url);
        System.out.println(api.getUser());


    }
}
