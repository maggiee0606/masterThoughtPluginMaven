package com.automation.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
    @Given("user open website")
    public void user_open_website() {
        System.out.println("Open website");
    }

    @Given("verify user is on login page")
    public void verify_user_is_on_login_page() {
        System.out.println("Do login");

    }
    @When("user enter valid credentials")
    public void user_enter_valid_credentials() {
        System.out.println("Enter valid credentials");

    }
    @Then("verify home page is displayed")
    public void verify_home_page_is_displayed() {
        System.out.println("Verify login successful");

    }
    @When("user enter invalid credentials")
    public void user_enter_invalid_credentials() {
        System.out.println("Invalid credentials");
    }
    @Then("verify invalid login error message is displayed")
    public void verify_invalid_login_error_message_is_displayed() {
        System.out.println("Page with error message displayed");
    }

    @When("user search with TV")
    public void user_search_with_tv() {
        System.out.println("TV display");
        
    }
    @Then("verify user is on product listing page")
    public void verify_user_is_on_product_listing_page() {
        System.out.println("User is on product page");
        
    }
    @When("user click on the first product from the list")
    public void user_click_on_the_first_product_from_the_list() {
        System.out.println("User able to click on product");
    }
    @Then("verify user is on product detail page")
    public void verify_user_is_on_product_detail_page() {
        System.out.println("User is on product page ");
    }
    @When("user click on add to cart button")
    public void user_click_on_add_to_cart_button() {
        System.out.println("User is able to click on add button");
    }
    @Then("verify cart page is display")
    public void verify_cart_page_is_display() {
        System.out.println("Cart page display");
    }
    @Then("verify item on the cart page")
    public void verify_item_on_the_cart_page() {
        System.out.println("Item on the cart page");
    }
    @When("user remove item from the cart")
    public void user_remove_item_from_the_cart() {
        System.out.println("Able to remove item");
    }

    @Then("verify no item present in the cart")
    public void verify_no_item_present_in_the_cart() {
        System.out.println("No item present");
    }

    @When("user change quantity in the cart of the item")
    public void user_change_quantity_in_the_cart_of_the_item() {
        System.out.println("Able to change quantity");
    }

    @Then("verify total quantity updated on the cart")
    public void verify_total_quantity_updated_on_the_cart() {
        System.out.println("Quantity updated");
    }

    @And("close browser")
    public void closeBrowser() {
    }
}
