package impl;

import api.IKola;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@PropertySource("auto.properties")
@Component
public class KolaZimowe implements IKola {

    // czytamy wartość z pliku
    @Value("${kola.zimowe}")
    String typ;


    public String getType() {
        return typ;
    }
}
