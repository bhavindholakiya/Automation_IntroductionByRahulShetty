package WebDriverListeners;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;

import java.lang.reflect.Method;

public class WebDriverListeners implements WebDriverListener {

    @Override
    public void beforeClick(WebElement element) {
        WebDriverListener.super.beforeClick(element);
        System.out.println("Before click "+element);
    }

    @Override
    public void afterClick(WebElement element) {
        WebDriverListener.super.afterClick(element);
        System.out.println("After click "+element);
    }

    @Override
    public void beforeSendKeys(WebElement element, CharSequence... keysToSend) {
        WebDriverListener.super.beforeSendKeys(element, keysToSend);
        System.out.println("Before set value of "+ element.getAttribute("value"));
    }

    @Override
    public void afterSendKeys(WebElement element, CharSequence... keysToSend) {
        WebDriverListener.super.afterSendKeys(element, keysToSend);
        System.out.println("Before set value of "+ element.getAttribute("value"));
    }
}
