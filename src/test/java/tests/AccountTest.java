package tests;

import models.Account;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class AccountTest extends BaseTest {
    @Test(description = "Account page is opened successfully")
    public void accountsPageOpenedSuccessfully() {
        boolean isOpened = loginPage
                .open()
                .isPageOpened();
        assertTrue(isOpened, "Страница логина не открылась");
        loginPage
                .login(USER, PASSWORD)
                .isPageOpened();
        assertTrue(isOpened, "Home Page не открылась");
    }

    @Test(description = "Test that new contact was created")
    public void newAccountIsCreated() {
        loginPage
                .open()
                .login(USER, PASSWORD);
        Account account = new Account("Antonio", "+323432423", "site.by", "+48765444", "Analyst",
                "Soxbase", "20", "5", "description", "billing St.", "shipping St.",
                "Minsk", "Minsk", "Minsk", "Minsk", "1234568", "Belarus", "0988765",
                "Belarus");
        accountListPage
                .open()
                .clickNew()
                .create(account);
        accountModal.save();
        assertTrue(accountListPage.accountIsCreated("Vlad"), "Account wasn't created");

    }

    @Test(description = "Test that new account contain correct data")
    public void dataInCreatedAccountIsCorrect() {
        loginPage
                .open()
                .login(USER, PASSWORD);
        Account account = new Account("Antonio", "+323432423", "site.by", "+48765444", "Analyst",
                "Soxbase", "20", "5", "description", "billing St.", "shipping St.",
                "Minsk", "Minsk", "Minsk", "Minsk", "1234568", "Belarus", "0988765",
                "Belarus");
        accountListPage
                .open()
                .clickNew()
                .create(account);
        accountModal.save();
        accountDetailsPage.validateAccount(account);
    }
}