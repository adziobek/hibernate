package pl.polska;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.polska.service.DictionaryService;

public class Application {

    @Autowired
    DictionaryService dictionaryService;

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
        Application app = new Application();
        app.addDictionary("Pokrycie dachu");
    }

    private void addDictionary(String dictName) {
        dictionaryService.addDictionary(dictName);
    }
}




