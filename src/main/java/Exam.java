import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.AllArgsConstructor;


class Factory {
    private String factoryName;
    private static Factory instance;

    private Factory(String factoryName) {
        this.factoryName = factoryName;
    };

    public static Factory getInstance(String factoryName) {
        if(instance == null) {
            instance = new Factory(factoryName);
        }
        return instance;
    }


}



@AllArgsConstructor
class Company {
    private int companyId;
    private String companyName;
    private String address;
    private String city;
    private String state;
    private String zipCode;
}



public class Exam {
    public static void main(String[] args) {
        Company company = new Company(100, "Apple", "Apple Computer Inc. 1 infinite Loop", "Cupertino", "CA", "95014");

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonData = gson.toJson(company);
        System.out.println(jsonData);




    }
}
