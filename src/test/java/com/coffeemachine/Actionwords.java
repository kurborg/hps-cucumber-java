package com.coffeemachine;

public class Actionwords {

    public void iStartTheCoffeeMachineUsingLanguageLang(String lang) {
        // TODO: Implement action: String.format("Start the coffee machine using language %s", lang)
        throw new UnsupportedOperationException();
    }

    public void iShutdownTheCoffeeMachine() {
        // TODO: Implement action: "Shutdown coffee machine"
        throw new UnsupportedOperationException();
    }

    public void messageMessageShouldBeDisplayed(String message) {
        // TODO: Implement result: String.format("Displayed message is \"%s\"", message)
        throw new UnsupportedOperationException();
    }

    public void coffeeShouldBeServed() {
        // TODO: Implement result: "Coffee is served :)"
        throw new UnsupportedOperationException();
    }

    public void coffeeShouldNotBeServed() {
        // TODO: Implement result: "No coffee is served :("
        throw new UnsupportedOperationException();
    }

    public void iTakeACoffee() {
        // TODO: Implement action: "Take a coffee"
        throw new UnsupportedOperationException();
    }

    public void iEmptyTheCoffeeGrounds() {
        // TODO: Implement action: "Empty coffee grounds"
        throw new UnsupportedOperationException();
    }

    public void iFillTheBeansTank() {
        // TODO: Implement action: "Fill beans"
        throw new UnsupportedOperationException();
    }

    public void iFillTheWaterTank() {
        // TODO: Implement action: "Fill water tank"
        throw new UnsupportedOperationException();
    }

    public void iTakeCoffeeNumberCoffees(String coffeeNumber) {

    }

    public void theCoffeeMachineIsStarted() {
        iStartTheCoffeeMachineUsingLanguageLang("en");
    }

    public void iHandleEverythingExceptTheWaterTank() {
        iHandleCoffeeGrounds();
        iHandleBeans();
    }

    public void iHandleWaterTank() {

    }

    public void iHandleBeans() {

    }

    public void iHandleCoffeeGrounds() {

    }

    public void iHandleEverythingExceptTheBeans() {
        iHandleWaterTank();
        iHandleCoffeeGrounds();
    }

    public void iHandleEverythingExceptTheGrounds() {
        iHandleWaterTank();
        iHandleBeans();
    }

    public void displayedMessageIs(String freeText) {
        messageMessageShouldBeDisplayed(freeText);
    }

    public void iSwitchToSettingsMode() {

    }

    public void settingsShouldBe(DataTable datatable) {

    }
}