package com.tub.petshare.apputil;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

/**
 *
 * @author Naveed Kamran
 */
@Component
public class LocaleUtil {

    //@Autowired
    //private ObjFactory objFactory;
    public NumberFormat getNumberFormat() {
        return NumberFormat.getInstance(Locale.US);
    }

    public String getLabel(String label) {
        Locale locale = LocaleContextHolder.getLocale();

        ResourceBundle resourceBundle = ResourceBundle.getBundle("i18n/messages", locale);
        //System.out.println(label + ": " + resourceBundle.getString(label));
        return resourceBundle.getString(label);
    }

    public static void main(String args[]) {
        Locale locale = new Locale("ur");
        //Locale locale = LocaleContextHolder.getLocale();
        String language = locale.getLanguage();
        System.out.println("Current Language: " + language);

        ResourceBundle resourceBundle = ResourceBundle.getBundle("i18n/messages", locale);
        System.out.println("label.dashboard: " + resourceBundle.getString("label.dashboard"));
    }
}
