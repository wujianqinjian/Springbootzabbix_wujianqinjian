package Component;


import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;
import sun.rmi.runtime.Log;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

public class MyLocalResolver implements LocaleResolver {

    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        String languagesVarStr=request.getParameter("languageVar");

        Locale locale=Locale.getDefault();
        if (!StringUtils.isEmpty(languagesVarStr)){
            String[] languageArr=languagesVarStr.split("_");
            locale=new Locale(languageArr[0],languageArr[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

    }
}
