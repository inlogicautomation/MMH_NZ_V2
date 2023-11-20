package cap.utilities;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;



/**Propertyutil is used to get property files into your system.*/
public class PropertyUtil {
    public static Map<String,String> getPropertyFileAsHashmap(String strPropertyFilePath){
        Properties prop = new Properties();
        Map<String,String> map = new HashMap();

        FileInputStream file=null;

        try {
            file=new FileInputStream(strPropertyFilePath);
            prop.load(file);
            Iterator iter = prop.entrySet().iterator();
            do
            {
                if(!iter.hasNext() )
                    break;
                Map.Entry entry = (Map.Entry)iter.next();
                map.put(entry.getKey().toString(), entry.getValue().toString() );
            } while(true );

            file.close();

        } catch (Exception e) {
            try{file.close();}catch(Exception e1){};
        }

        return map;
    }
}
