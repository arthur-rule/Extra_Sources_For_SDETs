package Java.Extra_Sources.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Captcha {

    public static <ChromeOptions> void main(String[] args) {

        /*

        How to handle Captcha in Selenium

        As technology has become embedded in today’s world, digital security has been a major concern and for good reason. Hackers use bots to operate web applications and access data such as user email addresses that lead to spamming, posing threats to privacy.

A measure to prevent such bot activity is to use Captcha (Completely Automated Public Turing test to tell Computers and Humans Apart). It is quite commonly used, which is why testers often search for means to test Captcha via Selenium.

For testers seeking tips on testing “Selenium Captcha”, “Selenium ReCaptcha” and wondering “how to handle captcha in selenium”, this article will help. It will discuss how Captcha can be tested via Selenium by QA engineers.

What is Captcha?
Through Captcha, the user is asked to perform a certain task, such as enter the text written in the image or click on the images from a set of different images that match the required criteria.

These tasks are meant to ascertain whether the user is a human or a bot. Since the task is dynamic, it can only successfully be carried out with human cognizance and correct interpretation of information – areas where the artificial intelligence of bots tends to fail.

Some variants of Captcha also support visually impaired individuals by generating audio instead of images.

Google’s open-source CAPTCHA widget, reCAPTCHA is widely used, since it supports major screen readers such as JAWS and NVDA for IE, Edge, or Chrome on Windows OS, ChromeVox for Chrome OS, and VoiceOver for Safari and Chrome on Mac OS.

Handling Captcha Enabled Web Applications in Selenium
For web applications with Captcha enabled, automated UI testing could be an issue, especially as the step involving Captcha can create a hindrance in a test scenario. Moreover, the idea of Captcha itself does not align with automation, as doing so will defeat the purpose of prohibiting bots from performing activities on the application.

Thus, it is essential to efficiently handle Captcha in Selenium Testing to ensure that tests run seamlessly without any bottlenecks.

While automating Captcha is not the best practice, there are three efficient ways of handling Captcha in Selenium:

By disabling the Captcha in the testing environment
Adding a hook to click the Captcha checkbox
By adding a delay to the Webdriver and manually solve Captcha while testing
How to Disable Captcha in the Test Environment
Disabling Captcha in the test environment would ensure that while testing a web application, the Captcha task is not required. While using Google’s open-source Captcha widget – reCAPTCHA v2, put in the Site Key and the Secret Key, (known as the test keys).  As a result, all verification requests will pass, and automated UI testing can be conducted seamlessly.

Site key: 6LeIxAcTAAAAAJcZVRqyHh71UMIEGNQ_MXjiZKhI
Secret key: 6LeIxAcTAAAAAGG-vFI1TnRWxMZNFuojJ4WifJWe
However, while doing so, the reCAPTCHA widget will show a warning alert that ensures that the CAPTCHA is bypassed only for testing purposes and not in real-time access by users.

In the case of reCAPTCHA v3, the user needs to create a separate key for testing environments. Unlike reCAPTCHA v2, which has a generic testing key to support, reCAPTCHA v3 requires creating separate keys for the testing environment. Users can create keys for reCAPTCHA v3.

It is recommended to create one site key per web or mobile application. However, one can create separate site keys for staging and production environments. This is because there is a risk of contaminating reCAPTCHA risk analysis with the data from the test environment, which might alter the results of the analysis.

How to click the checkbox in reCaptcha during Selenium testing
By adding a hook to the code, users can bypass the Captcha while performing Automation Testing. The Captcha recognizes a bot clicking the checkbox element by the fact that it takes less time for the bot to click as compared to humans. Therefore, testers need to induce WebDriverWait, so that the element is clicked only when it becomes clickable. This bypasses the Captcha.

Here’s the code to add a hook that clicks on reCAPTCHA using Selenium and Java:

public class ReCaptcha_click {

public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:\\Utility\\BrowserDrivers\\chromedriver.exe");

ChromeOptions options = new ChromeOptions();

options.addArguments("start-maximized");

options.addArguments("disable-infobars");

options.addArguments("--disable-extensions");

WebDriver driver = new ChromeDriver(options);

driver.get("https://rsps100.com/vote/760");

new WebDriverWait(driver, 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]")));

new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.recaptcha-checkbox-checkmark"))).click();

}

}

How to add delay and manually solve Captcha during Automation Testing
Firstly, this method is not completely automated and requires human intervention to solve the Captcha. Call it a semi-automated test.

In this method, a delay of 10-20s is introduced to freeze the captcha screen, so that the page does not suffer from the race condition, which generally happens while using automation testing on a web page with a Captcha element.

This is because automation testing is much faster than the focus on reCAPTCHA. Thereby, the password is entered much before the reCAPTCHA element even gets ready, leading to flaky tests.

By adding a delay to the testing, it ensures that by the time reCAPTCHA is ready, the form fill-up action waits and the racing condition can be evaded tactfully, streamlining the test and making it more accurate.

To delay execution of Selenium Webdriver for 10 seconds using Python, use the following command 


import time

time.sleep(10)

Here’s how delay can be added using Puppeteer for headless browsers:

const puppeteer = require('puppeteer');

const chromeOptions = {

 headless:false,

 defaultViewport: null};

(async function main() {

 const browser = await puppeteer.launch(chromeOptions);

 const page = await browser.newPage();

 await page.goto('https://old.reddit.com/login');

})()

await page.type('#user_reg', 'some_username');

await page.type('#passwd_reg', 'SuperStrongP@ssw0rd');

await page.type('#passwd2_reg', 'SuperStrongP@ssw0rd');

await page.click('#register-form button[type=submit]');

const chromeOptions = {

 headless:false,

 defaultViewport: null,

 slowMo:15,

};

Captcha, which has been an important UI element to restrict bots from accessing a web application, has posed a major challenge for the testers performing UI testing using Selenium.

Since automating Captcha would defeat the purpose of having Captcha in the first place to ensure human interaction with the UI, it is very tricky to handle Captcha in Selenium.
However, with the test keys and hook, it is possible to ensure that the Captcha does not hamper UI testing. Captcha handling in Selenium is a mandatory skill of QAs because of how frequently Captcha is used as a security measure.

Ideally, it is recommended as a best practice to separate the test cases involving Captcha and run them separately. Additionally, if the tests are not conducted on the live code that is deployed already, then the testers could disable the Captcha module when they perform automated UI testing.

Bear in mind that Selenium tests must be run on real devices for accurate results. Start running tests on 2000+ real browsers and devices on BrowserStack’s real device cloud. Run parallel tests on a Cloud Selenium Grid to get faster results without compromising on accuracy. Testers can also conduct Cypress testing on 30+ real browser versions across Windows and macOS. Detect bugs before users do by testing software in real user conditions with BrowserStack.
*/



            }

        }