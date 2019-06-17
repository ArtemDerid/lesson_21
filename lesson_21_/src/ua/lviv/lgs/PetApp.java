package ua.lviv.lgs;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class PetApp {
	public static void main(String[] args) throws IOException {
		
		writeFieldsToFile(Pet.class);
		
	}
	 public static void writeFieldsToFile(Class<?> customClass) throws IOException {
		 Field[] fields = customClass.getDeclaredFields();
		 Map map = new HashMap<>();
		 File file = new File("AnnotatedFields.txt");
		 
		 for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			if(field.getAnnotation(PetInfo.class) instanceof PetInfo) {
				map.put(field.getName(), field.getAnnotation(PetInfo.class).value());
			}
		}
		 write(file, map);
	 }
	 
	 public static void write(File file, Map array) throws IOException {
		 OutputStream os = new FileOutputStream(file);
		 os.write(array.toString().getBytes());
		 os.close();
	 }

}
