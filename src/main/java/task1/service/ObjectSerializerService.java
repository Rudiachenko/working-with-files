package task1.service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectSerializerService {

    public void serializeObject(Object object, String filePath) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(filePath);) {
            System.out.println("Start serialization");

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(object);
            objectOutputStream.flush();
            objectOutputStream.close();

            System.out.println("Success serialization");
        } catch (IOException e) {
            System.out.println("Can't serialize object");
        }

    }
}
