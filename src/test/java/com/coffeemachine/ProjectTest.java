package com.coffeemachine;

import junit.framework.TestCase;

public class ProjectTest extends TestCase {

    public Actionwords actionwords = new Actionwords();
    public void messagesAreBasedOnLanguage(String readyMessage, String language) {
        // Tags: priority:medium
        // When I start the coffee machine using language "<language>"
        actionwords.iStartTheCoffeeMachineUsingLanguageLang(language);
        // Then message "<ready_message>" should be displayed
        actionwords.messageMessageShouldBeDisplayed(readyMessage);
    }

    public void testMessagesAreBasedOnLanguageEnglish() {
        messagesAreBasedOnLanguage("Ready", "en");
    }

    public void testMessagesAreBasedOnLanguageFrench() {
        messagesAreBasedOnLanguage("Pret", "fr");
    }


    //
    // Tags: priority:high
    public void testWhenTheWaterTankIsFilledTheMessageDisappears() {
        // When I take "55" coffees
        actionwords.iTakeCoffeeNumberCoffees(55);
        // And I fill the water tank
        actionwords.iFillTheWaterTank();
        // Then message "Ready" should be displayed
        actionwords.messageMessageShouldBeDisplayed("Ready");
    }
    //
    // Tags: priority:low
    public void testItIsPossibleToTake10CoffeesAfterTheMessageFillWaterTankIsDisplayed() {
        // When I take "60" coffees
        actionwords.iTakeCoffeeNumberCoffees(60);
        // Then coffee should be served
        actionwords.coffeeShouldBeServed();
        // When I take a coffee
        actionwords.iTakeACoffee();
        // Then coffee should not be served
        actionwords.coffeeShouldNotBeServed();
    }
    //
    // Tags: priority:medium
    public void testWhenTheGroundsAreEmptiedMessageIsRemoved() {
        // When I take "30" coffees
        actionwords.iTakeCoffeeNumberCoffees(30);
        // And I empty the coffee grounds
        actionwords.iEmptyTheCoffeeGrounds();
        // Then message "Ready" should be displayed
        actionwords.messageMessageShouldBeDisplayed("Ready");
    }
    //
    // Tags: priority:high
    public void testAfterAddingBeansTheMessageFillBeansDisappears() {
        // When I take "40" coffees
        actionwords.iTakeCoffeeNumberCoffees(40);
        // And I fill the beans tank
        actionwords.iFillTheBeansTank();
        // Then message "Ready" should be displayed
        actionwords.messageMessageShouldBeDisplayed("Ready");
    }
    //
    // Tags: priority:low
    public void testItIsPossibleToTake40CoffeesBeforeThereIsReallyNoMoreBeans() {
        // When I take "40" coffees
        actionwords.iTakeCoffeeNumberCoffees(40);
        // Then coffee should be served
        actionwords.coffeeShouldBeServed();
        // When I take a coffee
        actionwords.iTakeACoffee();
        // Then coffee should not be served
        actionwords.coffeeShouldNotBeServed();
        // And message "Fill beans" should be displayed
        actionwords.messageMessageShouldBeDisplayed("Fill beans");
    }
    // You keep getting coffee even if the "Empty grounds" message is displayed. That said it's not a fantastic idea, you'll get ground everywhere when you'll decide to empty it.
    // Tags: priority:low
    public void testFullGroundsDoesNotBlockCoffee() {
        // Given the coffee machine is started
        actionwords.theCoffeeMachineIsStarted();
        // And I handle everything except the grounds
        actionwords.iHandleEverythingExceptTheGrounds();
        // When I take "50" coffees
        actionwords.iTakeCoffeeNumberCoffees(50);
        // Then message "Empty grounds" should be displayed
        actionwords.messageMessageShouldBeDisplayed("Empty grounds");
        // And coffee should be served
        actionwords.coffeeShouldBeServed();
    }
    //
    // Tags: priority:high
    public void testMessageFillWaterTankIsDisplayedAfter50CoffeesAreTaken() {
        // When I take "50" coffees
        actionwords.iTakeCoffeeNumberCoffees(50);
        // Then message "Fill tank" should be displayed
        actionwords.messageMessageShouldBeDisplayed("Fill tank");
    }
    //
    // Tags: priority:high
    public void testMessageFillBeansIsDisplayedAfter38CoffeesAreTaken() {
        // When I take "38" coffees
        actionwords.iTakeCoffeeNumberCoffees(38);
        // Then message "Fill beans" should be displayed
        actionwords.messageMessageShouldBeDisplayed("Fill beans");
    }
    //
    // Tags: priority:medium
    public void testDisplaySettings() {
        // Given the coffee machine is started
        actionwords.theCoffeeMachineIsStarted();
        // When I switch to settings mode
        actionwords.iSwitchToSettingsMode();
        // Then displayed message is:
        actionwords.displayedMessageIs("Settings:\n - 1: water hardness\n - 2: grinder");
    }
    //
    // Tags: priority:high
    public void testDefaultSettings() {
        // Given the coffee machine is started
        actionwords.theCoffeeMachineIsStarted();
        // When I switch to settings mode
        actionwords.iSwitchToSettingsMode();
        // Then settings should be:
        actionwords.settingsShouldBe("| water hardness | 2      |\n| grinder        | medium |");
    }
    //
    // Tags: priority:medium
    public void testNoMessagesAreDisplayedWhenMachineIsShutDown() {
        // Given the coffee machine is started
        actionwords.theCoffeeMachineIsStarted();
        // When I shutdown the coffee machine
        actionwords.iShutdownTheCoffeeMachine();
        // Then message "" should be displayed
        actionwords.messageMessageShouldBeDisplayed("");
    }
    // Well, sometimes, you just get a coffee.
    // Tags: priority:high
    public void testSimpleUse() {
        // Given the coffee machine is started
        actionwords.theCoffeeMachineIsStarted();
        // When I take a coffee
        actionwords.iTakeACoffee();
        // Then coffee should be served
        actionwords.coffeeShouldBeServed();
    }
    //
    // Tags: priority:high
    public void testMessageEmptyGroundsIsDisplayedAfter30CoffeesAreTaken() {
        // When I take "30" coffees
        actionwords.iTakeCoffeeNumberCoffees(30);
        // Then message "Empty grounds" should be displayed
        actionwords.messageMessageShouldBeDisplayed("Empty grounds");
    }

    public void testDescalingIsNeededAfter500Coffees() {
        // Given I handle coffee grounds
        actionwords.iHandleCoffeeGrounds();
        // And I handle water tank
        actionwords.iHandleWaterTank();
        // And I handle beans
        actionwords.iHandleBeans();
        // When I take "500" coffees
        actionwords.iTakeCoffeeNumberCoffees("500");
        // Then message "Descaling" should be displayed
        actionwords.messageMessageShouldBeDisplayed("Descaling");
    }
}