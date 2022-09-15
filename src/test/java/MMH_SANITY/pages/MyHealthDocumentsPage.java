package MMH_SANITY.pages;

import cap.common.BasePage;
import cap.helpers.Constants;
import cap.utilities.TestDataUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.TimeZone;

import static cap.utilities.DateUtil.getDayAfterTommorrowDate;

public class MyHealthDocumentsPage extends BasePage {

    public MyHealthDocumentsPage(WebDriver driver) {
        super(driver);
    }

    public static String documentValidityDate;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'My Health Documents')]")
    protected WebElement elmntMyHealthDocuments;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'ATTACH DOCUMENT')]")
    protected WebElement btnAttachDocument;

    @FindBy(how = How.XPATH, using = "//h5[contains(text(),'ATTACH DOCUMENT')]")
    protected WebElement txtAttachDocument;

    @FindBy(how = How.XPATH, using = "//h5[contains(text(),'EDIT ATTACH DOCUMENT')]")
    protected WebElement txtEditAttachDocument;

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='documentName']")
    protected WebElement txtBoxDocumentName;

    @FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='documentType']")
    protected WebElement drpDownDocumentType;

    @FindBy(how = How.XPATH, using = "//textarea[@formcontrolname='additionalInfo']")
    protected WebElement txtBoxAdditionalInfomation;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Health Documents')]")
    protected WebElement txtHealthDocuments;

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='uploadDocument']")
    protected WebElement btnUploadDocument;

    //    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='documentTillDate']")
    @FindBy(how = How.XPATH, using = "//button[@aria-label='Open calendar']")
    protected WebElement elmntCalendar;

    @FindBy(how = How.XPATH, using = "//button[@aria-label='Choose month and year']")
    protected WebElement elmntMonthAndYear;

    @FindBy(how = How.XPATH, using = "//button[@aria-label='Choose date']")
    protected WebElement elmntChooseDate;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Save')]")
    protected WebElement btnSave;

    @FindBy(how = How.XPATH, using = "//mat-icon[contains(text(),'delete')]")
    protected WebElement btnDelete;

    @FindBy(how = How.XPATH, using = "//h4[contains(text(),'Success!')]/following-sibling::p[contains(text(),'Created successfully')]")
    protected WebElement successPopUp;

    @FindBy(how = How.XPATH, using = "//h4[contains(text(),'Success!')]/following-sibling::p[contains(text(),'Updated Successfully')]")
    protected WebElement updatedSuccessPopUp;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Close')]")
    protected WebElement btnClose;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Update')]")
    protected WebElement btnUpdate;

    @FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='documentMode']")
    protected WebElement drpDownFilterBy;

    //td/div[contains(text(),'2022')]
    public String futureDate = new StringBuilder()
            .append("//td/div[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]").toString();

    //td[contains(text(),'NOV')]
    public String txtDate = new StringBuilder()
            .append("//td[contains(text(),'")
            .append("<<DocumentName>>")
            .append("')]").toString();

    //td[contains(text(),'Test-QWERTY')]/following-sibling::td//i[contains(@class,'alerts icon')]
    public String moreInfoIcon = new StringBuilder()
            .append("//td[contains(text(),'")
            .append("<<DocumentName>>")
            .append("')]/following-sibling::td//i[contains(@class,'alerts icon')]").toString();


    //td[contains(text(),'Doc 1')]/following-sibling::td//i[contains(@class,'pencil-box')]
    public String documentEditIcon = new StringBuilder()
            .append("//td[contains(text(),'")
            .append("<<DocumentName>>")
            .append("')]/following-sibling::td//i[contains(@class,'pencil-box')]").toString();


    //span[contains(text(),'Consent Form')]
    public String ddlDocumentType = new StringBuilder()
            .append("//span[contains(text(),'")
            .append("<<TYPE>>")
            .append("')]").toString();

    //span[contains(text(),'My Documents')]
    public String ddlFilterBy = new StringBuilder()
            .append("//mat-option//span[contains(text(),'")
            .append("<<TYPE>>")
            .append("')]").toString();

 //span[contains(text(),'My Documents')]
    public String verifyFilterBy = new StringBuilder()
            .append("//mat-select//span[contains(text(),'")
            .append("<<TYPE>>")
            .append("')]").toString();

    //td[contains(text(),'25 Aug 2022')]
//    public String verifyDetails = new StringBuilder()
//            .append("//td[contains(text(),'")
//            .append("<<REPLACEMENT>>")
//            .append("')]").toString();

    //tr[./td[contains(text(),'Test-QWERTY')]][./td[contains(text(),'')]]
    public String verifyDetails = new StringBuilder()
            .append("//tr[./td[contains(text(),'")
            .append("<<DocumentName>>")
            .append("')]][./td[contains(text(),'")
            .append("<<Detail>>")
            .append("')]]").toString();


    //span[contains(text(),'MMHtest.jpg')]
    public String uploadedDocument = new StringBuilder()
            .append("//span[contains(text(),'")
            .append("<<DocumentName>>")
            .append("')]").toString();

    //div[contains(text(),'Show this entry to my care providers')]/ancestor::label//div[@class='mat-radio-inner-circle']
    public String privacySetting = new StringBuilder()
            .append("//div[contains(text(),'")
            .append("<<Setting>>")
            .append("')]/ancestor::label//div[@class='mat-radio-container']").toString();
//            .append("')]/ancestor::label//div[@class='mat-radio-outer-circle']").toString();
//            .append("')]/ancestor::label//input").toString();
//            .append("')]/ancestor::label//div[@class='mat-radio-inner-circle']").toString();


    //div[contains(text(),'Show this entry to my care providers')]/ancestor::mat-radio-button
    public String verifyPrivacySetting = new StringBuilder()
            .append("//div[contains(text(),'")
            .append("<<Setting>>")
            .append("')]/ancestor::mat-radio-button").toString();


    //div[contains(text(),'MMHtest.jpg')]
    public String moreInfoDetail = new StringBuilder()
            .append("//div[contains(text(),'")
            .append("<<Detail>>")
            .append("')]").toString();

    //tr[./td[contains(text(),'27 Aug 2022')]][./td[contains(text(),'Test-PKBFHFCO')]][./td[contains(text(),'Consent Form')]][./td//a[contains(text(),'MMHtest.jpg')]][./td[contains(text(),'CHRISTOPHER MICHAEL CLANCY')]][./td[contains(text(),'28 Aug 2022')]]
    public String verifyHealthDocument = new StringBuilder()
            .append("//tr[./td[contains(text(),'")
            .append("<<DATE>>")
            .append("')]][./td[contains(text(),'")
            .append("<<DocumentName>>")
            .append("')]][./td[contains(text(),'")
            .append("<<DocumentType>>")
            .append("')]][./td//a[contains(text(),'")
            .append("<<FileName>>")
            .append("')]][./td[contains(text(),'")
            .append("<<AttachedBy>>")
            .append("')]][./td[contains(text(),'")
            .append("<<DocumentValid>>")
            .append("')]]")
            .toString();


    protected String strUploadDocument = new StringBuilder()
            .append(System.getProperty("user.dir"))
            .append(File.separator)
            .append(Constants.CONFIG_FOLDER)
            .append(File.separator)
            .append(Constants.IMAGES_FOLDER)
            .append(File.separator)
            .append("<<FILENAME>>").toString();


    public boolean navigateToMyHealthDocuments() {
        boolean blResult = false;
        try {

            waitForSeconds(2);

            waitForElement(elmntMyHealthDocuments);
            waitForElementClickable(elmntMyHealthDocuments);
            waitAndClick(elmntMyHealthDocuments);
            waitForSeconds(2);
            waitForElement(txtHealthDocuments);
            blResult = verifyElement(txtHealthDocuments);

            System.out.println("Successfully navigated to Health Documents >>>>> :: ");
        } catch (Exception e) {
            System.out.println("Failed navigate to Health Documents >>>>> :: ");
            e.printStackTrace();

        }
        return blResult;
    }

    public boolean clickAttachDocument() {
        boolean blResult = false;
        try {
            waitForSeconds(5);
            waitForElement(btnAttachDocument);
            waitForElementClickable(btnAttachDocument);
            waitAndClick(btnAttachDocument);
            waitForSeconds(3);
            waitForElement(txtAttachDocument);
            blResult = verifyElement(txtAttachDocument);

            System.out.println("Successfully navigated to Attach Documents >>>>> :: ");
        } catch (Exception e) {
            System.out.println("Failed navigate to Attach Documents >>>>> :: ");
            e.printStackTrace();

        }
        return blResult;
    }

    public void enterDocumentName(String strDetail) {
        try {
            waitForElement(txtAttachDocument);
            System.out.println("\nDocumentName >>> ::" + strDetail);
            waitForElement(txtBoxDocumentName);
            enterValue(txtBoxDocumentName, strDetail);
        } catch (Exception e) {
            System.out.println("Failed to enter Document Name >>> ::");
            e.printStackTrace();
        }

    }

    public boolean clickSaveButton() {
        boolean blResult = false;
        try {
            waitForElement(txtAttachDocument);
            waitForElement(btnSave);
            waitForElementClickable(btnSave);
            waitAndClick(btnSave);

            waitForElement(successPopUp);
            blResult = verifyElement(successPopUp);

        } catch (Exception e) {
            System.out.println("Failed to Click save button >>> ::");
            e.printStackTrace();
        }
        return blResult;
    }

    public void enterAdditionalInformation(String strDetail) {
        try {
            waitForElement(txtAttachDocument);
            System.out.println("\nAdditional Information >>> ::" + strDetail);
            waitForElement(txtBoxAdditionalInfomation);
            enterValue(txtBoxAdditionalInfomation, strDetail);
        } catch (Exception e) {
            System.out.println("Failed to enter Additional Information Name >>> ::");
            e.printStackTrace();
        }

    }

    public boolean addFiles(String strImage) {
        boolean blResult = false;
        try {
            waitForElement(txtAttachDocument);
            System.out.println("\nImage Name >>> ::" + strImage);
            System.out.println("\n X-Path for strUpload Document Name >>> :: " + strUploadDocument.replace("<<FILENAME>>", strImage));
            String strUploadDocumentName = strUploadDocument.replace("<<FILENAME>>", strImage);
            btnUploadDocument.sendKeys(strUploadDocumentName);

            System.out.println("X-path for uploadedDocumentName >>> :: " + uploadedDocument.replace("<<DocumentName>>", strImage));
            waitForSeconds(3);
            takeScreenshotSanity(driver);
            WebElement uploadedDocumentName = waitForElement(By.xpath(uploadedDocument.replace("<<DocumentName>>", strImage)));

            waitForElement(uploadedDocumentName);
            blResult = verifyElement(uploadedDocumentName);


        } catch (Exception e) {
            System.out.println("Failed to Upload Document  >>> ::");
            e.printStackTrace();
        }
        return blResult;
    }

    public void selectDocumentType(String strDetail) {
        try {
            waitForElement(txtAttachDocument);
            System.out.println("\nDocumentType >>> ::" + strDetail);

            waitForElement(drpDownDocumentType);
            waitForElementClickable(drpDownDocumentType);
            waitAndClick(drpDownDocumentType);

            System.out.println("X-path for ddlValue >>> :: " + ddlDocumentType.replace("<<TYPE>>", strDetail));
            WebElement ddlValue = waitForElement(By.xpath(ddlDocumentType.replace("<<TYPE>>", strDetail)));

            waitForElement(ddlValue);
            waitForElementClickable(ddlValue);
            waitAndClick(ddlValue);

            waitForSeconds(3);

        } catch (Exception e) {
            System.out.println("Failed to select Document Type >>> ::");
            e.printStackTrace();
        }

    }

    public boolean selectFilter(String strFilter) {
        boolean isVerified = false;
        try {
            System.out.println("strFilter >>> :: "+strFilter);
            waitForElement(txtHealthDocuments);

            waitForElement(drpDownFilterBy);
            waitForElementClickable(drpDownFilterBy);
            waitAndClick(drpDownFilterBy);

            waitForSeconds(3);
            System.out.println("X-path for ddlValue >>> :: " + ddlFilterBy.replace("<<TYPE>>", strFilter));
            WebElement ddlValue = waitForElement(By.xpath(ddlFilterBy.replace("<<TYPE>>", strFilter)));

            waitForElement(ddlValue);
            waitForElementClickable(ddlValue);
            waitAndClick(ddlValue);

            waitForSeconds(2);
            System.out.println("X-path for ddlValue >>> :: " + verifyFilterBy.replace("<<TYPE>>", strFilter));
            WebElement verifyFilter = waitForElement(By.xpath(verifyFilterBy.replace("<<TYPE>>", strFilter)));

            waitForElement(verifyFilter);
            waitForSeconds(3);
            takeScreenshotSanity(driver);
            isVerified = verifyElement(verifyFilter);

        } catch (Exception e) {
            System.out.println("Failed to select Document Type >>> ::");
            e.printStackTrace();
        }
        return isVerified;
    }

    public boolean selectDocumentValidityDate() {

        boolean blResult = false;
        try {
            waitForSeconds(3);
            waitForElement(txtAttachDocument);

            waitForElement(elmntCalendar);
            waitForElementClickable(elmntCalendar);
            waitAndClick(elmntCalendar);

            waitForSeconds(3);
            waitForElement(elmntMonthAndYear);
            waitForElementClickable(elmntMonthAndYear);
            waitAndClick(elmntMonthAndYear);


            String date = getDayAfterTommorrowDate("d");
            String month = getDayAfterTommorrowDate("MMM").toUpperCase();
            String year = getDayAfterTommorrowDate("YYYY");

            System.out.println("getDayAfterTomorrowDate >>> :: " + date);
            System.out.println("getDayAfterTomorrowDate >>> :: " + month);
            System.out.println("getDayAfterTomorrowDate >>> :: " + year);


            System.out.println("X-Path for Year >>> :: " + futureDate.replace("<<REPLACEMENT>>", year));
            WebElement selectYear = waitForElement(By.xpath(futureDate.replace("<<REPLACEMENT>>", year)));

            waitForSeconds(3);
            waitForElement(selectYear);
            waitForElementClickable(selectYear);
            waitAndClick(selectYear);

            System.out.println("X-Path for Year >>> :: " + futureDate.replace("<<REPLACEMENT>>", month));
            WebElement selectMonth = waitForElement(By.xpath(futureDate.replace("<<REPLACEMENT>>", month)));

            waitForSeconds(3);
            waitForElement(selectMonth);
            waitForElementClickable(selectMonth);
            waitAndClick(selectMonth);

            System.out.println("X-Path for Year >>> :: " + futureDate.replace("<<REPLACEMENT>>", date));
            WebElement selectDate = waitForElement(By.xpath(futureDate.replace("<<REPLACEMENT>>", date)));

            waitForSeconds(3);
            waitForElement(selectDate);
            waitForElementClickable(selectDate);
            waitAndClick(selectDate);

            System.out.println("Value >>> :: " + elmntCalendar.getAttribute("value"));
            waitForElement(elmntCalendar);
            String strEnteredDate = elmntCalendar.getAttribute("value");
            System.out.println("strEnteredDate >>>> :: "+strEnteredDate);
            waitForSeconds(2);
            takeScreenshot(driver);
            documentValidityDate = getDayAfterTommorrowDate("d MMM YYYY");
            blResult = true;


        } catch (Exception e) {
            System.out.println("Failed to select Document Type >>> ::");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectPrivacySetting(String strDetail) {
        boolean isVerified = false;
        try {
            waitForElement(txtAttachDocument);
            System.out.println("\nPrivacy Setting >>> ::" + strDetail);

            System.out.println("X-path for Privacy Setting >>> :: " + privacySetting.replace("<<Setting>>", strDetail));
            WebElement rdoBtnValue = waitForElement(By.xpath(privacySetting.replace("<<Setting>>", strDetail)));

            waitForSeconds(3);
            jsScrollIntoView(rdoBtnValue);
            waitForElement(rdoBtnValue);
            waitForElementClickable(rdoBtnValue);
            waitAndClick(rdoBtnValue);
            waitForSeconds(4);
            System.out.println("X-path for Privacy Setting >>> :: " + verifyPrivacySetting.replace("<<Setting>>", strDetail));
            WebElement verifySelectPrivacySetting = waitForElement(By.xpath(verifyPrivacySetting.replace("<<Setting>>", strDetail)));

            waitForElement(verifySelectPrivacySetting);
            String strValue = verifySelectPrivacySetting.getAttribute("class");
            System.out.println("strValue >>> :: " + strValue);
            if (strValue.contains("mat-radio-checked")) {
                isVerified = true;
            }

        } catch (Exception e) {
            System.out.println("Failed to select Privacy Setting >>> ::");
            e.printStackTrace();
        }
        return isVerified;
    }

    public boolean clickMoreInfo(String strDetail) {
        boolean isVerified = false;
        try {
            List<String> lstDetails = TestDataUtil.getListOfValue(strDetail);

            waitForElement(txtHealthDocuments);
            System.out.println("\nMore info >>> ::" + TestDataUtil.getValue(lstDetails.get(0)));

            System.out.println("X-path for More info >>> :: " + moreInfoIcon.replace("<<DocumentName>>", TestDataUtil.getValue(lstDetails.get(0))));
            WebElement moreInfo = waitForElement(By.xpath(moreInfoIcon.replace("<<DocumentName>>", TestDataUtil.getValue(lstDetails.get(0)))));

            waitForSeconds(3);
            waitForElement(moreInfo);
            waitForElementClickable(moreInfo);
            waitAndClick(moreInfo);

            waitForSeconds(4);

            waitForElement(btnClose);
            isVerified = verifyElement(btnClose);


        } catch (Exception e) {
            System.out.println("Failed to select Privacy Setting >>> ::");
            e.printStackTrace();
        }
        return isVerified;
    }

    public boolean verifyAddedDocument(String strDetail) {
        boolean isVerified = false;
        try {
            waitForElement(txtHealthDocuments);
            List<String> lstDetails = TestDataUtil.getListOfValue(strDetail);
            System.out.println("Lst details >>> :: "+lstDetails);

            Calendar calendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
            DateFormat formatter = new SimpleDateFormat("dd MMM yyyy");
            formatter.setTimeZone(TimeZone.getTimeZone("GMT+12"));

            String attachedDate = formatter.format(calendar.getTime());
            System.out.println("attachedDate >>> :: " + attachedDate);

            lstDetails.add(0, attachedDate);
            lstDetails.add(5, documentValidityDate);
            System.out.println("\nverify Added Document Details >>> ::" + lstDetails);

//                    .append("<<DATE>>")
//                    .append("<<DocumentName>>")
//                    .append("<<DocumentType>>")
//                    .append("<<FileName>>")
//                    .append("<<AttachedBy>>")
//                    .append("<<DocumentValid>>").append("')]]")
//                    .toString();
            System.out.println("\nX-Path for added document details >>> :: " + verifyHealthDocument
                    .replace("<<DATE>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<DocumentName>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<DocumentType>>", TestDataUtil.getValue(lstDetails.get(2)))
                    .replace("<<FileName>>", TestDataUtil.getValue(lstDetails.get(3)))
                    .replace("<<AttachedBy>>", TestDataUtil.getValue(lstDetails.get(4)))
                    .replace("<<DocumentValid>>", lstDetails.get(5)));

            WebElement verify = waitForElement(By.xpath(verifyHealthDocument
                    .replace("<<DATE>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<DocumentName>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<DocumentType>>", TestDataUtil.getValue(lstDetails.get(2)))
                    .replace("<<FileName>>", TestDataUtil.getValue(lstDetails.get(3)))
                    .replace("<<AttachedBy>>", TestDataUtil.getValue(lstDetails.get(4)))
                    .replace("<<DocumentValid>>", lstDetails.get(5))));

            try {

                System.out.println("X-Path for editIcon >>> :: " + documentEditIcon.replace("<<DocumentName>>", TestDataUtil.getValue(lstDetails.get(6))));
                WebElement editIcon = waitForElement(By.xpath(documentEditIcon.replace("<<DocumentName>>", TestDataUtil.getValue(lstDetails.get(6)))));
                waitForElement(editIcon);
                verifyElement(editIcon);
                System.out.println("Verified shared with Provider >>> :: ");
                waitForElement(verify);
                takeScreenshotSanity(driver);
                isVerified = verifyElement(verify);

            } catch (Exception e) {
                waitForSeconds(3);
                waitForElement(verify);
                takeScreenshotSanity(driver);
                isVerified = verifyElement(verify);
                System.out.println("Failed to verify ");
            }


        } catch (Exception e) {
            System.out.println("Failed to verify Added document details >>> ::");
            e.printStackTrace();
        }
        return isVerified;
    }

    public boolean editAttachedDocument(String strDetail){
        boolean blResult = false;
        try {
            waitForElement(txtHealthDocuments);
            List<String> lstDetails = TestDataUtil.getListOfValue(strDetail);
            System.out.println("Lst details >>> :: "+lstDetails);
            System.out.println("X-Path for editIcon >>> :: " + documentEditIcon.replace("<<DocumentName>>", TestDataUtil.getValue(lstDetails.get(4))));
            WebElement editIcon = waitForElement(By.xpath(documentEditIcon.replace("<<DocumentName>>", TestDataUtil.getValue(lstDetails.get(4)))));
            waitForElement(editIcon);
            waitForElementClickable(editIcon);
            waitAndClick(editIcon);

            waitForElement(txtEditAttachDocument);
            jsScrollIntoView(btnUpdate);
            waitForElement(btnUpdate);
            waitForElementClickable(btnUpdate);
            waitAndClick(btnUpdate);

            waitForElement(updatedSuccessPopUp);
            blResult = verifyElement(updatedSuccessPopUp);
            System.out.println("Successfully edited the Attached Document >>> :: ");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Failed to Edit the Attached Document >>> :: ");
        }
        return blResult;
    }

    public boolean verifyMoreInfoDetails(String strDetail) {
        boolean isVerified = false;
        try {
            waitForElement(txtHealthDocuments);
            List<String> lstDetails = TestDataUtil.getListOfValue(strDetail);

            lstDetails.add(0, documentValidityDate);
            System.out.println("\nverify Added Document Details >>> ::" + lstDetails);
            waitForSeconds(3);

            for (String strDetails : lstDetails) {
                System.out.println("strDetails >>> :: " + strDetails);
                System.out.println("X-Path for verify data >>> :: " + moreInfoDetail.replace("<<Detail>>", TestDataUtil.getValue(strDetails)));
                WebElement verifyData = waitForElement(By.xpath(moreInfoDetail.replace("<<Detail>>", TestDataUtil.getValue(strDetails))));

                waitForElement(verifyData);
                boolean result = verifyElement(verifyData);

                if (!result) {
                    return isVerified;
                }
            }
            takeScreenshotSanity(driver);
            waitForElement(btnClose);
            waitForElementClickable(btnClose);
            waitAndClick(btnClose);

            waitForElement(txtHealthDocuments);
            isVerified = verifyElement(txtHealthDocuments);

        } catch (Exception e) {
            System.out.println("Failed to verify more info details >>> ::");
            e.printStackTrace();
        }
        return isVerified;
    }

}
