package com.myprojects.patterns.behaviorall.command;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.InputStreamReader;

@Slf4j
public class Сatalog {

    public void showAllComand() {
        System.out.println("""
                all: The command represents a tree-like visualization of the project structure, displaying all directories and subdirectories along with their contents.
                                         
                behaviorall
                                
                command: Directory of the Command pattern, containing classes related to the implementation of the Command pattern.
                observer: Directory of the Observer pattern, containing classes related to the implementation of the Observer pattern.
                                         
                generative
                                
                abstractFactory: Directory of the Abstract Factory pattern, containing subdirectories with different factories and products.
                american: Subdirectory of American products.
                eastern: Subdirectory of Eastern products.
                european: Subdirectory of European products.
                product: Subdirectory of products of the Abstract Factory.
                builder: Directory of the Builder pattern, containing classes related to the implementation of the Builder pattern.
                factory: Directory of the Factory pattern, containing classes related to the implementation of the Factory pattern.
                prototype: Directory of the Prototype pattern, containing classes related to the implementation of the Prototype pattern.
                singleton: Directory of the Singleton pattern, containing subdirectories with classes related to the implementation of the Singleton pattern.
                db: Subdirectory for classes related to database management.
                logger: Subdirectory for classes related to event logging and logging.
                note: Subdirectory for classes related to notes and record management.
                                         
                structural
                                
                adapter: Directory of the Adapter pattern, containing classes related to the implementation of the Adapter pattern.
                composite: Directory of the Composite pattern, containing classes related to the implementation of the Composite pattern.
                CoR: Directory of the Chain of Responsibility pattern, containing classes related to the implementation of the Chain of Responsibility pattern.
                decorator: Directory of the Decorator pattern, containing classes related to the implementation of the Decorator pattern.
                flyweight: Directory of the Flyweight pattern, containing classes related to the implementation of the Flyweight pattern.
                proxy: Directory of the Proxy pattern, containing classes related to the implementation of the Proxy pattern.
                                         
                exit: It typically closes the application or session and returns the user to the previous environment or prompts.""");
    }

    public void showСatalogProject() {
        try {
            Process process =
                    new ProcessBuilder("cmd.exe", "/c", "tree").start();
            try (BufferedReader reader =
                         new BufferedReader(new InputStreamReader(process.getInputStream(),
                                 "CP437"))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }
        } catch (Exception e) {
          log.error("Error to see tree " + e);
        }
    }

    public void showСatalogProject(String packageProject) {
        try {
            Process process =
                    new ProcessBuilder("cmd.exe", "/c", "dir", "/s", "*"+ packageProject + "*").start();
            try (BufferedReader reader =
                         new BufferedReader(new InputStreamReader(process.getInputStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    if (line.contains(".java")) {
                        System.out.println(line);
                    }
                }
            }
        } catch (Exception e) {
            log.error("Error to see tree " + e);
        }
    }
}
