package impl;

import api.ISilnik;
import org.springframework.stereotype.Component;

@Component
public class SilnikDiesel implements ISilnik {
    public String getType() {
        return "ropniak";
    }
}
