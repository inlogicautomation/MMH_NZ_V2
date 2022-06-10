package cap.utilities;

import cap.helpers.Constants;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by codoid-   pc on 30/12/2021.
 */
public class TestDataUtil {

    public static LinkedHashMap<String, String> testDataMap = new LinkedHashMap<String, String>();

    static Fillo fillo = new Fillo();
    static Connection connection = null;

    //    public static void loadData(String strTestDataFilePath, String strSheetName) {
    public static Map<String, String> loadData(String strTestDataFilePath, String strSheetName) {
        try {
            connection = fillo.getConnection(strTestDataFilePath);

            Recordset recordset = connection.executeQuery("select * from ".concat(strSheetName));

            while (recordset.next()) {

                String strEnv = System.getProperty(Constants.ENV_VARIABLE_ENVIRONMENT);

                testDataMap.put(recordset.getField(Constants.TESTDATA_FIELDS).toUpperCase(), recordset.getField(strEnv));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (Exception e) {
            }
        }
        System.out.println(testDataMap);
        return testDataMap;
    }

    public static void updateData(String strTestDataFilePath, String strSheetName, String strDataName, String strDataValue) {
        Fillo fillo = new Fillo();
        Connection connection = null;

        try {

            connection = fillo.getConnection(strTestDataFilePath);

            /**
             * Sample update Query
             * Update SheetName Set QA='Datavalue' where DataFields='DataName'
             **/
            //System.getProperty(Constants.ENV_VARIABLE_ENVIRONMENT)
            connection.executeUpdate("Update ".concat(strSheetName)
                    .concat(" Set ").concat("QA")
                    .concat("='").concat(strDataValue).concat("' where ")
                    .concat(Constants.TESTDATA_FIELDS).concat("='").concat(strDataName).concat("'"));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (Exception e) {
            }
        }
    }

    public static long getRandomID() {
        long executionID = Math.round(Math.random() * 100000);
        return executionID;
    }

    public static String getValue(String strKey) {
        String strValue = strKey;
        String strRandomPattern = Constants.RANDOM_STRING;
        String strRegularExpressionPattern = "&(.*)&";
        try {
            if (strValue.matches(strRegularExpressionPattern)) {
                strValue = PatternHandlerUtil.getMatchContent(strRegularExpressionPattern, strValue);
                if (System.getProperties().containsKey(strValue.toUpperCase().trim())) {
                    strValue = System.getProperties().get(strValue.toUpperCase().trim()).toString();
                }
                // 'strKey' value add a Random Value(Execution ID)
                else if (strValue.contains(strRandomPattern)) {
                    strValue = strValue.split(strRandomPattern)[0];
                    strValue = testDataMap.get(strValue).toString();
                    strValue = strValue.concat(String.valueOf(SharedDriver.randomID));
                } else {
                    strValue = testDataMap.get(strValue).toString();
                }
            } else if (strKey.contains(strRandomPattern) && !(strValue.matches(strRegularExpressionPattern))) {
                strValue = strValue.split(strRandomPattern)[0];
                strValue = strValue.concat(String.valueOf(SharedDriver.randomID));

            }
        } catch (Exception e) {
            System.out.println("----> Exception For TestData getValue :: " + e.getMessage());
        }
        return strValue;
    }

    /*@Description: Get a list of values in Excel sheet*/
    public static List<String> getListOfValue(String strKey) {
        String strValue = strKey;
        String strRegularExpressionPattern = "&(.*)&";
        List<String> lstValue = new ArrayList<>();
        try {
            if (strValue.matches(strRegularExpressionPattern)) {
                strValue = PatternHandlerUtil.getMatchContent(strRegularExpressionPattern, strValue);
                String strActualData = testDataMap.get(strValue);
                String[] strSplits = strActualData.split(";");

                for (String strData : strSplits) {
                    lstValue.add(strData);
                }
            }
        } catch (Exception e) {
            System.out.println("----> Exception For TestData getValue :: " + e.getMessage());
            lstValue.add("No Data Found");
        }
        return lstValue;
    }

}
