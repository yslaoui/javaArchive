package archive;

import java.util.ArrayList;
import java.util.Scanner;

public class ArchiveManager {
    ArrayList<Archive> archives = new ArrayList<>();

    public ArchiveManager() {};

    public void createArchive() {
        while(true)  {
            String identifier = "initial";
            String name = "initial";
            Archive newArchive;
            System.out.println("Identifier ? Empty will stop");
            Scanner in = new Scanner(System.in);
            identifier = in.nextLine();
            if (identifier.isEmpty()) {
                break;
            }
            System.out.println("Name ? Empty will stop");
            name = in.nextLine();
            if (name.isEmpty()) {
                break;
            }
            newArchive = new Archive(name, identifier);
            if (!(archives.contains(newArchive))) {
                System.out.println("Adding new Archive");
                archives.add(newArchive);
            }
            else {
                System.out.println("Archive already exists");
            }

        }
        this.printArchives();
    }

    public void printArchives() {
        for (Archive archive: archives) {
            System.out.println(archive.getIdentifier() + ": " + archive.getName());
        }
    }
}
