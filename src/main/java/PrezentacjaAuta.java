import config.Config;
import impl.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrezentacjaAuta {
    public static void main(String[] args) {



//       // SilnikDisel silnik = new SilnikDisel();
//        SilnikGaz silnik = new SilnikGaz();
//
//        // KolaLetnie kola = new KolaLetnie();
//        KolaZimowe kola = new KolaZimowe();
//
//        Auto auto = new Auto("BMW",silnik,kola);
//        auto.prezentacjaAuta();

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Auto auto = context.getBean("auto", Auto.class);
        auto.prezentacjaAuta();

    }
}
