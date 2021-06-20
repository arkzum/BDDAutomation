package com.Test.Arunkumar.PageActions;

import com.Test.Arunkumar.Framework.Context;
import com.Test.Arunkumar.PageLocators.OrderHistoryLocators;

public class OrderHistoryActions extends OrderHistoryLocators {

    public void navigateToTshirts() {
        click(megaMenuTshirt);
    }

    public String getProductPrice() {
        scrollByLocator(plpProductImage);
        mouseHoverTo(plpProductImage, "product");
        String price = getText(plpProductPrice);
        setScenarioContext(Context.UNITPRICE,price);
        return price;
    }

    public void addToCartFromPlp() {
        click(btnAddToCart);
    }

    public void validateCartPrice() {
        validateText(getText(cartProductPrice),getScenarioContext(Context.UNITPRICE));
    }
    public void getCartAttributes() {
        setScenarioContext(Context.QUANTITY,getText(productQuantity));
        setScenarioContext(Context.SHIPPINGCOST,getText(cartShippingCost));
        setScenarioContext(Context.TOTALPRICE,getText(cartTotalPrice));
        setScenarioContext(Context.PRODUCT,getText(productName));

    }

    public void clickProceedToCheckout() {
        click(btnProceedToCheckOut);
    }

    public void validateSummaryPageAttributes(){
        validateText(getText(totalProductPrice),getScenarioContext(Context.UNITPRICE));
        validateText(getText(totalShippingCost),getScenarioContext(Context.SHIPPINGCOST));
        setScenarioContext(Context.PRICEINCLTAX,getText(totalPriceWithTax));
    }

    public void clickProceedToCheckoutInSummary() {
        click(btnSummaryProceedToCheckOut);
    }

    public void clickProceedToCheckoutInAddressPage() {
        click(btnAddressProceedToCheckOut);
    }

    public void selectPaymentMethod() {
        click(paymentMode);
        validateText(getText(confirmationTotalAmount),getScenarioContext(Context.PRICEINCLTAX));
    }

    public void checkTermsandConditions() {
        driver.findElement(chkTermsOfService).click();
    }

    public void confirmOrder() {
        click(btnOrderConfirmation);
    }
    public void getOrderRef(){

        String orderRef = driver.findElement(orderReferenceNumber).getText().trim();
        int end = orderRef.indexOf(" in the subject of your bank wire.");
        orderRef = orderRef.substring(end-9,end);
        addStepLog("order Reference number is : " +orderRef);
        setScenarioContext(Context.ORDERREF,orderRef);

    }

    public void clickProceedToCheckoutInShippingPage() {
        click(btnShippingConfirmation);
    }
}
