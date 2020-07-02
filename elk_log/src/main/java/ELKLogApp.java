import org.springframework.util.StringUtils;

import java.text.MessageFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author lucas
 * @Description
 * @Date 2019/11/4
 **/
public class ELKLogApp {


    public static void main(String[] args) {

        String base ="data:image/png;base64,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";
        String imgType = "png";
        Pattern pattern;
        Matcher matcher;
        String regix;
             regix = MessageFormat.format("data:image/{0};base64,", imgType);
             pattern = Pattern.compile(regix, Pattern.CASE_INSENSITIVE);
             matcher = pattern.matcher(base);
             if (matcher.lookingAt()) {
                System.out.println("修改结果:" + matcher.replaceFirst(""));
             }
        String first = "/ezblock_img/member/1.png";

        new String(first.toCharArray(),10,first.length()-10);

        String prefix ="/home/ezblock_img/member/";

        System.out.println();
        //                   MemberConstans.IMAGE_REAL_URL_PREFIX+new String(img.toCharArray(),20,url.length()-20)
        System.out.println("result 2:"+ prefix+new String(first.toCharArray(),20,first.length()-20));;



    }
}