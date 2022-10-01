package File_Create;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File dir = new File("C:/Users/user/Desktop/person/music");
        dir.mkdir();//Directory will be created

        String dirLocation = dir.getAbsolutePath();//Look created directory location
        System.out.println(dirLocation);
        System.out.println(dir.getName());//Look created diractory name
        if(dir.delete()){
            System.out.println(dir.getName()+" Folder has been deleted");
        }

        
    }
}
