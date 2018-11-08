package wrapped;
import java.util.Scanner;
public class MAIN {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        IpAddressSearchWebService service = new IpAddressSearchWebService();
        IpAddressSearchWebServiceSoap soap = service.getIpAddressSearchWebServiceSoap();
        System.out.println("please write the ip:");
        String ip = sc.nextLine();
        ArrayOfString address = soap.getCountryCityByIp(ip);
        System.out.println(address.getString());
     }
}
