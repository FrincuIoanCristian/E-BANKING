package validator;

import model.Client;

import java.util.List;

public class Validators {
    public boolean phoneValidate(String phone, List<Client> clients){
        for(Client client: clients){
            if(client.isPhone_number().equals(phone)){
                return false;
            }
            if(phone.length() < 10 || phone.length() > 10){
                return false;
            }
        }
        if(phone.charAt(0) != '0' || phone.charAt(1) != '7'){
            return false;
        }
        for(char c : phone.toCharArray()){
            if(!Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }
    public boolean passwordValidate(String password, String confirmPassword){
        if(!password.equals(confirmPassword)){
            return false;
        }
        if(password.length() < 8){
            return false;
        }
        return true;
    }
    public boolean emailValidator(String email, List<Client> clients){
        for(Client client:clients) {
            if(client.getEmail().equals(email)) {
                return false;
            }
        }
        int atIndex = email.indexOf('@');
        if (atIndex == -1) {
            return false;
        }
        if (atIndex == 0) {
            return false;
        }
        String domain = email.substring(atIndex + 1);
        return "yahoo.com".equals(domain) || "gmail.com".equals(domain);
    }
}
