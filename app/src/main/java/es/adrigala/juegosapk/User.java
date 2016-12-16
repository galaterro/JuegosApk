package es.adrigala.juegosapk;

/**
 * Created by juanxxiii on 16/12/2016.
 */

public class User {
    private String id;
    private String pass;
    private String name;

    public User(String id, String pass, String name) throws Exception {
        if(id.length() < 3){
            throw new Exception("El campo Id debe tener 3 caractéres mínimo");
        }else if(pass.length() > 8 && containsUpper(pass)){
            throw new Exception("El campo password debe tener 8 caractéres y una mayúscula");
        }else if(name.length() > 3){
            throw new Exception("El campo Nombre debe tener 3 caractéres mínimo");
        }
        this.id = id;
        this.pass = pass;
        this.name = name;
    }

    public boolean containsUpper(String word){
        char ch;
        boolean result = false;
        for (int i = 0; i < word.length(); i++) {
            ch = word.charAt(i);
            if(Character.isUpperCase(ch)){
                result = true;
            }
        }
        return result;
    }
}
