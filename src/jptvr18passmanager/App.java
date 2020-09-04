/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr18passmanager;

import entity.Resource;
import static java.nio.file.Files.list;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class App {
    private List<Resource>listResources = new ArrayList<>();
    public void run(){
        System.out.println("---  Менеджер паролей ---");
        String repeat = "r";
        do{
            System.out.println("Выберите задачу: ");
            System.out.println("0 - выйти из программы ");
            System.out.println("1 - добавить ресурс ");
            System.out.println("2 - список ресурсов ");
            Scanner scanner = new Scanner(System.in);
            int task = scanner.nextInt();
            switch (task){
                case 0:
                    repeat = "q";
                    break;
                    
                case 1:
                    System.out.println("Выбранна задача 1 ");
                    Resource resource = new Resource();
                    resource.setName("IVKHK");
                    resource.setUrl("https://kutsehariduskeskus.ee/");
                    resource.setLogin("admin");
                    resource.setPassword("1231123");
                    listResources.add(resource);
                    break;
                
                case 2:
                    System.out.println("Выбранна задача 2 ");
                    System.out.println("Cписок ресурсов :");
                    for(Resource r : listResources){
                        System.out.println(r.toString());
                    }
                    break;
            }
        }while(!"q".equals(repeat));
        
    }
}
