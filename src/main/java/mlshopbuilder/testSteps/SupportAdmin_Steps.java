package mlshopbuilder.testSteps;

import mlshopbuilder.pageObject.SupportAdmin_PageObjects;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utilities.ExtentReport.ExtentReporter;
import utilities.PropertyReader.propertyReader;
import utilities.Logger.LoggingUtils;

public class SupportAdmin_Steps extends Base_Steps {

    //methods
    public void loginByRole(String role) {
        click(loginPageObjects.userIcon(), "Menu Icon");
        click(loginPageObjects.MLoginbtn(), "Login option");
        type(loginPageObjects.Email_add(), "Email Field", reader.getEmailByRole(role));
        type(loginPageObjects.Login_pass(), "Password Field", reader.getPasswordByRole(role));
        click(loginPageObjects.Continuebtn(), "Continue");
        LoggingUtils.info("Successful Logged In");
    }

    public void logout(String role){
        click(supportAdminPageObjects.userIcon(),"Menu Icon");
        click(supportAdminPageObjects.logoutbtn(), "Logout");
        waitSleep(1500);
        LoggingUtils.info("Successful Logged off");
    }

    public void goingtoAddproductpage(String role){
        shopbuildernavigation(role);
        click(supportAdminPageObjects.MLShopJewelryStore(), "ML Shop Jewelry Store");
        click(supportAdminPageObjects.Addproduct(), "Add product button");
    }

    public void goingtoViewproductpage(String role){
        shopbuildernavigation(role);
        click(supportAdminPageObjects.MLShopJewelryStore(), "ML Shop Jewelry Store");
        click(supportAdminPageObjects.viewproductbtn(), "View products button");
    }

    public void cleareditinfotextbox(String role) {
        supportAdminPageObjects.Quantitytxtbox().clear();
        supportAdminPageObjects.ItemWeighttxtbox().clear();
        supportAdminPageObjects.StyleNametxtbox().clear();
        supportAdminPageObjects.Notetxtbox().clear();
        click(supportAdminPageObjects.Barcodetxtbox(), "Barcode Textbox");
        supportAdminPageObjects.Barcodetxtbox().clear();
        supportAdminPageObjects.Lotnumbertxtbox().clear();
        supportAdminPageObjects.Costofsalestxtbox().clear();
        supportAdminPageObjects.grosssalestxtbox().clear();
        supportAdminPageObjects.pricetxtbox().clear();
    }

    public void cleareditinfotextbox41(String role) {
        supportAdminPageObjects.Quantitytxtbox().clear();
        supportAdminPageObjects.ItemWeighttxtbox().clear();
        supportAdminPageObjects.ProductSize().clear();
        supportAdminPageObjects.StyleNametxtbox().clear();
        supportAdminPageObjects.Notetxtbox().clear();
        click(supportAdminPageObjects.Barcodetxtbox(), "Barcode Textbox");
        supportAdminPageObjects.Barcodetxtbox().clear();
        supportAdminPageObjects.Lotnumbertxtbox().clear();
        supportAdminPageObjects.Costofsalestxtbox().clear();
        supportAdminPageObjects.grosssalestxtbox().clear();
        supportAdminPageObjects.pricetxtbox().clear();
    }

    public void goToShopBuilder(){
        click(loginPageObjects.userIcon(), "User Avatar");
        click(adminPageObjects.shopbuilderbutton(), "Shopbuilder Button");
    }

    public void changeandrevertchanges(String role){
        waitSleep(3000);
        typeEnter(supportAdminPageObjects.typedropdown(),"Type","necklace");
        typeEnter(supportAdminPageObjects.goldkaratsdropdown(),"Gold Karats","18k");
        typeEnter(supportAdminPageObjects.goldcolorsdropdown(),"Gold Colors","tri");
        typeEnter(supportAdminPageObjects.genderdropdown(),"Gender","uni");
        typeEnter(supportAdminPageObjects.stonedropdown(),"Stone","citri");
        typeEnter(supportAdminPageObjects.stonecolordropdown(),"Stone Color","pink");
        typeEnter(supportAdminPageObjects.conditiondropdown(),"Condition","refurb");

        type(supportAdminPageObjects.Quantitytxtbox(), "Changed Value", "2");
        type(supportAdminPageObjects.ProductSize(), "Changed Value", "5");
        type(supportAdminPageObjects.ItemWeighttxtbox(), "Changed Value", "6");
        type(supportAdminPageObjects.StyleNametxtbox(), "Changed Value", "testtest");
        type(supportAdminPageObjects.Notetxtbox(), "Changed Value", "testing the test");

        type(supportAdminPageObjects.Barcodetxtbox(), "Changed Value", "7654321");
        type(supportAdminPageObjects.Lotnumbertxtbox(), "Changed Value", "87654321");
        type(supportAdminPageObjects.Costofsalestxtbox(), "Changed Value", "2000");
        type(supportAdminPageObjects.grosssalestxtbox(), "Changed Value", "3000");
        type(supportAdminPageObjects.pricetxtbox(), "Changed Value", "2999");

        waitSleep(3000);
        click(supportAdminPageObjects.updateandsubmit(),"Update & Submit");
        LoggingUtils.info("Edited Info: Successful");

        //revert changes
        click(supportAdminPageObjects.editinfobtn(),"Edit Info");
        click(supportAdminPageObjects.availabilityforshop(),"Availability for shop");
        waitSleep(3000);
        cleareditinfotextbox("supportadmin");
        waitSleep(3000);

        typeEnter(supportAdminPageObjects.typedropdown(),"Type","brouch");
        typeEnter(supportAdminPageObjects.goldkaratsdropdown(),"Gold Karats","14k");
        typeEnter(supportAdminPageObjects.goldcolorsdropdown(),"Gold Colors","rose");
        typeEnter(supportAdminPageObjects.genderdropdown(),"Gender","ladies");
        typeEnter(supportAdminPageObjects.stonedropdown(),"Stone","garnet");
        typeEnter(supportAdminPageObjects.stonecolordropdown(),"Stone Color","clear");
        typeEnter(supportAdminPageObjects.conditiondropdown(),"Condition","new");

        type(supportAdminPageObjects.Quantitytxtbox(), "Reverted Value", "1");
        type(supportAdminPageObjects.ItemWeighttxtbox(), "Reverted Value", "5");
        type(supportAdminPageObjects.StyleNametxtbox(), "Reverted Value", "Testt");
        type(supportAdminPageObjects.Notetxtbox(), "Reverted Value", "this is for testing");

        type(supportAdminPageObjects.Barcodetxtbox(), "Reverted Value", "123567");
        type(supportAdminPageObjects.Lotnumbertxtbox(), "Reverted Value", "12345678");
        type(supportAdminPageObjects.Costofsalestxtbox(), "Reverted Value", "1000");
        type(supportAdminPageObjects.grosssalestxtbox(), "Reverted Value", "5000.");
        type(supportAdminPageObjects.pricetxtbox(), "Reverted Value", "4999");

        click(supportAdminPageObjects.updateandsubmit(),"Update & Submit");
        LoggingUtils.info("Reverted Changes: Successful");
    }

    public void goingtoViewDetailspage(String role){
        shopbuildernavigation(role);
        click(supportAdminPageObjects.MLShopJewelryStore(), "ML Shop Jewelry Store");
        click(supportAdminPageObjects.viewproductbtn(), "View products button");
        click(supportAdminPageObjects.Editviewdetailsbtn(),"View Product Details");
    }

    public void nextpagex5(String role){
        click(supportAdminPageObjects.nextbtn(), "Nextpage");
        click(supportAdminPageObjects.nextbtn(), "Nextpage");
        click(supportAdminPageObjects.nextbtn(), "Nextpage");
        click(supportAdminPageObjects.nextbtn(), "Nextpage");
        click(supportAdminPageObjects.nextbtn(), "Nextpage");
    }

    public void previouspagex5(String role){
        click(supportAdminPageObjects.previousbtn(), "Previous Button");
        click(supportAdminPageObjects.previousbtn(), "Previous Button");
        click(supportAdminPageObjects.previousbtn(), "Previous Button");
        click(supportAdminPageObjects.previousbtn(), "Previous Button");
        click(supportAdminPageObjects.previousbtn(), "Previous Button");
    }

    public void dashboardnavigation (String role){
        click(supportAdminPageObjects.userIcon(), "Account Header");
        click(supportAdminPageObjects.dashboardbtn(),"Dashboard button");
    }

    public void merchantnavigation (String role){
    dashboardnavigation("supportadmin");
    click(supportAdminPageObjects.merchantsbtn(),"Merchant Button");
    }

    public void shopbuildernavigation (String role){
        click(supportAdminPageObjects.userIcon(), "Account Header");
        click(supportAdminPageObjects.shopbuilderbtn(),"Dashboard button");
    }

    public boolean isInHomePage() {
        if (isVisible(loginPageObjects.HeaderAcctOwnership(),"HeaderAcctOwnership")) {
        }
        return true;
    }

    public void inputsAddproduct(String role){
        type(supportAdminPageObjects.AddQuantitytxtbox(), "Quantity Textbox", propertyReader.getproperty("Quantity"));
        type(supportAdminPageObjects.AddItemWeighttxtbox(), "Item Weight Textbox", propertyReader.getproperty("ItemWeight"));
        type(supportAdminPageObjects.AddStyleNametxtbox(), "Style Name Textbox", propertyReader.getproperty("StyleName"+getRandomNumber()));
        type(supportAdminPageObjects.AddNotetxtbox(), "Notes Textbox", propertyReader.getproperty("Notes"));
        LoggingUtils.info("SBR: Product info Inputs Successful");

        type(supportAdminPageObjects.AddBarcodetxtbox(), "Barcode Textbox", propertyReader.getproperty("barcode"));
        type(supportAdminPageObjects.AddLotnumbertxtbox(), "Lot Number Textbox", propertyReader.getproperty("lotnumber"));
        type(supportAdminPageObjects.AddCostofsalestxtbox(), "Cost of Sales Textbox", propertyReader.getproperty("costofsale"));
        type(supportAdminPageObjects.Addgrosssalestxtbox(), "Gross Sales Textbox", propertyReader.getproperty("grosssale"));
        type(supportAdminPageObjects.Addpricetxtbox(), "Price Textbox", propertyReader.getproperty("price"));
    }

    //Test Cases
    public void SBL_TC_01_SuppAdminLogIn() {
       loginByRole("supportadmin");
        if(isInHomePage()){
            ExtentReporter.logPass("SBL_TC_01_SuppAdminLogIn", "Successfully Logged in Support Admin");
        }
        else{
            ExtentReporter.logFail("", "Failed to Log In as Support Admin");
            Assert.fail("");
        }  
    }

    public void SBL_TC_02_ShopbuilderpageNavigation() {
        dashboardnavigation("supportadmin");
        isDisplayed(supportAdminPageObjects.newlyaddedstore());
        isDisplayed(supportAdminPageObjects.totalstorecount());
        waitSleep(2000);
        LoggingUtils.info("SBL TC 02 Shopbuilder Page Navigation: Success");

       // logout("supportadmin");
    }

    public void SBL_TC_03_MerchantNavigation() {
        dashboardnavigation("supportadmin");
        click(supportAdminPageObjects.merchantsbtn(),"Merchant button");

       // logout("supportadmin");
    }

    public void SBL_TC_04_and_05_TotalStores_and_NewlyAddedStore() {

        dashboardnavigation("supportadmin");
        isDisplayed(supportAdminPageObjects.newlyaddedstore());
        isDisplayed(supportAdminPageObjects.totalstorecount());
        LoggingUtils.info("SBL TC 04 and 05 Visibility of Total Stores and New added store: Success");

       // logout("supportadmin");
    }

    public void SBL_TC_06_and_07_ShopBuilderNavigation_and_TotalStoreCount() {

        shopbuildernavigation("supportadmin");
        waitSleep(2000);
        isDisplayed(supportAdminPageObjects.StoreSearchWatches());
        isDisplayed(supportAdminPageObjects.MLShopJewelryStore());
        LoggingUtils.info("SBL TC 06 ShopBuilder Page navigation: Success");

        waitSleep(2000);
        isDisplayed(supportAdminPageObjects.TotalStore());
        LoggingUtils.info("SBL TC 07 Total Store Count: Success");

       // logout("supportadmin");
    }

    public void SBL_TC_08_InvalidStoreSearch() {
        shopbuildernavigation("supportadmin");
        waitSleep(2000);
        type(supportAdminPageObjects.Searchtxtbox(), "Search Textbox", "Watczzz");
        waitSleep(2000);
        isDisplayed(supportAdminPageObjects.InvalidSearch());
        LoggingUtils.info("SBL TC 08 Invalid Store Search: Success");

       // logout("supportadmin");
    }

    public void SBL_TC_09_ValidStoreSearch() {

        shopbuildernavigation("supportadmin");
        waitSleep(2000);
        type(supportAdminPageObjects.Searchtxtbox(), "Search Textbox", "watch");
        waitSleep(2000);
        isDisplayed(supportAdminPageObjects.StoreSearchWatches());
        LoggingUtils.info("SBL TC 09 Valid Store Search: Success");

       // logout("supportadmin");
    }

    public void SBL_TC_10_jewelryShopRedirection() {

        shopbuildernavigation("supportadmin");
        click(supportAdminPageObjects.MLShopJewelryStore(), "ML Shop Jewelry Store");
        isDisplayed(supportAdminPageObjects.Addproduct());
        isDisplayed(supportAdminPageObjects.viewproductbtn());
        LoggingUtils.info("SBL TC 10 Jewelry Shop Redirection: Success");

       // logout("supportadmin");
    }

    public void SBL_TC_11_MLWatchShopRedirection() {

        shopbuildernavigation("supportadmin");
        click(supportAdminPageObjects.StoreSearchWatches(), "ML Watch");
        isDisplayed(supportAdminPageObjects.Addproduct());
        isDisplayed(supportAdminPageObjects.viewproductbtn());
        LoggingUtils.info("SBL TC 11 ML Watch Shop Redirection: Success");

       // logout("supportadmin");
    }

    public void SBL_TC_12_to_15_EditProfile() {

        shopbuildernavigation("supportadmin");
        click(supportAdminPageObjects.MLShopJewelryStore(), "ML Shop Jewelry Store");
        click(supportAdminPageObjects.EditProfile(), "Edit Profile Button");
        LoggingUtils.info("SBL TC 12 Edit Button: Success");
        waitSleep(2500);

        click(supportAdminPageObjects.Editname(), "Edit name Feature");
        waitSleep(2000);
        type(supportAdminPageObjects.Updatenametxtbox(),"Update Name textbox","Wow Nice");
        type(supportAdminPageObjects.Updatebiotextbox(),"Update Bio", "Nice it's working");
        click(supportAdminPageObjects.submitbutton(),"Submit Button");
        waitSleep(5000);
        isVisible(supportAdminPageObjects.changename(),"Changed Name");
        LoggingUtils.info("SBL TC 13 Functionality of Edit Profile: Success");

        click(supportAdminPageObjects.EditProfile(), "Edit Profile Button");
        type(supportAdminPageObjects.Updatenametxtbox(),"Update Name textbox","ML Shop Jewelry Store");
        type(supportAdminPageObjects.Updatebiotextbox(),"Update Bio", "WHEN YOU POP THE QUESTION do it with a ring from our jewelry collection. Click to see selections now!");
        LoggingUtils.info("SBL TC 14 Updated Bio: Success");
        click(supportAdminPageObjects.submitbutton(),"Submit Button");
        LoggingUtils.info("SBL TC 15 Submit Button: Success");
        waitSleep(5000);
        isVisible(supportAdminPageObjects.originalname(),"Original Name");
        waitSleep(2000);
        LoggingUtils.info("Successfully Reverted Changes");

       // logout("supportadmin");
    }

    public void SBL_TC_16_17_EditBannerAndCancelEditBanner() {

        shopbuildernavigation("supportadmin");
        click(supportAdminPageObjects.MLShopJewelryStore(), "ML Shop Jewelry Store");
        click(supportAdminPageObjects.editbanner(), "ML Shop Jewelry Store Banner");
        LoggingUtils.info("SBL TC 16: Edit Banner function: Success");
        waitSleep(2000);
        click(supportAdminPageObjects.canceleditbanner(),"ML Shop Jewelry Store Banner");
        LoggingUtils.info("SBL TC 17: Edit Banner function: Success");

       // logout("supportadmin");
    }

//    public void SBL_TC_18_to_21_AddBanner() {
//        goToShopBuilder();
//        waitSleep(2000);
//        click(adminPageObjects.Store(1), "Store");
//        waitSleep(2000);
//        //add banner
//        click(adminPageObjects.addBanner_btn(), getText(adminPageObjects.addBanner_btn()));
//        waitSleep(1000);
//        uploadFile(supportAdminPageObjects.chooseBanner(), filePathUtils.getAbsolutePath());
//        waitSleep(1000);
//        click(adminPageObjects.mainaccttxtbox2(), "Screen Size DropDown");
//        waitSleep(1000);
//        arrowKeyDown(1);
//        click(adminPageObjects.provincedrop(), "Position DropDown");
//        waitSleep(1000);
//        arrowKeyDown(1);
//        click(supportAdminPageObjects.submitbutton(),"Submit Button");
//        isVisible(adminPageObjects.bannerStatus(), "Banner Status Pop Up");
//        //
//        waitSleep(3000);
//        click(adminPageObjects.editBanner_btn(), "Edit Banner Button");
//        waitSleep(1000);
//        click(adminPageObjects.bannerCameraEdit_btn(), "Camera/Edit Icon");
//        uploadFile(supportAdminPageObjects.chooseBanner(), filePathUtils.getAbsolutePath());
//        click(supportAdminPageObjects.submitbutton(),"Submit Button");
//        waitSleep(8000);
//        isVisible(adminPageObjects.bannerImg_alt(), "Banner Image");
//        click(adminPageObjects.bannerStatus_radioBtn(), "Banner Status Radio Button");
//        waitSleep(1000);
//        isVisible(adminPageObjects.bannerStatus(), "Banner Status Pop Up");
//        passTest("SBA_TC_18", "Successfully Validated Banner Functionality");
//    }

    public void SBL_TC_22_AddproductRedirection() {
        goingtoAddproductpage("supportadmin");
        LoggingUtils.info("SBL TC 22 Add Product Page Redirection: Success");
    }

//    public void SBL_TC_23_and_24_ProductandSalesInput(){
//        goingtoAddproductpage("supportadmin");
//
//        waitSleep(4000);
//        inputsAddproduct("supportadmin");
//        isDisplayed(supportAdminPageObjects.Amparitotickbox());
//        LoggingUtils.info("SBL TC 23 & 24: Product & Sales Inputs Successful");
//    }

    public void SBR_TC_25_ImageUpload(){
        goingtoAddproductpage("supportadmin");
        uploadFile(merchantObjects.coverPhoto(), filePathUtils.getAbsolutePath());
        uploadFile(merchantObjects.imageContent(), filePathUtils.getAbsolutePath());
        if(isVisible(merchantObjects.selectedCoverPhoto(), "Selected Photo" )||
            isVisible(merchantObjects.selectedImageContent(), "Select Image Content")) {
            passTest("SBR_TC_25_ImageUpload", "Successfully uploaded photo");
        }else{
            failTest("SBR_TC_25_ImageUpload", "Failed to upload photo");
        }
       // logout("supportadmin");
    }

    public void SBL_TC_26_InputsRequired(){
        goingtoAddproductpage("supportadmin");
        waitSleep(3000);

        click(supportAdminPageObjects.AddQuantitytxtbox(),"");
            supportAdminPageObjects.AddQuantitytxtbox().clear();
        click(supportAdminPageObjects.AddItemWeighttxtbox(),"");
            supportAdminPageObjects.AddItemWeighttxtbox().clear();
        click(supportAdminPageObjects.AddStyleNametxtbox(),"");
            supportAdminPageObjects.AddStyleNametxtbox().clear();
        click(supportAdminPageObjects.AddNotetxtbox(),"");
            supportAdminPageObjects.AddNotetxtbox().clear();
        click(supportAdminPageObjects.AddBarcodetxtbox(),"");
            supportAdminPageObjects.AddBarcodetxtbox().clear();
        click(supportAdminPageObjects.AddLotnumbertxtbox(),"");
            supportAdminPageObjects.AddLotnumbertxtbox().clear();
        click(supportAdminPageObjects.AddCostofsalestxtbox(),"");
            supportAdminPageObjects.AddCostofsalestxtbox().clear();
        click(supportAdminPageObjects.Addgrosssalestxtbox(),"");
            supportAdminPageObjects.Addgrosssalestxtbox().clear();
        click(supportAdminPageObjects.Addpricetxtbox(),"");
            supportAdminPageObjects.Addpricetxtbox().clear();
        click(supportAdminPageObjects.AddNotetxtbox(),"");

        waitSleep(3000);

        LoggingUtils.info("SBL TC 26: Inputs Required Visible");

       // logout("supportadmin");
    }

    //to be ehanced
    public void SBL_TC_27_SubmitAndPublish(){
        goingtoAddproductpage("supportadmin");

        waitSleep(4000);
        click(supportAdminPageObjects.gender2(),"");
        click(supportAdminPageObjects.Type(), "Type of Accessory");
        click(supportAdminPageObjects.eighteenk(), "18k btn");
        click(supportAdminPageObjects.whitegold(), "White Gold btn");
        click(supportAdminPageObjects.mens(), "Mens btn");
        click(supportAdminPageObjects.diamond(), "Diamond btn");
        click(supportAdminPageObjects.red(), "Red btn");
        click(supportAdminPageObjects.newcondition(), "New Condition btn");
        waitSleep(2500);

        supportAdminPageObjects.Quantitytxtbox().clear();
        click(supportAdminPageObjects.AddQuantitytxtbox(),"");
        type(supportAdminPageObjects.AddQuantitytxtbox(), "Quantity Textbox", ""+getRandomNumber());
        click(supportAdminPageObjects.AddProductSize(),"");
        type(supportAdminPageObjects.AddProductSize(), "Size Textbox",  ""+getRandomNumber());
        click(supportAdminPageObjects.Adddiamondsize(),"");
        type(supportAdminPageObjects.Adddiamondsize(), "Diamond Weight Textbox", ""+getRandomNumber());
        click(supportAdminPageObjects.AddItemWeighttxtbox(),"");
        type(supportAdminPageObjects.AddItemWeighttxtbox(), "Item Weight Textbox", ""+getRandomNumber());
        click(supportAdminPageObjects.AddStyleNametxtbox(),"");
        type(supportAdminPageObjects.AddStyleNametxtbox(), "Style Name Textbox", "wawser"+getRandomNumber());
        click(supportAdminPageObjects.AddNotetxtbox(),"");
        type(supportAdminPageObjects.AddNotetxtbox(), "Notes Textbox", propertyReader.getproperty("Notes"));

        click(supportAdminPageObjects.AddBarcodetxtbox(),"");
        type(supportAdminPageObjects.AddBarcodetxtbox(), "Barcode Textbox",""+getRandomNumber());
        click(supportAdminPageObjects.AddLotnumbertxtbox(),"");
        type(supportAdminPageObjects.AddLotnumbertxtbox(), "Lot Number Textbox", ""+getRandomNumber());
        click(supportAdminPageObjects.AddCostofsalestxtbox(),"");
        type(supportAdminPageObjects.AddCostofsalestxtbox(), "Cost of Sales Textbox", propertyReader.getproperty("costofsale"));
        click(supportAdminPageObjects.Addgrosssalestxtbox(),"");
        type(supportAdminPageObjects.Addgrosssalestxtbox(), "Gross Sales Textbox", propertyReader.getproperty("grosssale"));
        click(supportAdminPageObjects.Addpricetxtbox(),"");
        type(supportAdminPageObjects.Addpricetxtbox(), "Price Textbox", propertyReader.getproperty("price"));

        uploadFile(merchantObjects.coverPhoto(), filePathUtils.getAbsolutePath());
        uploadFile(merchantObjects.imageContent(), filePathUtils.getAbsolutePath());
        if(isVisible(merchantObjects.selectedCoverPhoto(), "Selected Photo" )||
                isVisible(merchantObjects.selectedImageContent(), "Select Image Content")) {
            passTest("SBR_TC_25_ImageUpload", "Successfully uploaded photo");
        }else{
            failTest("SBR_TC_25_ImageUpload", "Failed to upload photo");
        }

        click(merchantObjects.publishbtn(), "Publish Button");
        waitSleep(2000);
        click(supportAdminPageObjects.proceedbtn(), "Proceed Button");

        if(isVisible(merchantObjects.status(), getText(merchantObjects.status()))){
            passTest("SBL_TC_27", "Publishing Product: Successful");
        }else{
            failTest("SBL_TC_27", "Publishing Product: Failed");
        }
    }

    public void SBL_TC_28_ViewProductRedirection() {
        goingtoViewproductpage("supportadmin");
        waitSleep(2000);
        isVisible(supportAdminPageObjects.Viewdetailsbtn2(),"View Details Button");
        LoggingUtils.info("SBL TC 28: View Product Page Redirection: Successful");
       // logout("supportadmin");
    }

    public void SBL_TC_29_IncorrectSearch() {
        goingtoViewproductpage("supportadmin");
        type(supportAdminPageObjects.Searchtxtbx(), "Search Textbox", propertyReader.getproperty("InvStoreNum"));
        LoggingUtils.info("SBL TC 29: Incorrect search leads to blank page: Successful");

       // logout("supportadmin");
    }

    public void SBL_TC_30_ShowEntries() {
        goingtoViewproductpage("supportadmin");
        waitSleep(5000);

        click(supportAdminPageObjects.entrydropdown(),"Entries");
        click(supportAdminPageObjects.entryoption10down(),"10 Entries");;
        LoggingUtils.info("clicked 10");
        click(supportAdminPageObjects.entrydropdown(),"Entries");
        click(supportAdminPageObjects.entryoption25down(),"25 Entries");
        LoggingUtils.info("clicked 25");
        click(supportAdminPageObjects.entrydropdown(),"Entries");
        click(supportAdminPageObjects.entryoption50down(),"50 Entries");
        LoggingUtils.info("clicked 50");
        click(supportAdminPageObjects.entrydropdown(),"Entries");
        click(supportAdminPageObjects.entryoption75down(),"75 Entries");
        LoggingUtils.info("clicked 75");
        click(supportAdminPageObjects.entrydropdown(),"Entries");
        click(supportAdminPageObjects.entryoption100down(),"100 Entries");
        LoggingUtils.info("clicked 100");
        click(supportAdminPageObjects.entrydropdown(),"Entries");
        click(supportAdminPageObjects.entryoptionalldown(),"All Entries");
        LoggingUtils.info("clicked All entries");
        LoggingUtils.info("SBL TC 30: Show Entries: Successful");

       // logout("supportadmin");
    }

    public void SBL_TC_31_ShowEntriesPageNavigation() {
        goingtoViewproductpage("supportadmin");
        waitSleep(5000);

        //10 entries
        click(supportAdminPageObjects.entrydropdown(),"Entries");
        click(supportAdminPageObjects.entryoption10down(),"10 Entries");;
        LoggingUtils.info("clicked 10");
        waitSleep(6000);
        nextpagex5("supportadmin");
        nextpagex5("supportadmin");
        nextpagex5("supportadmin");
        click(supportAdminPageObjects.nextbtn(), "Nextpage");
        click(supportAdminPageObjects.nextbtn(), "Nextpage");
        click(supportAdminPageObjects.nextbtn(), "Nextpage");
        previouspagex5("supportadmin");
        previouspagex5("supportadmin");
        previouspagex5("supportadmin");
        click(supportAdminPageObjects.previousbtn(), "Previous Button");
        click(supportAdminPageObjects.previousbtn(), "Previous Button");
        click(supportAdminPageObjects.previousbtn(), "Previous Button");

        LoggingUtils.info("SBL TC 31: Page Navigation: Successful");
       // logout("supportadmin");
    }

    public void SBL_TC_32_to_36_Searches() {
        goingtoViewproductpage("supportadmin");
        waitSleep(4000);

        type(supportAdminPageObjects.Searchtxtbx(), "Product ID Search", propertyReader.getproperty("productID2"));
        isDisplayed(supportAdminPageObjects.Viewdetailsbtn2());
        waitSleep(3000);
        supportAdminPageObjects.Searchtxtbx().clear();
        type(supportAdminPageObjects.Searchtxtbx(), "Barcode Search", propertyReader.getproperty("Barcode2"));
        isDisplayed(supportAdminPageObjects.Viewdetailsbtn2());
        waitSleep(3000);
        supportAdminPageObjects.Searchtxtbx().clear();
        type(supportAdminPageObjects.Searchtxtbx(), "Lot Number Search", propertyReader.getproperty("LotNumber2"));
        isDisplayed(supportAdminPageObjects.Viewdetailsbtn2());
        waitSleep(3000);
        supportAdminPageObjects.Searchtxtbx().clear();
        type(supportAdminPageObjects.Searchtxtbx(), "Style Name Search", propertyReader.getproperty("styleName2"));
        isDisplayed(supportAdminPageObjects.Viewdetailsbtn2());
        waitSleep(3000);
        supportAdminPageObjects.Searchtxtbx().clear();
        type(supportAdminPageObjects.Searchtxtbx(), "Product Type Search", propertyReader.getproperty("productType2"));
        isDisplayed(supportAdminPageObjects.Viewdetailsbtn2());
        waitSleep(3000);
        supportAdminPageObjects.Searchtxtbx().clear();
        type(supportAdminPageObjects.Searchtxtbx(), "Price Search", propertyReader.getproperty("price2"));
        isDisplayed(supportAdminPageObjects.Viewdetailsbtn2());
        waitSleep(3000);
        supportAdminPageObjects.Searchtxtbx().clear();

        LoggingUtils.info("SBL TC 32: Searches: Successful");
       // logout("supportadmin");
    }

    public void SBL_TC_37_DateFilter_EmptyList() {
        goingtoViewproductpage("supportadmin");
        waitSleep(3000);

        type(supportAdminPageObjects.Fromdateinput(), "", "02");
        type(supportAdminPageObjects.Fromdateinput(), "", "27");
        type(supportAdminPageObjects.Fromdateinput(), "", "1997");

        type(supportAdminPageObjects.Todateinput(), "","02");
        type(supportAdminPageObjects.Todateinput(), "","28");
        type(supportAdminPageObjects.Todateinput(), "","1997");

        LoggingUtils.info("SBL_TC_37 No Display Date Filter: Successful");
       // logout("supportadmin");
    }

    public void SBL_TC_38_DateFilter() {
        goingtoViewproductpage("supportadmin");
        waitSleep(3000);

        type(supportAdminPageObjects.Fromdateinput(), "", "04");
        type(supportAdminPageObjects.Fromdateinput(), "", "01");
        type(supportAdminPageObjects.Fromdateinput(), "", "2024");

        type(supportAdminPageObjects.Todateinput(), "", "04");
        type(supportAdminPageObjects.Todateinput(), "", "20");
        type(supportAdminPageObjects.Todateinput(), "", "2024");

        isVisible(supportAdminPageObjects.Viewdetailsbtn(),"View Details");

        LoggingUtils.info("SBL TC 38 Date Filter: Successful");
       // logout("supportadmin");
    }

    public void SBL_TC_39_EditPageRedirection() {
        goingtoViewDetailspage("supportadmin");

        isDisplayed(supportAdminPageObjects.editinfobtn());

        LoggingUtils.info("SBL TC 39 Edit Page Redirection: Successful");
       // logout("supportadmin");
    }

    public void SBL_TC_40_EditabilityofEditInfo() {
        goingtoViewDetailspage("supportadmin");

        click(supportAdminPageObjects.editinfobtn(),"Edit Info");
        click(supportAdminPageObjects.updateandsubmit(),"Update & Submit");
        waitSleep(2500);
        isDisplayed(supportAdminPageObjects.editinfobtn());
        LoggingUtils.info("SBL TC 40 Editability Function: Successful");

       // logout("supportadmin");
    }

    public void SBL_TC_41_EditInfo() {
        goingtoViewDetailspage("supportadmin");
        click(supportAdminPageObjects.editinfobtn(),"Edit Info");
        click(supportAdminPageObjects.availabilityforshop(),"Availability for shop");

        waitSleep(1000);
        click(supportAdminPageObjects.typeedit(),"type dropdown/textbox");
        waitSleep(1000);
        click(supportAdminPageObjects.typeedit2(),"type dropdown/textbox choice");

        click(supportAdminPageObjects.goldkaratsedit(),"gold karat dropdown/textbox");
        waitSleep(1000);
        click(supportAdminPageObjects.goldkaratsedit2(),"gold karat dropdown/textbox choice");

        click(supportAdminPageObjects.goldcoloredit()," gold color dropdown/textbox");
        waitSleep(1000);
        click(supportAdminPageObjects.goldcoloredit2()," gold color dropdown/textbox choice");

        click(supportAdminPageObjects.genderedit()," gender dropdown/textbox");
        waitSleep(1000);
        click(supportAdminPageObjects.genderedit2()," gender dropdown/textbox choice");

        click(supportAdminPageObjects.stoneedit(),"stone dropdown/textbox");
        waitSleep(1000);
        click(supportAdminPageObjects.stoneedit2(),"stone dropdown/textbox  choice");

        click(supportAdminPageObjects.stonecoloredit(),"stone color dropdown/textbox");
        waitSleep(1000);
        click(supportAdminPageObjects.stonecoloredit2(),"stone color dropdown/textbox choice");

        click(supportAdminPageObjects.conditionedit(),"condition dropdown/textbox");
        waitSleep(1000);
        click(supportAdminPageObjects.conditionedit2(),"condition dropdown/textbox choice");
        waitSleep(1000);

        click(supportAdminPageObjects.Quantitytxtbox(), "Quantity Textbox");
        supportAdminPageObjects.Quantitytxtbox().clear();
        supportAdminPageObjects.ProductSize().clear();
        supportAdminPageObjects.ItemWeighttxtbox().clear();
        supportAdminPageObjects.StyleNametxtbox().clear();
        supportAdminPageObjects.Notetxtbox().clear();
        click(supportAdminPageObjects.Barcodetxtbox(), "Barcode Textbox");
        supportAdminPageObjects.Barcodetxtbox().clear();
        supportAdminPageObjects.Lotnumbertxtbox().clear();
        supportAdminPageObjects.Costofsalestxtbox().clear();
        supportAdminPageObjects.grosssalestxtbox().clear();
        supportAdminPageObjects.pricetxtbox().clear();

        waitSleep(2000);
        type(supportAdminPageObjects.Quantitytxtbox(), "Changed Value", "2");
        type(supportAdminPageObjects.ProductSize(), "Changed Value", "6");
        type(supportAdminPageObjects.ItemWeighttxtbox(), "Changed Value", "6");
        type(supportAdminPageObjects.StyleNametxtbox(), "Changed Value", "testtest");
        type(supportAdminPageObjects.Notetxtbox(), "Changed Value", "testing the test");
        String quantityVal = getValue(supportAdminPageObjects.Quantitytxtbox());
        String sizeVal = getValue(supportAdminPageObjects.ProductSize());
        String itemweightVal = getValue(supportAdminPageObjects.ItemWeighttxtbox());
        String stylenameVal = getValue(supportAdminPageObjects.StyleNametxtbox());
        String notetextVal = getValue(supportAdminPageObjects.Notetxtbox());

        type(supportAdminPageObjects.Barcodetxtbox(), "Changed Value", "7654321");
        type(supportAdminPageObjects.Lotnumbertxtbox(), "Changed Value", "87654321");
        type(supportAdminPageObjects.Costofsalestxtbox(), "Changed Value", "2000");
        type(supportAdminPageObjects.grosssalestxtbox(), "Changed Value", "3000");
        type(supportAdminPageObjects.pricetxtbox(), "Changed Value", "2999");
//        String barcodeVal = getValue(supportAdminPageObjects.Barcodetxtbox());
//        String lotnumberVal = getValue(supportAdminPageObjects.Lotnumbertxtbox());
//        String costofsaleVal = getValue(supportAdminPageObjects.Costofsalestxtbox());
//        String grosssaleVal = getValue(supportAdminPageObjects.grosssalestxtbox());
//        String priceVal = getValue(supportAdminPageObjects.pricetxtbox());
//        waitSleep(2000);
//
//        assertEqual(getValue(supportAdminPageObjects.Quantitytxtbox()), quantityVal);
//        assertEqual(getValue(supportAdminPageObjects.ProductSize()), sizeVal);
//        assertEqual(getValue(supportAdminPageObjects.ItemWeighttxtbox()), itemweightVal);
//        assertEqual(getValue(supportAdminPageObjects.StyleNametxtbox()), stylenameVal);
//        assertEqual(getValue(supportAdminPageObjects.Notetxtbox()), notetextVal);
//
//        assertEqual(getValue(supportAdminPageObjects.Barcodetxtbox()), barcodeVal);
//        assertEqual(getValue(supportAdminPageObjects.Lotnumbertxtbox()), lotnumberVal);
//        assertEqual(getValue(supportAdminPageObjects.Costofsalestxtbox()), costofsaleVal);
//        assertEqual(getValue(supportAdminPageObjects.grosssalestxtbox()), grosssaleVal);
//        assertEqual(getValue(supportAdminPageObjects.pricetxtbox()), priceVal);

        LoggingUtils.info("SBL TC 41 Edited Info: Successful");
    }

    public void SBL_TC_42_BlankFields_NeedInputs() {
        goingtoViewDetailspage("supportadmin");
        click(supportAdminPageObjects.editinfobtn(),"Edit Info");
        click(supportAdminPageObjects.availabilityforshop(),"Availability for shop");

        waitSleep(1000);
        click(supportAdminPageObjects.typeedit(),"type dropdown/textbox");
        waitSleep(1000);
        click(supportAdminPageObjects.typeedit2(),"type dropdown/textbox choice");

        click(supportAdminPageObjects.goldkaratsedit(),"gold karat dropdown/textbox");
        waitSleep(1000);
        click(supportAdminPageObjects.goldkaratsedit2(),"gold karat dropdown/textbox choice");

        click(supportAdminPageObjects.goldcoloredit()," gold color dropdown/textbox");
        waitSleep(1000);
        click(supportAdminPageObjects.goldcoloredit2()," gold color dropdown/textbox choice");

        click(supportAdminPageObjects.genderedit()," gender dropdown/textbox");
        waitSleep(1000);
        click(supportAdminPageObjects.genderedit2()," gender dropdown/textbox choice");

        click(supportAdminPageObjects.stoneedit(),"stone dropdown/textbox");
        waitSleep(1000);
        click(supportAdminPageObjects.stoneedit2(),"stone dropdown/textbox  choice");

        click(supportAdminPageObjects.stonecoloredit(),"stone color dropdown/textbox");
        waitSleep(1000);
        click(supportAdminPageObjects.stonecoloredit2(),"stone color dropdown/textbox choice");

        click(supportAdminPageObjects.conditionedit(),"condition dropdown/textbox");
        waitSleep(1000);
        click(supportAdminPageObjects.conditionedit2(),"condition dropdown/textbox choice");
        waitSleep(1000);

        click(supportAdminPageObjects.Quantitytxtbox(), "Quantity Textbox");
        supportAdminPageObjects.Quantitytxtbox().clear();
        supportAdminPageObjects.ProductSize().clear();
        supportAdminPageObjects.ItemWeighttxtbox().clear();
        supportAdminPageObjects.StyleNametxtbox().clear();
        supportAdminPageObjects.Notetxtbox().clear();
        click(supportAdminPageObjects.Barcodetxtbox(), "Barcode Textbox");
        supportAdminPageObjects.Barcodetxtbox().clear();
        supportAdminPageObjects.Lotnumbertxtbox().clear();
        supportAdminPageObjects.Costofsalestxtbox().clear();
        supportAdminPageObjects.grosssalestxtbox().clear();
        supportAdminPageObjects.pricetxtbox().clear();

        click(supportAdminPageObjects.updateandsubmit(),"Update and submit Button");

        LoggingUtils.info("SBL TC 42 Need Input in Empty fields: Successful");
    }

    public void SBL_TC_43_ShippingDetailsFunctionality() {
        goingtoViewDetailspage("supportadmin");

        click(supportAdminPageObjects.editinfobtn(),"Edit Info");
        click(supportAdminPageObjects.availabilityforshop(),"Availability for shop");
        click(supportAdminPageObjects.packagingdropdown(),"Package Dropdown");
        click(supportAdminPageObjects.packagingchoice(),"Package Choice");

        click(supportAdminPageObjects.sizedropdown(),"Size Dropdown");
        click(supportAdminPageObjects.sizesmall(),"Small Choice");
        click(supportAdminPageObjects.sizemedium(),"Medium Dropdown");
        click(supportAdminPageObjects.sizeslarge(),"Large Choice");

        click(supportAdminPageObjects.courierdropdown(),"Courier Dropdown");
        click(supportAdminPageObjects.courierchoice(),"Courier Choice");

        LoggingUtils.info("SBL TC 43 Shipping Details Functionality: Successful");
       // logout("supportadmin");
    }

    public void SBL_TC_44_DropDown_Functionality() {
        goingtoViewDetailspage("supportadmin");

        click(supportAdminPageObjects.editinfobtn(),"Edit Info");
        click(supportAdminPageObjects.availabilityforshop(),"Availability for shop");
        typeEnter(supportAdminPageObjects.typedropdown(),"Type","necklace");
        typeEnter(supportAdminPageObjects.goldkaratsdropdown(),"Gold Karats","18k");
        typeEnter(supportAdminPageObjects.goldcolorsdropdown(),"Gold Colors","tri");
        typeEnter(supportAdminPageObjects.genderdropdown(),"Gender","uni");
        typeEnter(supportAdminPageObjects.stonedropdown(),"Stone","citri");
        typeEnter(supportAdminPageObjects.stonecolordropdown(),"Stone Color","pink");
        typeEnter(supportAdminPageObjects.conditiondropdown(),"Condition","refurb");
        waitSleep(3000);

        LoggingUtils.info("SBL TC 44 Drop Down Functionality: Successful");
       // logout("supportadmin");
    }

    public void SBL_TC_45_ValidateChangesMade() {
        goingtoViewDetailspage("supportadmin");
        click(supportAdminPageObjects.editinfobtn(),"Edit Info");
        click(supportAdminPageObjects.availabilityforshop(),"Availability for shop");

        waitSleep(1000);
        click(supportAdminPageObjects.typeedit(),"type dropdown/textbox");
        waitSleep(1000);
        click(supportAdminPageObjects.typeedit2(),"type dropdown/textbox choice");

        click(supportAdminPageObjects.goldkaratsedit(),"gold karat dropdown/textbox");
        waitSleep(1000);
        click(supportAdminPageObjects.goldkaratsedit2(),"gold karat dropdown/textbox choice");

        click(supportAdminPageObjects.goldcoloredit()," gold color dropdown/textbox");
        waitSleep(1000);
        click(supportAdminPageObjects.goldcoloredit2()," gold color dropdown/textbox choice");

        click(supportAdminPageObjects.genderedit()," gender dropdown/textbox");
        waitSleep(1000);
        click(supportAdminPageObjects.genderedit2()," gender dropdown/textbox choice");

        click(supportAdminPageObjects.stoneedit(),"stone dropdown/textbox");
        waitSleep(1000);
        click(supportAdminPageObjects.stoneedit2(),"stone dropdown/textbox  choice");

        click(supportAdminPageObjects.stonecoloredit(),"stone color dropdown/textbox");
        waitSleep(1000);
        click(supportAdminPageObjects.stonecoloredit2(),"stone color dropdown/textbox choice");

        click(supportAdminPageObjects.conditionedit(),"condition dropdown/textbox");
        waitSleep(1000);
        click(supportAdminPageObjects.conditionedit2(),"condition dropdown/textbox choice");
        waitSleep(1000);

        click(supportAdminPageObjects.Quantitytxtbox(), "Quantity Textbox");
        supportAdminPageObjects.Quantitytxtbox().clear();
        supportAdminPageObjects.ProductSize().clear();
        supportAdminPageObjects.ItemWeighttxtbox().clear();
        supportAdminPageObjects.StyleNametxtbox().clear();
        supportAdminPageObjects.Notetxtbox().clear();
        click(supportAdminPageObjects.Barcodetxtbox(), "Barcode Textbox");
        supportAdminPageObjects.Barcodetxtbox().clear();
        supportAdminPageObjects.Lotnumbertxtbox().clear();
        supportAdminPageObjects.Costofsalestxtbox().clear();
        supportAdminPageObjects.grosssalestxtbox().clear();
        supportAdminPageObjects.pricetxtbox().clear();

        type(supportAdminPageObjects.Quantitytxtbox(), "Changed Value", "2");
        type(supportAdminPageObjects.ProductSize(), "Changed Value", "6");
        type(supportAdminPageObjects.ItemWeighttxtbox(), "Changed Value", "6");
        type(supportAdminPageObjects.StyleNametxtbox(), "Changed Value", "testtest");
        type(supportAdminPageObjects.Notetxtbox(), "Changed Value", "testing the test");
        String quantityVal = getValue(supportAdminPageObjects.Quantitytxtbox());
        String sizeVal = getValue(supportAdminPageObjects.ProductSize());
        String itemweightVal = getValue(supportAdminPageObjects.ItemWeighttxtbox());
        String stylenameVal = getValue(supportAdminPageObjects.StyleNametxtbox());
        String notetextVal = getValue(supportAdminPageObjects.Notetxtbox());

        type(supportAdminPageObjects.Barcodetxtbox(), "Changed Value", "7654321");
        type(supportAdminPageObjects.Lotnumbertxtbox(), "Changed Value", "87654321");
        type(supportAdminPageObjects.Costofsalestxtbox(), "Changed Value", "2000.00");
        type(supportAdminPageObjects.grosssalestxtbox(), "Changed Value", "3000.00");
        type(supportAdminPageObjects.pricetxtbox(), "Changed Value", "2999.00");
        String barcodeVal = getValue(supportAdminPageObjects.Barcodetxtbox());
        String lotnumberVal = getValue(supportAdminPageObjects.Lotnumbertxtbox());
        String costofsaleVal = getValue(supportAdminPageObjects.Costofsalestxtbox());
        String grosssaleVal = getValue(supportAdminPageObjects.grosssalestxtbox());
        String priceVal = getValue(supportAdminPageObjects.pricetxtbox());
        waitSleep(1500);

        click(supportAdminPageObjects.updateandsubmit(),"");
        waitSleep(3000);

        assertEqual(getValue(supportAdminPageObjects.Quantitytxtbox()), quantityVal);
        assertEqual(getValue(supportAdminPageObjects.ProductSize()), sizeVal);
        assertEqual(getValue(supportAdminPageObjects.ItemWeighttxtbox()), itemweightVal);
        assertEqual(getValue(supportAdminPageObjects.StyleNametxtbox()), stylenameVal);
        assertEqual(getValue(supportAdminPageObjects.Notetxtbox()), notetextVal);

        assertEqual(getValue(supportAdminPageObjects.Barcodetxtbox()), barcodeVal);
        assertEqual(getValue(supportAdminPageObjects.Lotnumbertxtbox()), lotnumberVal);
        assertEqual(getValue(supportAdminPageObjects.Costofsalestxtbox()), costofsaleVal);
        assertEqual(getValue(supportAdminPageObjects.grosssalestxtbox()), grosssaleVal);
        assertEqual(getValue(supportAdminPageObjects.pricetxtbox()), priceVal);
        passTest("SBL_TC_45_ValidateChangesMade", "Passed!!!" );

    }

    public void SBL_TC_46_CancelButtonFunctionality() {
        goingtoViewDetailspage("supportadmin");
        click(supportAdminPageObjects.editinfobtn(),"Edit Info");
        waitSleep(1500);
        isDisplayed(supportAdminPageObjects.cancelbtn());
        waitSleep(2000);
        click(supportAdminPageObjects.cancelbtn(),"Cancel Button");
        waitSleep(1500);
        isDisplayed(supportAdminPageObjects.editinfobtn());

        LoggingUtils.info("SBL TC 46 Cancel Button Functionality: Successful");
       // logout("supportadmin");
    }

    public void SBL_TC_47_MerchantTabRedirection() {
       
        waitSleep(2000);

        dashboardnavigation("supportadmin");
        click(supportAdminPageObjects.merchantsbtn(),"Merchant Button");
        waitSleep(2000);
        isDisplayed(supportAdminPageObjects.viewmerchantbtn());

        LoggingUtils.info("SBL TC 47 Merchant Tab Redirection: Successful");
       // logout("supportadmin");
    }

    public void SBL_TC_48_UpdateMerchantPopUp() {
       
        waitSleep(2000);

        merchantnavigation("supportadmin");
        click(supportAdminPageObjects.viewmerchantbtn(),"View Merchant Details button");
        isDisplayed(supportAdminPageObjects.editinfomerchant());
        waitSleep(2000);
        click(supportAdminPageObjects.exitbutton(),"Exit Button");

        LoggingUtils.info("SBL TC 48 View Merchant Pop-up: Successful");
       // logout("supportadmin");
    }

    public void SBL_TC_49_and_50_and_51_StatusChangeAndSubmitButtonFeature() {
       
        waitSleep(2000);
        merchantnavigation("supportadmin");

        click(supportAdminPageObjects.viewmerchantbtn(),"View Merchant Details button");
        waitSleep(2000);
        typeEnter(supportAdminPageObjects.Statusdropdown(),"Status","deactivate");
        waitSleep(2000);
        click(supportAdminPageObjects.submitbtnmerchant(),"Submit button pressed");
        waitSleep(2500);
        LoggingUtils.info("SBL TC 49_Status Change to Deactivated: Successful");
        //reversion
        click(supportAdminPageObjects.viewmerchantbtn(),"View Merchant Details button");
        waitSleep(2000);
        typeEnter(supportAdminPageObjects.Statusdropdown(),"Status","activate");
        waitSleep(2000);
        click(supportAdminPageObjects.submitbtnmerchant(),"Submit button pressed");
        waitSleep(2500);
        click(supportAdminPageObjects.viewmerchantbtn(),"View Merchant Details button");
        waitSleep(2000);
        click(supportAdminPageObjects.exitbutton(),"exit");
        LoggingUtils.info("SBL TC 50 Status Change to Activated: Successful");
        waitSleep(2000);

        LoggingUtils.info("SBL TC 51 Submit Button Utilization: Successful");
       // logout("supportadmin");
    }

    public void SBL_TC_52_EmptyfieldErrors() {
       
        waitSleep(2000);
        merchantnavigation("supportadmin");

        click(supportAdminPageObjects.editablemerchantbtn(),"View Merchant Details button");
        waitSleep(2000);
        click(supportAdminPageObjects.editinfomerchant(),"Edit Info");
        waitSleep(2000);
        supportAdminPageObjects.contactnum().clear();
        supportAdminPageObjects.storeemail().clear();
        waitSleep(2000);
        typeEnter(supportAdminPageObjects.provincedrop(),"Province Text box and Drop Down","abra");
        waitSleep(3000);
        click(supportAdminPageObjects.submitbtnmerchant(),"Submit button pressed");
        waitSleep(2500);
        isVisible(supportAdminPageObjects.errorstore(),"Error Prompt");
        waitSleep(2000);
        click(supportAdminPageObjects.exitbutton(),"Exit Button");

        LoggingUtils.info("SBL TC 52 Empty Field Errors : Successful");
       // logout("supportadmin");
    }

    public void SBL_TC_53_UpdateInfoMerchant() {
       
        waitSleep(2000);
        merchantnavigation("supportadmin");

        click(supportAdminPageObjects.editablemerchantbtn(),"View Merchant Details button");
        waitSleep(2000);
        click(supportAdminPageObjects.editinfomerchant(),"Edit Info");
        waitSleep(2000);
        supportAdminPageObjects.contactnum().clear();
        supportAdminPageObjects.storeemail().clear();
        waitSleep(2000);
        type(supportAdminPageObjects.contactnum(),"Contact number", "09667363535");
        type(supportAdminPageObjects.storeemail(),"Store Email","dboss.melgs@mlhuillier.com");
        waitSleep(2000);
        typeEnter(supportAdminPageObjects.provincedrop(),"Province Text box and Drop Down","abra");
        waitSleep(3000);
        typeEnter(supportAdminPageObjects.citydrop(),"City Text box and Drop Down","bang");
        waitSleep(3000);
        typeEnter(supportAdminPageObjects.branchnamedrop(),"City Text box and Drop Down","ML");
        waitSleep(3000);
        click(supportAdminPageObjects.submitbtnmerchant(),"Submit button pressed");
        waitSleep(3500);

        //Reversion
        LoggingUtils.info("Update Reversal");
        click(supportAdminPageObjects.editablemerchantbtn(),"View Merchant Details button");
        waitSleep(2000);
        click(supportAdminPageObjects.editinfomerchant(),"Edit Info");
        waitSleep(2000);
        supportAdminPageObjects.contactnum().clear();
        supportAdminPageObjects.storeemail().clear();
        waitSleep(2000);
        type(supportAdminPageObjects.contactnum(),"Contact number", "09224234322");
        type(supportAdminPageObjects.storeemail(),"Store Email","joshua.saja@mlhuillier.com");
        waitSleep(2000);
        typeEnter(supportAdminPageObjects.provincedrop(),"Province Text box and Drop Down","antiq");
        waitSleep(3000);
        typeEnter(supportAdminPageObjects.citydrop(),"City Text box and Drop Down","antiq");
        waitSleep(3000);
        typeEnter(supportAdminPageObjects.branchnamedrop(),"City Text box and Drop Down","ML");
        waitSleep(3000);
        click(supportAdminPageObjects.submitbtnmerchant(),"Submit button pressed");
        waitSleep(2500);

        LoggingUtils.info("SBL TC 53 Update Info : Successful");
       // logout("supportadmin");
    }

    //merchant issue: use arrow keys to get merchant in drop down
    public void SBL_TC_54() {
       
        waitSleep(2000);
        merchantnavigation("supportadmin");

        click(supportAdminPageObjects.editablemerchant2btn(),"View Merchant Details button");
        waitSleep(2000);
        typeEnter(supportAdminPageObjects.statustextboxmerchant(),"select Status","status");
        waitSleep(2000);
        typeEnter(supportAdminPageObjects.statustextboxmerchant(),"select Status","merchant");
        waitSleep(2000);


        LoggingUtils.info("SBL TC 54 : Successful");
       // logout("supportadmin");
    }

    //?
    public void SBL_TC_55_AddstorestoMerchant() {
       
        waitSleep(2000);
        merchantnavigation("supportadmin");

        click(supportAdminPageObjects.editablemerchantbtn(),"View Merchant Details button");
        waitSleep(2000);
        click(supportAdminPageObjects.viewstores(),"View Stores");
        waitSleep(1500);
        click(supportAdminPageObjects.mercadodefrancis(),"Store Selected");
        click(supportAdminPageObjects.mlshopjewlery(),"Store Selected");
        click(supportAdminPageObjects.submitbtnmerchant(),"Submit Button");
        waitSleep(2000);

        click(supportAdminPageObjects.editablemerchantbtn(),"View Merchant Details button");
        waitSleep(2000);
        click(supportAdminPageObjects.viewstores(),"View Stores");
        waitSleep(1500);
        click(supportAdminPageObjects.exitbutton(),"Exit Button");

        LoggingUtils.info("SBL TC 55 Chosen and Verified Store Changes: Successful");
        waitSleep(1500);
       // logout("supportadmin");
    }



















































}
