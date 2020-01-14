package tools;


import com.alibaba.fastjson.JSONObject;


import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexC {

    public static void main(String[] args) {

        JSONObject testJson=jsonKeyValue("<newkey>newValue<newkey>");
        String newJson=(String) testJson.get("newkey");
        System.out.println(newJson);
    }

    public static JSONObject jsonKeyValue(String htmlString){
        String strJson=htmlString;
        String regExNum="<(.*?)";
        Pattern pn = Pattern.compile(regExNum);
        Matcher mk = pn.matcher(strJson);
        String mks=mk.replaceAll("").trim();
        mks=mks.split(">")[0];
        System.out.println(mks);

        String regExStr="<([^>]*)>";
        Pattern ps = Pattern.compile(regExStr);
        Matcher mv = ps.matcher(strJson);
        String mvs=mv.replaceAll("").trim();
        System.out.println( mvs);

        JSONObject jsonObject=new JSONObject();
        jsonObject.put(mks,mvs);

        return jsonObject;


    }

}
