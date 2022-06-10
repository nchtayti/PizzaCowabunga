package fr.eni.pizza.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.util.Base64;


public class Base64Converter {
	
	static String encodeFileToBase64Binary(String pathname){
        String encodedfile = null;
        File file = new File(pathname);
        try {
            try (FileInputStream fileInputStreamReader = new FileInputStream(file)) {
				byte[] bytes = new byte[(int)file.length()];
				fileInputStreamReader.read(bytes);
			}
            encodedfile = Base64.getEncoder().toString();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return encodedfile;
    }
}
