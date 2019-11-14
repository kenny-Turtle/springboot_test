package shiro03;

import org.apache.shiro.codec.Base64;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.junit.Test;

/**
 * @Author zfj
 * @create 2019/8/15 14:23
 */
public class EncryptTest {

    /*
    * 编码和解码
    * */
    @Test
    public void test01(){
        String str="helloWorld";

        //编码
        String encodeToString= Base64.encodeToString(str.getBytes());
        System.out.println(encodeToString);

        //解码
        String decodeToString=Base64.decodeToString(encodeToString);
        System.out.println(decodeToString);
    }

    @Test
    public void test05(){
        String username="admin";
        String password="123";

//        String s=new SimpleHash("md5",password,3).toString();
        String s=new SimpleHash("md5",password,username,3).toString();
        System.out.println(s);
    }
}
