package MLshopBuilders.actual;

import MLshopBuilders.base.BaseTest;
import mlshopbuilder.testSteps.SupportAdmin_Steps;
import org.testng.annotations.Test;
import utilities.ExtentReport.ExtentReporter;

public class SupportAdminT extends BaseTest{


    @Test(priority = 0, description = "Login using Support Admin account")
    public void SBL_TC_01_SuppAdminLogIn() throws Exception {
        loginSteps.loginByRole("supportadmin");
        if (loginSteps.isInHomePage()) {
            ExtentReporter.logPass("SBL_TC_01_SuppAdminLogIn", "Successfully Logged in  Supp Administrator");
        }
    }
    @Test(priority =2, dependsOnMethods = "SBL_TC_01_SuppAdminLogIn")
    public void SBL_TC_02_ShopbuilderpageNavigation() throws Exception {
        supportAdminSteps.SBL_TC_02_ShopbuilderpageNavigation();
    }
    @Test(priority =3, dependsOnMethods = "SBL_TC_01_SuppAdminLogIn")
    public void SBL_TC_03_MerchantNavigation() throws Exception {
        supportAdminSteps.SBL_TC_03_MerchantNavigation();
    }
    @Test(priority =4, dependsOnMethods = "SBL_TC_01_SuppAdminLogIn")
    public void SBL_TC_04_and_05_TotalStores_and_NewlyAddedStore() throws Exception {
        supportAdminSteps.SBL_TC_04_and_05_TotalStores_and_NewlyAddedStore();
    }
    @Test(priority =5, dependsOnMethods = "SBL_TC_01_SuppAdminLogIn")
    public void SBL_TC_06_and_07_ShopBuilderNavigation_and_TotalStoreCount() throws Exception {
        supportAdminSteps.SBL_TC_06_and_07_ShopBuilderNavigation_and_TotalStoreCount();
    }
    @Test(priority =6, dependsOnMethods = "SBL_TC_01_SuppAdminLogIn")
    public void SBL_TC_08_InvalidStoreSearch() throws Exception {
        supportAdminSteps.SBL_TC_08_InvalidStoreSearch();
    }
    @Test(priority =7, dependsOnMethods = "SBL_TC_01_SuppAdminLogIn")
    public void SBL_TC_09_ValidStoreSearch() throws Exception {
        supportAdminSteps.SBL_TC_09_ValidStoreSearch();
    }
    @Test(priority =8, dependsOnMethods = "SBL_TC_01_SuppAdminLogIn")
    public void SBL_TC_10_jewelryShopRedirection() throws Exception {
        supportAdminSteps.SBL_TC_10_jewelryShopRedirection();
    }
    @Test(priority =9, dependsOnMethods = "SBL_TC_01_SuppAdminLogIn")
    public void SBL_TC_11_MLWatchShopRedirection() throws Exception {
        supportAdminSteps.SBL_TC_11_MLWatchShopRedirection();
    }
    @Test(priority =10, dependsOnMethods = "SBL_TC_01_SuppAdminLogIn")
    public void SBL_TC_12_to_15_EditProfile() throws Exception {
        supportAdminSteps.SBL_TC_12_to_15_EditProfile();
    }
    @Test(priority =11, dependsOnMethods = "SBL_TC_01_SuppAdminLogIn")
    public void SBL_TC_16_17_EditBannerAndCancelEditBanner() throws Exception {
        supportAdminSteps.SBL_TC_16_17_EditBannerAndCancelEditBanner();
    }
//    @Test(priority =12, dependsOnMethods = "SBL_TC_01_SuppAdminLogIn")
//    public void SBL_TC_18_to_21_AddBanner() throws Exception {
//        supportAdminSteps.SBL_TC_18_to_21_AddBanner();
//    }
    @Test(priority =13, dependsOnMethods = "SBL_TC_01_SuppAdminLogIn")
    public void SBL_TC_22_AddproductRedirection() throws Exception {
        supportAdminSteps.SBL_TC_22_AddproductRedirection();
    }
//    @Test(priority =14, dependsOnMethods = "SBL_TC_01_SuppAdminLogIn")
//    public void SBL_TC_23_and_24_ProductandSalesInput() throws Exception {
//        supportAdminSteps.SBL_TC_23_and_24_ProductandSalesInput();
//    }
//   @Test(priority =15, dependsOnMethods = "SBL_TC_01_SuppAdminLogIn")
//  public void SBR_TC_25_ImageUpload() throws Exception {
//        supportAdminSteps.SBR_TC_25_ImageUpload();
//    }
    @Test(priority =16, dependsOnMethods = "SBL_TC_01_SuppAdminLogIn")
    public void SBL_TC_26_InputsRequired() throws Exception {
        supportAdminSteps.SBL_TC_26_InputsRequired();
    }
    @Test(priority =17, dependsOnMethods = "SBL_TC_01_SuppAdminLogIn")
    public void SBL_TC_27_SubmitAndPublish() throws Exception {
        supportAdminSteps.SBL_TC_27_SubmitAndPublish();
    }
    @Test(priority =18, dependsOnMethods = "SBL_TC_01_SuppAdminLogIn")
    public void SBL_TC_28_ViewProductRedirection() throws Exception {
    supportAdminSteps.SBL_TC_28_ViewProductRedirection();
}
    @Test(priority =19, dependsOnMethods = "SBL_TC_01_SuppAdminLogIn")
    public void SBL_TC_29_IncorrectSearch() throws Exception {
        supportAdminSteps.SBL_TC_29_IncorrectSearch();
    }
    @Test(priority =20, dependsOnMethods = "SBL_TC_01_SuppAdminLogIn")
    public void SBL_TC_30_ShowEntries() throws Exception {
        supportAdminSteps.SBL_TC_30_ShowEntries();
    }
    @Test(priority =21, dependsOnMethods = "SBL_TC_01_SuppAdminLogIn")
    public void SBL_TC_31_ShowEntriesPageNavigation() throws Exception {
        supportAdminSteps.SBL_TC_31_ShowEntriesPageNavigation();
    }
//    @Test(priority =22)
//    public void SBL_TC_31_ShowEntriesPageNavigation() throws Exception {
//        supportAdminSteps.SBL_TC_31_ShowEntriesPageNavigation();
//    }
    @Test(priority =23, dependsOnMethods = "SBL_TC_01_SuppAdminLogIn")
    public void SBL_TC_32_to_36_Searches() throws Exception {
        supportAdminSteps.SBL_TC_32_to_36_Searches();
    }
    @Test(priority =24, dependsOnMethods = "SBL_TC_01_SuppAdminLogIn")
    public void SBL_TC_37_DateFilter_EmptyList() throws Exception {
        supportAdminSteps.SBL_TC_37_DateFilter_EmptyList();
    }
    @Test(priority =25, dependsOnMethods = "SBL_TC_01_SuppAdminLogIn")
    public void SBL_TC_38_DateFilter() throws Exception {
        supportAdminSteps.SBL_TC_38_DateFilter();
    }
    @Test(priority =26, dependsOnMethods = "SBL_TC_01_SuppAdminLogIn")
    public void SBL_TC_39_EditPageRedirection() throws Exception {
        supportAdminSteps.SBL_TC_39_EditPageRedirection();
    }
    @Test(priority =27, dependsOnMethods = "SBL_TC_01_SuppAdminLogIn")
    public void SBL_TC_40_EditabilityofEditInfo() throws Exception {
        supportAdminSteps.SBL_TC_40_EditabilityofEditInfo();
    }
    @Test(priority =28, dependsOnMethods = "SBL_TC_01_SuppAdminLogIn")
    public void SBL_TC_41_EditInfo() throws Exception {
        supportAdminSteps.SBL_TC_41_EditInfo();
    }
    @Test(priority =29, dependsOnMethods = "SBL_TC_01_SuppAdminLogIn")
    public void SBL_TC_42_BlankFields_NeedInputs() throws Exception {
        supportAdminSteps.SBL_TC_42_BlankFields_NeedInputs();
    }
    @Test(priority =30, dependsOnMethods = "SBL_TC_01_SuppAdminLogIn")
    public void SBL_TC_43_ShippingDetailsFunctionality() throws Exception {
        supportAdminSteps.SBL_TC_43_ShippingDetailsFunctionality();
    }
    @Test(priority =31, dependsOnMethods = "SBL_TC_01_SuppAdminLogIn")
    public void SBL_TC_44_DropDown_Functionality() throws Exception {
        supportAdminSteps.SBL_TC_44_DropDown_Functionality();
    }
    @Test(priority =32, dependsOnMethods = "SBL_TC_01_SuppAdminLogIn")
    public void SBL_TC_45_ValidateChangesMade() throws Exception {
        supportAdminSteps.SBL_TC_45_ValidateChangesMade();
    }
    @Test(priority =32, dependsOnMethods = "SBL_TC_01_SuppAdminLogIn")
    public void SBL_TC_46_CancelButtonFunctionality() throws Exception {
        supportAdminSteps.SBL_TC_46_CancelButtonFunctionality();
    }
    @Test(priority =33, dependsOnMethods = "SBL_TC_01_SuppAdminLogIn")
    public void SBL_TC_47_MerchantTabRedirection() throws Exception {
        supportAdminSteps.SBL_TC_47_MerchantTabRedirection();
    }
    @Test(priority =34, dependsOnMethods = "SBL_TC_01_SuppAdminLogIn")
    public void SBL_TC_48_UpdateMerchantPopUp() throws Exception {
        supportAdminSteps.SBL_TC_48_UpdateMerchantPopUp();
    }
    @Test(priority =35, dependsOnMethods = "SBL_TC_01_SuppAdminLogIn")
    public void SBL_TC_49_and_50_and_51_StatusChangeAndSubmitButtonFeature() throws Exception {
        supportAdminSteps.SBL_TC_49_and_50_and_51_StatusChangeAndSubmitButtonFeature();
    }
    @Test(priority =36, dependsOnMethods = "SBL_TC_01_SuppAdminLogIn")
    public void SBL_TC_52_EmptyfieldErrors() throws Exception {
        supportAdminSteps.SBL_TC_52_EmptyfieldErrors();
    }
    @Test(priority =37, dependsOnMethods = "SBL_TC_01_SuppAdminLogIn")
    public void SBL_TC_53_UpdateInfoMerchant() throws Exception {
        supportAdminSteps.SBL_TC_53_UpdateInfoMerchant();
    }
//
//    //way labot pa
//    @Test(priority =38)
//    public void SBL_TC_54() throws Exception {
//        supportAdminSteps.SBL_TC_54();
//    }
    @Test(priority =39, dependsOnMethods = "SBL_TC_01_SuppAdminLogIn")
    public void SBL_TC_55_AddstorestoMerchant() throws Exception {
        supportAdminSteps.SBL_TC_55_AddstorestoMerchant();
    }
}

//coommit

