package task1.service;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectDeserializerService {

    public Object deserializeObject(String filePath) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath))) {
            System.out.println("Start deserialization");

            Object object = objectInputStream.readObject();
            objectInputStream.close();

            System.out.println("Success deserialization");
            return object;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Can't deserialize object");
            return null;
        }
    }
}
