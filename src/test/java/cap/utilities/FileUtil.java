package cap.utilities;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.awt.*;
import java.io.*;

/**Fileutil is used for system file management control, and it allows you to Create,delete,Rename, and upload files. */

public class FileUtil {
   
   public static String getCanonicalPath(){
      String strResult="";
      try{
         strResult=new File(".").getCanonicalPath();
      }
      catch(Exception e){
      }
      
      return strResult;
   }
   public static boolean verifyFileExist(String strFilePath){
      File objFile=new File(strFilePath);
      return objFile.exists();
   }

   public static String getAbsolutePath(String strFilePath){
      return new File(strFilePath).getAbsolutePath();
   }
   
   public static boolean createFolder(String strFolderPath){
      return new File(strFolderPath).mkdir();
   }
   
   public static boolean createFile(String strFilePath){
      boolean blResult = false;
      try {
         blResult= new File(strFilePath).createNewFile();
      } catch (IOException e) {
      }
      return blResult;
   }
   
   //FileUtil.createFileWithContent("src/test/resources/bms/testdata/bms-msidn.txt","dfsdf")
   public static boolean createFileWithContent(String strFilePath,String strContent){
      boolean blResult = false;
      try {
         File file = new File(strFilePath);
         BufferedWriter output = new BufferedWriter(new FileWriter(file));
           output.write(strContent);
           output.close();
           blResult = true;
      } catch (Exception e) {
      }
      return blResult;
   }
/**  The RenameFile method was used to rename your folder name. */

   public static boolean renameFile(String strPath1,String strPath2){
      boolean blResult = false;
      try {
         File file1 = new File(strPath1);
         File file2 = new File(strPath2);
         
         file1.renameTo(file2);
         
           blResult = true;
      } catch (Exception e) {
      }
      return blResult;
   }


   public static boolean writeContent(String strFilePath,String strContent){
      boolean blResult = false;
      try {
         File file = new File(strFilePath);
         BufferedWriter output = new BufferedWriter(new FileWriter(file,true));
           output.write(strContent);
           output.close();
           blResult = true;
      } catch (Exception e) {
      }
      return blResult;
   }
   /**  The deleteFile method was used to delete one files from your folder.*/
   public static boolean deleteFile(String strFilePath){
      boolean blResult=false;
      try{
         File file = new File(strFilePath);
         file.delete();
         blResult=true;
      }
      catch(Exception e){}
      return blResult;
   }
   /**  The getFileNamesFromFolder method was used to get the file name and folder name from your folder..*/

   public static String[] getFileNamesFromFolder(String strFolderLocation) {
      String[] strFileName = new String[10];
      File folder = new File(strFolderLocation);
      File[] listOfFiles = folder.listFiles();
      int i = 0;
      for (File file : listOfFiles) {
         if (file.isFile()) {
            strFileName[i]=file.getName();
            i++;
         }
      }
      return strFileName;
   }

/**  The deleteFile method was used to delete many files from your folder */

   public static boolean deleteFiles(String strDirectoryPath) {
      boolean isDeleted = false;
      File f = new File(strDirectoryPath);
      f.mkdir();
      if (f.isDirectory()) {
         String fileList[] = f.list();
         int num = fileList.length;
         for (int i = 0; i < num; i++) {
            File f1 = new File(f.getAbsolutePath() + File.separator + fileList[i]);
            isDeleted = f1.delete();
         }
         f.mkdir();
      }
      return isDeleted;
   }

   public static boolean waitForFileToDownload(String strFolderPath, String strFileName){
      boolean isOpened = false;
      try {
         if (Desktop.isDesktopSupported()) {
            File downloadedFile = new File(new StringBuilder(strFolderPath).append(strFileName).toString());
            int inCount = 0;
            do {
               Thread.sleep(3000);
               inCount++;
            } while (downloadedFile.exists() == false && inCount <= 10);

            isOpened = true;
         }
      } catch (Exception e) {
         isOpened = false;
      }

      return isOpened;
   }
   /**  The deleteFile method was used to delete many files from your folder */
   public static void createFile(String strFilePath, String strFile){
      try {
          FileOutputStream f = new FileOutputStream(new File(strFilePath+"/"+strFile));
          XSSFWorkbook workbook = new XSSFWorkbook();
          workbook.write(f);
      } catch (Exception e) {
         e.printStackTrace();
      }
   }

}
